# ==============================================================================
# 機能      基本操作用perlスクリプト
#             ファイル操作のための基本オペレーションを支援するスクリプト
# 作成者    S.Saika
# 作成日付  2005-12-27
# 改版履歴  1.00 2005-12-22 S.Saika 初版作成
#
# 版符号    1.00
# ==============================================================================

# 再起的に目的のディレクトリを作成する
sub nestMkDir {
	local($dir , $mode) = @_;
	local($find);
	if ( ! -e $dir) {
		$find = rindex($dir,'/',length($dir));
		&nestMkDir(substr($dir,0,$find), $mode);
	} 
	mkdir($dir, $mode); 
}

# 文字列中のコメントと思われる個所を間引く
# "#", "//"をコメントとする 
sub del_comment {
	local($val) = @_;
	
	local($find_ofs,$len);
	$find_ofs = index($val,'#');
	if ( $find_ofs ne -1 )
	{
		$val = substr($val,0,$find_ofs);
	}
	
	$find_ofs = index($val,'//');
	if ( $find_ofs ne -1 )
	{
		$val = substr($val,0,$find_ofs);
	}

# DOSでは;がパス区切り文字になっているのでコメントにしないように修正
	#$find_ofs = index($val,';');
	#if ( $find_ofs ne -1 )
	#{
		#$val = substr($val,0,$find_ofs);
	#}
	
	$val;
}

# 大文字に変換
sub Upper{
	local($str) = @_;
	local($ret);
	$ret = $str;
	$ret =~ tr/a-z/A-Z/;
	$ret;
}

# 小文字に変換
sub Lower {
	local($str) = @_;
	local($ret);
	$ret = $str;
	$ret =~ tr/A-Z/a-z/;
	$ret;
}



# getdir(c:\mcf) 
# 指定されたディレクトリ配下の配列を返す
sub getdir{
	local($dir) = @_ ;
	local($_, $fullpath, *DIR,@DIRs);

	$fullpath = "$Home/$dir";

	#opendir(DIR, $fullpath)	|| die "Failed to chdir to $fullpath\n" ;
	if ( opendir(DIR, $fullpath) ){
	
	while( $_ = readdir(DIR) )
	{		
		if ( $_ ne '.' && $_ ne '..' && (-d "$fullpath/$_") ) {
		  		#print "--- $dir/$_ ---\n" ;
				push(@DIRs, "$dir/$_") ;
				&getdir("$dir/$_");
		}
	}
	closedir(DIR);
	}
	@DIRs;
}

# get_files(c:\mcf\mcframe\bean, java)
# 指定されたディレクトリのファイル一覧を返す
# さらに、ファイル拡張子を指定された場合には
# 指定された拡張子のものだけを返す
sub get_files{
	local($dir ,$ext) = @_ ;
	local($_, *DIR, @Files);
	#opendir(DIR, $dir) || die "Faild to chdir to $dir\n";
	if (opendir(DIR, $dir) ){
	while ( $_ = readdir(DIR) )
	{
		if ( (-f "$dir/$_") && !(-d "$dir/$_") && $_ ne '.' && $_ ne '..' )
		{
			#print "--- $_ ----\n";
			
			if ( $ext ne "" )
			{
				if ( /$ext$/ )
				{
					push(@Files, $_);
				}
			}
			else
			{
				push(@Files, $_);
			}
		}
	}
	}
	@Files;
}


# 配列をJOINする
sub ArrayJoin{
	local(@array1,@array2) = @_;
	local(@Ret,$item);

	foreach $item (@array1)
	{
		push (@Ret,$item);
	}

	foreach $item (@array2)
	{
		push (@Ret,$item);
	}
	@Ret;
}

sub get_nestdirs {
	local($dir) = @_;
	local($_,$fullpath, *DIR,@DIRs, @subDIRs ,$subDIRName);
		
	$fullpath = "$dir";
	if ( opendir(DIR, $fullpath) ) {
		while( $_ = readdir(DIR) ) {		
			if ( $_ ne '.' && $_ ne '..' && (-d "$fullpath/$_") ) {
				push(@DIRs, "$dir/$_") ;
				@subDIRs = &get_nestdirs("$dir/$_");
				foreach $subDIRName(@subDIRs) {
					push(@DIRs, $subDIRName);
				}
			}
		}
		closedir(DIR);
	}
	@DIRs;
}

#
# 指定された拡張子のファイルの存在チェック
#
sub existExt {
	local($CheckDir, $SearchExt) = @_;
	local($_, *DIR, $ret );

	if ( opendir(DIR,$CheckDir) ) {
		while ( $_ = readdir(DIR) ) {
			if ( ( -f "$CheckDir/$_" ) && 
				!( -d "$CheckDir/$_" ) && 
				$_ ne '.' && 
				$_ ne '..' 
			   ) {
				if ( /$SearchExt$/ ) {
					$ret = "true";
					return $ret;
				}
			}
		} // while ( $_ = readdir(DIR) )
	}
}


sub existDir {
	local($CheckDir) = @_;
    local(*DIR,$ret);

	if ( opendir(DIR,$CheckDir) ) {
        $ret = "true";
		return $ret;
    } else {
        $ret = "false";
        return $ret;
    }
}


#文字列の置換
# $from...置換前文字列
# $to.....置換後文字列 
# $str....置換対象文字列 
sub replace {
	local($from, $to, $str) = @_;
	local($ret);
	$ret = $str;
	$ret =~ s/$from/$to/g;
	$ret;
}

#文字列の置換
# $from...置換前文字列
# $to.....置換後文字列 
# $str....置換対象文字列 
# $index..置換開始位置
sub replace2 {
	local($from, $to, $str, $index) = @_;
	local($ret,$rstr);
	$ret = substr($str,1,((length $str) -  $index));
	$ret = substr($str,1,5);
	$rstr = substr($str,0,$index);
	$ret =~ s/$from/$to/g ;
	$rstr.$ret;
}


