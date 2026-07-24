-- spool mkcs.log
WHENEVER SQLERROR EXIT SQL.SQLCODE

conn &2/&3@&4

@makeAll.sql
@ins_version.sql

exit