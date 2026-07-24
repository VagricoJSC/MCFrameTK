# ==============================================================================
# 機能      CONST_SETUPを実行するperlスクリプト
#           １．mcframe.iniより定数定義を読み取りFCC_COMMONPARMに登録する
#           ２．mcframe.iniに指定されるmsgtbl.datを読み取りFCT_MSGに登録する
#           ３．INVALIDな状態のDBオブジェクトを再コンパイルする
# 作成者    S.Saika
# 作成日付  2005-12-27
# 改版履歴  1.00 2005-12-22 S.Saika 初版作成
#           1.01 2006-01-12 A.Miyake msgtbl.datが見つからない場合は終了コード1で
#                                    終了するように修正
#
# 版符号    1.01
# ==============================================================================


#!/usr/bin/perl

# メッセージ定義テーブル(FCT_MSG)のMSGIDの桁数上限
$msgid_len = 10;

do "lib/envlib.pl";
do "lib/mclib.pl";

&loadEnvFile;
$compile_bat;
local ($section2,$section, @sections, @keys, $key, $value, $dbUser, $dbPass, $dbName, $dbCon, $sqlPath,  $msgid,$msg);

@sections = &getSections;

if ( &existDir("./src") eq "false" ) {
	&nestMkDir("./src", 755);
}

foreach $section (@sections) {
	$section2 = $section;
	$section2 =~ s/\[//g; 
	$section2 =~ s/\]//g;
	$section2 = &Lower($section2);
	$dbUser = &getValue("","DB_USER");
	$dbPass = &getValue("","DB_PASS");
	$dbName = &getValue("","DB_NAME");
	$dbCon = $dbUser." ".$dbPass." ".$dbName;

	if ( ($section2 cmp "msgtbl") != 0 ) {
		$compile_bat = $compile_bat."sqlplus /nolog @src/FCC_COMMONPARAM_INS_".$section2.".sql ".$dbCon."\n";

		open(OFP, ">./src/FCC_COMMONPARAM_INS_".$section2.".sql");
		$section2 = &Upper($section2);
		print OFP "WHENEVER SQLERROR EXIT SQL.SQLCODE\n";
		print OFP "conn &1/&2@&3\n";
		print OFP "set head off linesize 150\n\n";

		#開始する処理名を記述
		print OFP "\nselect \'START LOADING FCC_COMMONPARM RECORDS\' from dual;\n\n";

		@keys = &getKeys($section);
		foreach $key (@keys) {
				$value = &getValue($section, $key);
				# デリート
				print OFP "DELETE FROM FCC_COMMONPARAM ";
				print OFP "WHERE CLASS_ID = \'".$section2."\' ";
				print OFP "AND CODE = \'".$key."\';\n";
				# インサート
				print OFP "INSERT INTO FCC_COMMONPARAM (CLASS_ID,CODE,NAME,DESCRIPTION,NOTE,STR_VAL,NUM_VAL) VALUES(\n";
				print OFP "\t\'".$section2."\',\n";	#CLASS       → セクションを編集
				print OFP "\t\'".$key."\',\n";		#CODE        → キーを編集
				print OFP "\t\'".$key."\',\n";		#NAME        → キーを編集
				print OFP "\t\' \',\n";				#DESCRIPTION → ブランク
				print OFP "\t\' \',\n";			#NOTE        → ブランク
				if ($key eq "AppMax" || $key eq "DevMax") {
					print OFP "\t\' \',\n";				#STR_VAL     → ブランク
					print OFP "\t".$value.");\n";	#NUM_VAL     → 値を編集
				}
				else {
					print OFP "\t\'".$value."\',\n";	#STR_VAL     → 値を編集
					print OFP "\t\ 0 );\n";				#NUM_VAL     → 0 を編集
				}
		}
		print OFP "\nEXIT\n";
		close(OFP);
	}
	else
	{
	}
}

$sqlPath = &getValue("","DBSQL_DIR");
# $compile_bat = $compile_bat."sqlplus /nolog @".$sqlPath."/fcpa_manager.sql ".$dbCon."\n";
# $compile_bat = $compile_bat."sqlplus /nolog @".$sqlPath."/fcpa_manager_body.sql ".$dbCon."\n";
$compile_bat = $compile_bat."sqlplus /nolog @src/exec_fcpa_manager.sql ".$dbCon."\n";

open(OFP, ">compile.bat");
print OFP $compile_bat;
close (OFP);

open(OFP, ">src/exec_fcpa_manager.sql");
print OFP "WHENEVER SQLERROR EXIT SQL.SQLCODE\n";
print OFP "conn &1/&2@&3\n";
print OFP "set head off linesize 150\n\n";

#開始する処理名を記述
print OFP "\nselect \'COMPILE INVALID DB OBJECTS\' from dual;\n\n";

print OFP "alter package fcpa_manager compile;\n";
print OFP "exec fcpa_manager.p_recompile\n";
print OFP "exit";
close (OFP);


sub load_msgtbl{
	local($msgfile,@msgs) = @_;
	local($msg);

	open(MFP,$msgfile);
	while ( <MFP> ) {
		chop;
		#MSGID と MSGに代入
		$_ = &del_comment($_); 
		if ( $_ ne "" ) {
			split(/=/, $_, 2);
			($msgid, $msg ) = @_;

			$msgid=~ s/\s//g;

			# デリート

#					print OFP "WHERE MSGIG = \'".$msgid."\';\n";
			push (@msgs, "DELETE FROM FCT_MSG WHERE MSGIG = \'".$msgid."\';\n");

			# インサート
#					print OFP "INSERT INTO FCT_MSG (MSGID,MSG) VALUES(\n";
#					print OFP "\t\'".$msgid."\',\n";	#MSGID → メッセージIDを編集
#					print OFP "\t\'".$msg."\');\n";		#MSG   → メッセージを編集
			push (@msgs, "INSERT INTO FCT_MSG (MSGID,MSG) VALUES(\n\t\'".$msgid."\',\n\t\'".$msg."\');\n");
		}
	}
	close(MFP);

	@msgs;
}
