# ==============================================================================
# 機能      key=value形式のファイルを読み取るperlスクリプト
#             mcframe.iniのようなsection, key, valueを持つファイル
#             を読み取り、配列に保存する。
#             section,keyを指定することでvalueを取得する
# 作成者    S.Saika
# 作成日付  2005-12-22
# 改版履歴  1.00 2005-12-22 S.Saika 初版作成
#
# 版符号    1.00
# ==============================================================================
do "mclib.pl";

sub getValue {
	local($section, $key) = @_;
	local($ret);
	local($count, $lsection, $lkey, $item, @lenv);
	$ret = "";
	
	# まずは環境変数に設定されていないかをチェック
	$ret = $ENV{$key};
	return $ret if ($ret ne "");

	@lenv = &ArrayJoin(@lenv, @genv);
	for ($i = 0 ;$i < scalar(@genv);$i++)
	{
		$item = pop(@lenv);
		$lkey = pop(@lenv);
		$lsection = pop(@lenv);
		if ( (($lsection cmp $section) eq 0) && (($lkey cmp $key) eq 0 )) 
		{
			$ret = $item;
			last;
		}
	}
#	die "unkown enviroment [$section:$key]\n" if ($ret eq "" );
	$ret;
}

sub getSections {
	local(@sections);
	local($prev, $section, @lenv);

	@lenv = &ArrayJoin(@lenv, @genv);
	$prev = "";
	for (;scalar(@lenv) > 0;)
	{
		$section = pop(@lenv);
		$section = pop(@lenv);
		$section = pop(@lenv);
		if ( $prev eq "" )
		{
			push (@sections, $section);
			$prev = $section;
			next;
		}

		if ( ($prev cmp $section) ne 0 )
		{
			push (@sections, $section);
			$prev = $section;
			next;
		}
	}

	@sections;
}

sub getKeys {
	local($section) = @_;
	local($key, $lsection, @lenv, @keys);
	@lenv = &ArrayJoin(@lenv, @genv);
	for (;scalar(@lenv) > 0;) 
	{
		pop(@lenv);
		$key = pop(@lenv);
		$lsection = pop(@lenv);
		#print "$section<->$lsection:$key\n";
		if ( ($lsection cmp $section) eq 0 ) {
			push (@keys, $key);
		}
	}
	@keys;
}

sub loadEnvFile {
	@genv = &load_env;
	#print "読み込まれたデータ\n";
	#foreach $item (@genv) {
	#	print $item."\n";
	#}
}

#環境ファイルを読み込んでキーだけの配列を作って返す
sub load_env2 {
	local($section) = @_ ;
	local(*FP, $_, $KEY, $VAL, $CONST_INI, $IsREAD, @env);
	$CONST_INI = $ENV{'CONST_INI'};
	if ( $CONST_INI eq "" ) {
		$CONST_INI = "./mcconst.ini";
	}
	die "Section is Null\n" if ( $section eq "" ) ;
	die "Not Found File[$CONST_INI]\n" if ( ! -e $CONST_INI ) ;
	#print "SECTION:[$section]\n";
	open(FP,$CONST_INI);
	while ( <FP> ) {
		chop;
		if ( ($_ cmp $section) eq 0 ) {
			$IsREAD = "TRUE";
		} else { 
			$_ = &del_comment($_); 
			$IsREAD = "FALSE" if ( ($IsREAD cmp "TRUE") eq 0 && /\[/ ) ;
			if ( ($IsREAD cmp "TRUE") eq 0 && $_ ne "" ) {
				split(/=/);
				($key, $val ) = @_;
				$key=~ s/\s//g;
				push(@env,$section);
				push(@env,$key);
				push(@env,$val);
				#print "<$key>";
	 		  #print "$val\n";
			} 
		}
	} 
	close(FP); 
	@env;
}


# 環境ファイルを読み込んでハッシュテーブルを作成しそれを返す
sub load_env {
	local(*FP, $_, $section, $KEY, $VAL, $CONST_INI, $IsREAD, @env);
	$CONST_INI = $ENV{'CONST_INI'};
	if ( $CONST_INI eq "" ) {
		$CONST_INI = "./mcconst.ini";
	}
	die "Not Found File[$CONST_INI]\n" if ( ! -e $CONST_INI ) ;
	open(FP,$CONST_INI);
	while ( <FP> ) {
		chop;
	  if ( /^\[/ && /\]$/ ) {
			$section = $_;
			#print "$section\n";
			@env = &ArrayJoin(@env, &load_env2($section));
		}
  }
	@env;
}
