
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Jordan Price
 */
public class DataIO {

    // behaviors
    public void add(Customer cust) throws IOException {
        // open or create the file object using true to "APPEND" the data
        BufferedWriter outfile = new BufferedWriter(new FileWriter("Customers.txt", true));

        // write the object's data to the file on one line using # as separators
        outfile.write(cust.getName());
        outfile.write("#" + cust.getAddress());
        outfile.write("#" + cust.getYardType());
        outfile.write("#" + cust.getLength());
        outfile.write("#" + cust.getWidth());
        outfile.write("#" + cust.getTotalCost());
        outfile.newLine();  //"enter" key

        //close the file
        outfile.close();
    }

    public void delete(String deleteName) throws IOException {
        // get all records
        ArrayList<Customer> customers = getList();

        // delete the old file
        File oldFile = new File("Customers.txt");
        if (oldFile.exists() == false) {
            throw new IOException("File does not exist!");
        }
        oldFile.delete();

        // write "good" records to the file
        for (Customer cust : customers) // foreach loops checks each cust in the customers arraylist
        {
            if (deleteName.equalsIgnoreCase(cust.getName()) == false) {
                // good record so write it to the file
                add(cust);
            }
        }
    }

    public ArrayList<Customer> getList() throws IOException, FileNotFoundException {
        // get Customer objects from the file and return as ArrayList
        //create an arraylist
        ArrayList<Customer> customers = new ArrayList<Customer>();

        // read data from the file
        BufferedReader inbuffer = new BufferedReader(new FileReader("Customers.txt"));
        StringTokenizer tokens;

        //get first line
        String inputString = inbuffer.readLine();
        while (inputString != null) {
            //break the line into pieces using Tokenizer
            tokens = new StringTokenizer(inputString, "#");

            //fields are name#address#yardType#length#width#totalCost
            String name = tokens.nextToken();
            String address = tokens.nextToken();
            String yardType = tokens.nextToken();
            double length = Double.parseDouble(tokens.nextToken());
            double width = Double.parseDouble(tokens.nextToken());
            double totalCost = Double.parseDouble(tokens.nextToken());

            // create Customer object and add it to the ArrayList
            Customer cust = new Customer(0, name, address, yardType, length, width, totalCost);
            customers.add(cust);

            //read next line
            inputString = inbuffer.readLine();
        }

        // close the pipe to the file once the records have been read
        inbuffer.close();

        // return the ArrayList
        return customers;
    }
}
