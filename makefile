
# In GCP

# Install Java
sudo mkdir -p /usr/lib/jvm
sudo tar zxvf jdk-8u65-linux-x64.tar.gz -C /usr/lib/jvm
sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk1.8.0_version/bin/java" 1

UDP : 
# export DS_HW_UDP_SERVER as ServerSocket.jar file
# export DS_HW_UDP_CLIENT as ClientSocket.jar file
# Upload above jars to GCP Instanse
# Run the below command

nohup java -jar ServerSocket.jar &
nohup java -jar ClientSocket.jar &

# Change values of IP address and output file names in DS_HW_UDP_CLIENT for 3 different scenarios and repeat above steps

# download output files to local

GCP :
# Create client and Server stubs using grpc proto file present in 'grpc' and 'grpcClient' project folders
# export grpc as GRPCServer.jar file
# export grpcClient as GRPCClient.jar file
# Upload above jars to GCP Instanse
# Run the below command

nohup java -jar GRPCServer.jar &
nohup java -jar GRPCClient.jar &

PLOTS : 

# Jupyter notebook file has 3 different blocks for questions 1,3,4
# install Ananconda
# open file 'PlotGraphsFile.ipynb' in browser and run it.

