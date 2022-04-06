# Cloudera
## Check if server is running
`service cloudera-scm-server status`

## To start the cloudera:
`sudo /home/cloudera/cloudera-manager --force --express`
	
	http://quickstart.cloudera:7180
	
	username: cloudera
	password: cloudera
	
## Directories related to Cloudera
`cd /usr/lib/`

`cd /opt/cloudera/`

# Hadoop
## Components of Hadoop:
	- The first component of Hadoop that is, Hadoop Distributed File System (HDFS) is responsible for storing the file. 
	- The second component that is, Map Reduce is responsible for processing the file.
	
### two main components of hdfs:
	namenode - master (only 1 in each cluster)
	datanode - slave

## HDFS Commands
- hdfs stands for hadoop distributed file system
- Commands start with hdfs dfs or hadoop dfs
- Example - `hdfs dfs -ls /` //list out all the files of the root directory

	`hdfs dfs -touchz /bigdatatesting/test.dat`   //create empty file in dfs

	`ls` - display list of files and directories
	
	`mkdir` - create the directory
	
	`jps` - to print hadoop processes
	
	`fsck` - to check the health of the hadoop file system
	
	`cat` - reads a file and prints the contents of the file
	
	`touchz` - create a file with 0 bytes of size
	
	`du` - size of the file
	
	`appendToFile` - appends the contents to given destination file
	
	`copyFromLocal(put)` - copy a file from local filesystem to HDFS
	
	`copyToLocal(get)` - copy a file from HDFS to local filesystem
	
	`test` - used for file test operations (gives 1 if it exists and has length more than zero)
	
	`checksum` - checking the checksum of a file
	
	`hadoop fs -cat filein /user/cloudera` : check for the files
	

 wordcount: 
 
 `hadoop jar /usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar wordcount <input file name> <output file name>`

	
# SQL:
## to check the status of mysql service:
	`sudo service mysqld status`
## to login to mysql:
	`mysql -u root -h localhost -p`
## SQL commands- 
	 `show databases`
	
	 `use <database_name>`
	
	 `create database <database_name>`
	
	 `show tables`
	 
	 `create table <table_name>`
	 
	 `desc <table_name>` or `describe <table_name>` :show table description
	 
	 `insert into <table_name> values ()`
	 
	 `select * from <table_name>`
	 
	 `alter table <table_name> add columns(<column_name> <data_type>)` #add new column
	 
	 `alter table <table_name> change column <column_name> after <column_name>` #change column position
	 
	 `ALTER TABLE <table_name> RENAME TO <new_table_name>;` #Rename a table name
	 
	
	
# SQOOP:
	1. List Tables: `sqoop list -tables`
	
	2. Import: `sqoop import --connect jdbc:mysql://<path> --username <username> --table <table_name> --target-dir`
	
	3. Run quickly SQL queries: `sqoop eval --connect --query "SQL Query"`
	
	4. List databases: `sqoop list -database --connect`
	
	
# HIVE:
	- designed for Online Transaction Processing (OLTP). 
	- OLTP is the systems that facilitate high volume data in very less time with no reliance on the single server.
	- It is fast, scalable and reliable.
	- The SQL type querying language provided here is called HiveQL or HQL.
	
- Hive commands same as SQL Queries.
	
 ## Limitations of Hive:
    - Hive doesn’t support subqueries.
    - Hive surely supports over-writing, but unfortunately, it doesn’t support deletion and updates.
    - Hive is not designed for OLTP, but it is used for it.

	
