package mcframe.serverPFBZ.PFBZL9050;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch02_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch02_DtlR_MC_A extends MCConstRow {

	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public static final String $sdrvIf = "sdrvIf";
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public static final String $ifFile = "ifFile";
	/**
	 * Remote directory リモートディレクトリ.<p>
	 *
	 */
	public static final String $remote_dir = "remote_dir";
	/**
	 * Transfer lock type 転送ロックタイプ.<p>
	 *
	 */
	public static final String $transfer_lock_typ = "transfer_lock_typ";
	/**
	 * Status file suffix ステータスファイル接尾辞.<p>
	 *
	 */
	public static final String $sts_fsuffix = "sts_fsuffix";
	/**
	 * FTP host ＦＴＰホスト.<p>
	 *
	 */
	public static final String $ftp_host = "ftp_host";
	/**
	 * FTP user ＦＴＰユーザ.<p>
	 *
	 */
	public static final String $ftp_user = "ftp_user";
	/**
	 * FTP password ＦＴＰパスワード.<p>
	 *
	 */
	public static final String $ftp_password = "ftp_password";
	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public static final String $ftp_port = "ftp_port";
	/**
	 * FTP mode ＦＴＰモード.<p>
	 *
	 */
	public static final String $ftp_mode = "ftp_mode";
	/**
	 * FTP option ＦＴＰオプション.<p>
	 *
	 */
	public static final String $ftp_opts = "ftp_opts";
	/**
	 * SFTP host ＳＦＴＰホスト.<p>
	 *
	 */
	public static final String $sftp_host = "sftp_host";
	/**
	 * SFTP user ＳＦＴＰユーザ.<p>
	 *
	 */
	public static final String $sftp_user = "sftp_user";
	/**
	 * SFTP password ＳＦＴＰパスワード.<p>
	 *
	 */
	public static final String $sftp_password = "sftp_password";
	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public static final String $sftp_port = "sftp_port";
	/**
	 * Path of the SFTP private key file ＳＦＴＰ秘密鍵ファイルパス.<p>
	 *
	 */
	public static final String $sftp_key_file_path = "sftp_key_file_path";

	public static final String $if_proc_typ = $sdrvIf + ".if_proc_typ";
	public static final String $data_no = $sdrvIf + ".data_no";
	public static final String $ext_sys_cd = $sdrvIf + ".ext_sys_cd";
	public static final String $sdrv_sts_typ = $sdrvIf + ".sdrv_sts_typ";
	public static final String $batch_log_no = $sdrvIf + ".batch_log_no";
	public static final String $log_sub_key1 = $sdrvIf + ".log_sub_key1";
	public static final String $log_sub_key2 = $sdrvIf + ".log_sub_key2";
	public static final String $file_id = $ifFile + ".file_id";
	public static final String $file_path = $ifFile + ".file_path";
	public static final String $file_nm = $ifFile + ".file_nm";

	public static final MCMeta sdrvIf_META = createInnerRowMeta($sdrvIf, mcframe.serverPF.dbc.PFT_SDRV_IF_R.class);
	public static final MCMeta ifFile_META = createInnerRowMeta($ifFile, mcframe.serverPF.dbc.PFT_IF_FILE_R.class);
	public static final MCMeta remote_dir_META = createCommonMeta($remote_dir, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta transfer_lock_typ_META = createCommonMeta($transfer_lock_typ, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta sts_fsuffix_META = createCommonMeta($sts_fsuffix, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta ftp_host_META = createCommonMeta($ftp_host, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta ftp_user_META = createCommonMeta($ftp_user, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta ftp_password_META = createCommonMeta($ftp_password, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta ftp_port_META = createCommonMeta($ftp_port, mcframe.commonMA.meta.MA_META.VAR_NUM);
	public static final MCMeta ftp_mode_META = createCommonMeta($ftp_mode, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta ftp_opts_META = createCommonMeta($ftp_opts, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta sftp_host_META = createCommonMeta($sftp_host, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta sftp_user_META = createCommonMeta($sftp_user, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta sftp_password_META = createCommonMeta($sftp_password, mcframe.commonMA.meta.MA_META.VAR_STR);
	public static final MCMeta sftp_port_META = createCommonMeta($sftp_port, mcframe.commonMA.meta.MA_META.VAR_NUM);
	public static final MCMeta sftp_key_file_path_META = createCommonMeta($sftp_key_file_path, mcframe.commonMA.meta.MA_META.VAR_STR);

	protected static final ConstMetaList<Srch02_DtlR> constMetas = new ConstMetaList<Srch02_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdrvIf_META,
			ifFile_META,
			remote_dir_META,
			transfer_lock_typ_META,
			sts_fsuffix_META,
			ftp_host_META,
			ftp_user_META,
			ftp_password_META,
			ftp_port_META,
			ftp_mode_META,
			ftp_opts_META,
			sftp_host_META,
			sftp_user_META,
			sftp_password_META,
			sftp_port_META,
			sftp_key_file_path_META
		},
		new String[][]{
			{
				"if_proc_typ",
				"data_no",
				"ext_sys_cd",
				"sdrv_sts_typ",
				"batch_log_no",
				"log_sub_key1",
				"log_sub_key2",
				"file_id",
				"file_path",
				"file_nm"
			},
			{
				$if_proc_typ,
				$data_no,
				$ext_sys_cd,
				$sdrv_sts_typ,
				$batch_log_no,
				$log_sub_key1,
				$log_sub_key2,
				$file_id,
				$file_path,
				$file_nm
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
	);

	/**
	 * クラスに定義されている固定カラム名を配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラム名の配列
	 */
	public static String[] colnames() {
		return constMetas.toNameArray();
	}

	/**
	 * クラスに定義されている固定カラムメタを配列で返します。
	 *
	 * 並び順は定義順と同じです。
	 * 固定カラムがない場合は要素0の配列が返ります。
	 * 
	 * @return 固定カラムメタの配列
	 */
	public static MCMeta[] colmetas() {
		return constMetas.toMetaArray();
	}

	/**
	 * 実際のカラム位置を知るためオフセットです。
	 */
	private static final int offset = constMetas.offset();

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected Srch02_DtlR_MC_A(ConstMetaList<? extends Srch02_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR clone() {
		return (Srch02_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR createInstance() {
		return (Srch02_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch02_DtlR getValues(String... names) {
		return (Srch02_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_SDRV_IF_R sdrvIf(){
		return (mcframe.serverPF.dbc.PFT_SDRV_IF_R) getConstInnerRow(offset + 0, $sdrvIf);
	}
	
	/**
	 * Export IF 送信ＩＦ.<p>
	 *
	 */
	public void sdrvIf(mcframe.serverPF.dbc.PFT_SDRV_IF_R row){
		setConstInnerRow(offset + 0, $sdrvIf, row);
	}


	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_IF_FILE_R ifFile(){
		return (mcframe.serverPF.dbc.PFT_IF_FILE_R) getConstInnerRow(offset + 1, $ifFile);
	}
	
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public void ifFile(mcframe.serverPF.dbc.PFT_IF_FILE_R row){
		setConstInnerRow(offset + 1, $ifFile, row);
	}


	/**
	 * Remote directory リモートディレクトリ.<p>
	 *
	 */
	public String remote_dir() {
		return getConstString(offset + 2, $remote_dir);
	}

	/**
	 * Remote directory リモートディレクトリ.<p>
	 *
	 */
	public void remote_dir(String value) {
		setConstString(offset + 2, $remote_dir, value);
	}


	/**
	 * Transfer lock type 転送ロックタイプ.<p>
	 *
	 */
	public String transfer_lock_typ() {
		return getConstString(offset + 3, $transfer_lock_typ);
	}

	/**
	 * Transfer lock type 転送ロックタイプ.<p>
	 *
	 */
	public void transfer_lock_typ(String value) {
		setConstString(offset + 3, $transfer_lock_typ, value);
	}


	/**
	 * Status file suffix ステータスファイル接尾辞.<p>
	 *
	 */
	public String sts_fsuffix() {
		return getConstString(offset + 4, $sts_fsuffix);
	}

	/**
	 * Status file suffix ステータスファイル接尾辞.<p>
	 *
	 */
	public void sts_fsuffix(String value) {
		setConstString(offset + 4, $sts_fsuffix, value);
	}


	/**
	 * FTP host ＦＴＰホスト.<p>
	 *
	 */
	public String ftp_host() {
		return getConstString(offset + 5, $ftp_host);
	}

	/**
	 * FTP host ＦＴＰホスト.<p>
	 *
	 */
	public void ftp_host(String value) {
		setConstString(offset + 5, $ftp_host, value);
	}


	/**
	 * FTP user ＦＴＰユーザ.<p>
	 *
	 */
	public String ftp_user() {
		return getConstString(offset + 6, $ftp_user);
	}

	/**
	 * FTP user ＦＴＰユーザ.<p>
	 *
	 */
	public void ftp_user(String value) {
		setConstString(offset + 6, $ftp_user, value);
	}


	/**
	 * FTP password ＦＴＰパスワード.<p>
	 *
	 */
	public String ftp_password() {
		return getConstString(offset + 7, $ftp_password);
	}

	/**
	 * FTP password ＦＴＰパスワード.<p>
	 *
	 */
	public void ftp_password(String value) {
		setConstString(offset + 7, $ftp_password, value);
	}


	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public MCNumber ftp_port() {
		return getConstNumber(offset + 8, $ftp_port);
	}

	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public void ftp_port(MCNumber value) {
		setConstNumber(offset + 8, $ftp_port, value);
	}

	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public void ftp_port(int value) {
		setConstNumber(offset + 8, $ftp_port, value);
	}

	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public void ftp_port(long value) {
		setConstNumber(offset + 8, $ftp_port, value);
	}

	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public void ftp_port(float value) {
		setConstNumber(offset + 8, $ftp_port, value);
	}

	/**
	 * FTP port ＦＴＰポート.<p>
	 *
	 */
	public void ftp_port(double value) {
		setConstNumber(offset + 8, $ftp_port, value);
	}


	/**
	 * FTP mode ＦＴＰモード.<p>
	 *
	 */
	public String ftp_mode() {
		return getConstString(offset + 9, $ftp_mode);
	}

	/**
	 * FTP mode ＦＴＰモード.<p>
	 *
	 */
	public void ftp_mode(String value) {
		setConstString(offset + 9, $ftp_mode, value);
	}


	/**
	 * FTP option ＦＴＰオプション.<p>
	 *
	 */
	public String ftp_opts() {
		return getConstString(offset + 10, $ftp_opts);
	}

	/**
	 * FTP option ＦＴＰオプション.<p>
	 *
	 */
	public void ftp_opts(String value) {
		setConstString(offset + 10, $ftp_opts, value);
	}


	/**
	 * SFTP host ＳＦＴＰホスト.<p>
	 *
	 */
	public String sftp_host() {
		return getConstString(offset + 11, $sftp_host);
	}

	/**
	 * SFTP host ＳＦＴＰホスト.<p>
	 *
	 */
	public void sftp_host(String value) {
		setConstString(offset + 11, $sftp_host, value);
	}


	/**
	 * SFTP user ＳＦＴＰユーザ.<p>
	 *
	 */
	public String sftp_user() {
		return getConstString(offset + 12, $sftp_user);
	}

	/**
	 * SFTP user ＳＦＴＰユーザ.<p>
	 *
	 */
	public void sftp_user(String value) {
		setConstString(offset + 12, $sftp_user, value);
	}


	/**
	 * SFTP password ＳＦＴＰパスワード.<p>
	 *
	 */
	public String sftp_password() {
		return getConstString(offset + 13, $sftp_password);
	}

	/**
	 * SFTP password ＳＦＴＰパスワード.<p>
	 *
	 */
	public void sftp_password(String value) {
		setConstString(offset + 13, $sftp_password, value);
	}


	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public MCNumber sftp_port() {
		return getConstNumber(offset + 14, $sftp_port);
	}

	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public void sftp_port(MCNumber value) {
		setConstNumber(offset + 14, $sftp_port, value);
	}

	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public void sftp_port(int value) {
		setConstNumber(offset + 14, $sftp_port, value);
	}

	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public void sftp_port(long value) {
		setConstNumber(offset + 14, $sftp_port, value);
	}

	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public void sftp_port(float value) {
		setConstNumber(offset + 14, $sftp_port, value);
	}

	/**
	 * SFTP port ＳＦＴＰポート.<p>
	 *
	 */
	public void sftp_port(double value) {
		setConstNumber(offset + 14, $sftp_port, value);
	}


	/**
	 * Path of the SFTP private key file ＳＦＴＰ秘密鍵ファイルパス.<p>
	 *
	 */
	public String sftp_key_file_path() {
		return getConstString(offset + 15, $sftp_key_file_path);
	}

	/**
	 * Path of the SFTP private key file ＳＦＴＰ秘密鍵ファイルパス.<p>
	 *
	 */
	public void sftp_key_file_path(String value) {
		setConstString(offset + 15, $sftp_key_file_path, value);
	}


	public String getString(String name) {
		if ($remote_dir.equalsIgnoreCase(name)) {
			return remote_dir();
		}
		if ($transfer_lock_typ.equalsIgnoreCase(name)) {
			return transfer_lock_typ();
		}
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			return sts_fsuffix();
		}
		if ($ftp_host.equalsIgnoreCase(name)) {
			return ftp_host();
		}
		if ($ftp_user.equalsIgnoreCase(name)) {
			return ftp_user();
		}
		if ($ftp_password.equalsIgnoreCase(name)) {
			return ftp_password();
		}
		if ($ftp_mode.equalsIgnoreCase(name)) {
			return ftp_mode();
		}
		if ($ftp_opts.equalsIgnoreCase(name)) {
			return ftp_opts();
		}
		if ($sftp_host.equalsIgnoreCase(name)) {
			return sftp_host();
		}
		if ($sftp_user.equalsIgnoreCase(name)) {
			return sftp_user();
		}
		if ($sftp_password.equalsIgnoreCase(name)) {
			return sftp_password();
		}
		if ($sftp_key_file_path.equalsIgnoreCase(name)) {
			return sftp_key_file_path();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			return ftp_port();
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			return sftp_port();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($remote_dir.equalsIgnoreCase(name)) {
			return remote_dir();
		}
		if ($transfer_lock_typ.equalsIgnoreCase(name)) {
			return transfer_lock_typ();
		}
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			return sts_fsuffix();
		}
		if ($ftp_host.equalsIgnoreCase(name)) {
			return ftp_host();
		}
		if ($ftp_user.equalsIgnoreCase(name)) {
			return ftp_user();
		}
		if ($ftp_password.equalsIgnoreCase(name)) {
			return ftp_password();
		}
		if ($ftp_mode.equalsIgnoreCase(name)) {
			return ftp_mode();
		}
		if ($ftp_opts.equalsIgnoreCase(name)) {
			return ftp_opts();
		}
		if ($sftp_host.equalsIgnoreCase(name)) {
			return sftp_host();
		}
		if ($sftp_user.equalsIgnoreCase(name)) {
			return sftp_user();
		}
		if ($sftp_password.equalsIgnoreCase(name)) {
			return sftp_password();
		}
		if ($sftp_key_file_path.equalsIgnoreCase(name)) {
			return sftp_key_file_path();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			return ftp_port();
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			return sftp_port();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($remote_dir.equalsIgnoreCase(name)) {
			remote_dir(value);
			return;
		}
		if ($transfer_lock_typ.equalsIgnoreCase(name)) {
			transfer_lock_typ(value);
			return;
		}
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			sts_fsuffix(value);
			return;
		}
		if ($ftp_host.equalsIgnoreCase(name)) {
			ftp_host(value);
			return;
		}
		if ($ftp_user.equalsIgnoreCase(name)) {
			ftp_user(value);
			return;
		}
		if ($ftp_password.equalsIgnoreCase(name)) {
			ftp_password(value);
			return;
		}
		if ($ftp_mode.equalsIgnoreCase(name)) {
			ftp_mode(value);
			return;
		}
		if ($ftp_opts.equalsIgnoreCase(name)) {
			ftp_opts(value);
			return;
		}
		if ($sftp_host.equalsIgnoreCase(name)) {
			sftp_host(value);
			return;
		}
		if ($sftp_user.equalsIgnoreCase(name)) {
			sftp_user(value);
			return;
		}
		if ($sftp_password.equalsIgnoreCase(name)) {
			sftp_password(value);
			return;
		}
		if ($sftp_key_file_path.equalsIgnoreCase(name)) {
			sftp_key_file_path(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($remote_dir.equalsIgnoreCase(name)) {
			remote_dir(value);
			return;
		}
		if ($transfer_lock_typ.equalsIgnoreCase(name)) {
			transfer_lock_typ(value);
			return;
		}
		if ($sts_fsuffix.equalsIgnoreCase(name)) {
			sts_fsuffix(value);
			return;
		}
		if ($ftp_host.equalsIgnoreCase(name)) {
			ftp_host(value);
			return;
		}
		if ($ftp_user.equalsIgnoreCase(name)) {
			ftp_user(value);
			return;
		}
		if ($ftp_password.equalsIgnoreCase(name)) {
			ftp_password(value);
			return;
		}
		if ($ftp_mode.equalsIgnoreCase(name)) {
			ftp_mode(value);
			return;
		}
		if ($ftp_opts.equalsIgnoreCase(name)) {
			ftp_opts(value);
			return;
		}
		if ($sftp_host.equalsIgnoreCase(name)) {
			sftp_host(value);
			return;
		}
		if ($sftp_user.equalsIgnoreCase(name)) {
			sftp_user(value);
			return;
		}
		if ($sftp_password.equalsIgnoreCase(name)) {
			sftp_password(value);
			return;
		}
		if ($sftp_key_file_path.equalsIgnoreCase(name)) {
			sftp_key_file_path(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ftp_port.equalsIgnoreCase(name)) {
			ftp_port(value);
			return;
		}
		if ($sftp_port.equalsIgnoreCase(name)) {
			sftp_port(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sdrvIf.equalsIgnoreCase(name)) {
			return sdrvIf();
		}
		if ($ifFile.equalsIgnoreCase(name)) {
			return ifFile();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sdrvIf.equalsIgnoreCase(name)) {
			sdrvIf(
				((MCContainerMeta) sdrvIf_META).castInnerRow(mcframe.serverPF.dbc.PFT_SDRV_IF_R.class, value)
			);
			return;
		}
		if ($ifFile.equalsIgnoreCase(name)) {
			ifFile(
				((MCContainerMeta) ifFile_META).castInnerRow(mcframe.serverPF.dbc.PFT_IF_FILE_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return sdrvIf().if_proc_typ();
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		sdrvIf().if_proc_typ(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return sdrvIf().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		sdrvIf().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		sdrvIf().data_no(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return sdrvIf().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		sdrvIf().ext_sys_cd(value);
	}

	/**
	 * Exporting and importing status type 送受信状況区分.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return sdrvIf().sdrv_sts_typ();
	}

	/**
	 * Exporting and importing status type 送受信状況区分.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		sdrvIf().sdrv_sts_typ(value);
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return sdrvIf().batch_log_no();
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		sdrvIf().batch_log_no(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return sdrvIf().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		sdrvIf().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		sdrvIf().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		sdrvIf().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		sdrvIf().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		sdrvIf().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return sdrvIf().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		sdrvIf().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		sdrvIf().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		sdrvIf().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		sdrvIf().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		sdrvIf().log_sub_key2(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public MCNumber file_id() {
		return ifFile().file_id();
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(MCNumber value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(int value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(long value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(float value) {
		ifFile().file_id(value);
	}

	/**
	 * File ID ファイルＩＤ.<p>
	 *
	 */
	public void file_id(double value) {
		ifFile().file_id(value);
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return ifFile().file_path();
	}

	/**
	 * File path ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		ifFile().file_path(value);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return ifFile().file_nm();
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		ifFile().file_nm(value);
	}

}

