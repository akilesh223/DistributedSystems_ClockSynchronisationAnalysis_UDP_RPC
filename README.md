# DistributedSystems_ClockSynchronisationAnalysis_UDP_RPC

Step 1 : Install Java on the 3 GCP istances created (2 on same region, 1 on different region)
Step 2 : Import the 4 java proejcts into your local
Step 3 : Change the preferances in java projects like which scenarios and export them as jar files 
Step 4 : Upload the jar files based on whether client or server to GCP instances
Step 5 : Run the server specific jar file first using the command in makefile and then client specific jar file as well.
Step 6 : After 2 hours , output_* files are generated .
Step 7 : Downlaod them for further analysis
Step 8 : Import those files into jupyter notebook for calculation of other parameters 