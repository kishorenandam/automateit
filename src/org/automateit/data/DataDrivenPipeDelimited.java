/**
 * This file is part of Automate It!'s free and open source web and mobile 
 * application testing framework.
 * 
 * Automate It! is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Automate It! is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Automate It!.  If not, see <http://www.gnu.org/licenses/>.
 **/

package org.automateit.data;

/**
 * This class allows for use of "|" Pipe Delimited file to provide input data to
 * a set of tests.
 * 
 * @author mburnside
 */
public class DataDrivenPipeDelimited extends DelimitedDataDrivenInputBase {
   
    /**
     * The delimiter to use for these types of files.
     */
    private final static String DELIMITER = "|";
    
    /**
     * Copy constructor.
     * 
     * @param filename
     * 
     * @throws Exception 
     */
    public DataDrivenPipeDelimited(String filename) throws Exception {

        super(filename, DELIMITER);
        
    }
   
}

