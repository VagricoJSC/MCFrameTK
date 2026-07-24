package mcframe.serverPFBZ.PFBZL0010;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

	/**
	 * Export and import IF 送受信ＩＦ.<p>
	 *
	 */
	public static final String $sdrvIf = "sdrvIf";
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public static final String $if_proc_typ_nm = "if_proc_typ_nm";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * Exporting and importing status type name 送受信状況区分名.<p>
	 *
	 */
	public static final String $sdrv_sts_typ_nm = "sdrv_sts_typ_nm";
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public static final String $ifFile = "ifFile";

	public static final String $not_send_flg = $sdrvIf + ".not_send_flg";
	public static final String $not_send_upd_flg = $sdrvIf + ".not_send_upd_flg";
	public static final String $if_proc_typ = $sdrvIf + ".if_proc_typ";
	public static final String $data_no = $sdrvIf + ".data_no";
	public static final String $ext_sys_cd = $sdrvIf + ".ext_sys_cd";
	public static final String $rmrks_t = $sdrvIf + ".sdrv_if_rmrks";
	public static final String $sdrv_sts_typ = $sdrvIf + ".sdrv_sts_typ";
	public static final String $ins_ts = $sdrvIf + ".ins_ts";
	public static final String $sdrv_tm = $sdrvIf + ".sdrv_tm";
	public static final String $conv_ope = $sdrvIf + ".conv_ope";
	public static final String $file_io_ope = $sdrvIf + ".file_io_ope";
	public static final String $web_api_ope = $sdrvIf + ".web_api_ope";
	public static final String $cmd_exec_ope = $sdrvIf + ".cmd_exec_ope";
	public static final String $sdrv_clt_id = $sdrvIf + ".sdrv_clt_id";
	public static final String $sdrv_usr_id = $sdrvIf + ".sdrv_usr_id";
	public static final String $sdrv_usr_nm = $sdrvIf + ".sdrv_usr_nm";
	public static final String $attr_char1 = $sdrvIf + ".attr_char1";
	public static final String $attr_char2 = $sdrvIf + ".attr_char2";
	public static final String $attr_char3 = $sdrvIf + ".attr_char3";
	public static final String $attr_char4 = $sdrvIf + ".attr_char4";
	public static final String $attr_char5 = $sdrvIf + ".attr_char5";
	public static final String $attr_char6 = $sdrvIf + ".attr_char6";
	public static final String $attr_char7 = $sdrvIf + ".attr_char7";
	public static final String $attr_char8 = $sdrvIf + ".attr_char8";
	public static final String $attr_char9 = $sdrvIf + ".attr_char9";
	public static final String $attr_char10 = $sdrvIf + ".attr_char10";
	public static final String $attr_char11 = $sdrvIf + ".attr_char11";
	public static final String $attr_char12 = $sdrvIf + ".attr_char12";
	public static final String $attr_char13 = $sdrvIf + ".attr_char13";
	public static final String $attr_char14 = $sdrvIf + ".attr_char14";
	public static final String $attr_char15 = $sdrvIf + ".attr_char15";
	public static final String $attr_char16 = $sdrvIf + ".attr_char16";
	public static final String $attr_char17 = $sdrvIf + ".attr_char17";
	public static final String $attr_char18 = $sdrvIf + ".attr_char18";
	public static final String $attr_char19 = $sdrvIf + ".attr_char19";
	public static final String $attr_char20 = $sdrvIf + ".attr_char20";
	public static final String $attr_char21 = $sdrvIf + ".attr_char21";
	public static final String $attr_char22 = $sdrvIf + ".attr_char22";
	public static final String $attr_char23 = $sdrvIf + ".attr_char23";
	public static final String $attr_char24 = $sdrvIf + ".attr_char24";
	public static final String $attr_char25 = $sdrvIf + ".attr_char25";
	public static final String $attr_char26 = $sdrvIf + ".attr_char26";
	public static final String $attr_char27 = $sdrvIf + ".attr_char27";
	public static final String $attr_char28 = $sdrvIf + ".attr_char28";
	public static final String $attr_char29 = $sdrvIf + ".attr_char29";
	public static final String $attr_char30 = $sdrvIf + ".attr_char30";
	public static final String $attr_num1 = $sdrvIf + ".attr_num1";
	public static final String $attr_num2 = $sdrvIf + ".attr_num2";
	public static final String $attr_num3 = $sdrvIf + ".attr_num3";
	public static final String $attr_num4 = $sdrvIf + ".attr_num4";
	public static final String $attr_num5 = $sdrvIf + ".attr_num5";
	public static final String $attr_dt1 = $sdrvIf + ".attr_dt1";
	public static final String $attr_dt2 = $sdrvIf + ".attr_dt2";
	public static final String $attr_dt3 = $sdrvIf + ".attr_dt3";
	public static final String $attr_dt4 = $sdrvIf + ".attr_dt4";
	public static final String $attr_dt5 = $sdrvIf + ".attr_dt5";
	public static final String $attr_tm1 = $sdrvIf + ".attr_tm1";
	public static final String $attr_tm2 = $sdrvIf + ".attr_tm2";
	public static final String $attr_tm3 = $sdrvIf + ".attr_tm3";
	public static final String $attr_tm4 = $sdrvIf + ".attr_tm4";
	public static final String $attr_tm5 = $sdrvIf + ".attr_tm5";
	public static final String $batch_log_no = $sdrvIf + ".batch_log_no";
	public static final String $log_sub_key1 = $sdrvIf + ".log_sub_key1";
	public static final String $log_sub_key2 = $sdrvIf + ".log_sub_key2";
	public static final String $file_id = $ifFile + ".file_id";
	public static final String $file_path = $ifFile + ".file_path";
	public static final String $file_nm = $ifFile + ".file_nm";

	public static final MCMeta sdrvIf_META = createInnerRowMeta($sdrvIf, mcframe.serverPF.dbc.PFT_SDRV_IF_R.class);
	public static final MCMeta if_proc_typ_nm_META = createCommonMeta($if_proc_typ_nm, mcframe.commonMA.meta.MA_META.IF_PROC_TYP_NM);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta sdrv_sts_typ_nm_META = createCommonMeta($sdrv_sts_typ_nm, mcframe.commonMA.meta.MA_META.SDRV_STS_TYP_NM);
	public static final MCMeta ifFile_META = createInnerRowMeta($ifFile, mcframe.serverPF.dbc.PFT_IF_FILE_R.class);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sdrvIf_META,
			if_proc_typ_nm_META,
			ext_sys_nm_META,
			sdrv_sts_typ_nm_META,
			ifFile_META
		},
		new String[][]{
			{
				"not_send_flg",
				"not_send_upd_flg",
				"if_proc_typ",
				"data_no",
				"ext_sys_cd",
				"rmrks_t",
				"sdrv_sts_typ",
				"ins_ts",
				"sdrv_tm",
				"conv_ope",
				"file_io_ope",
				"web_api_ope",
				"cmd_exec_ope",
				"sdrv_clt_id",
				"sdrv_usr_id",
				"sdrv_usr_nm",
				"attr_char1",
				"attr_char2",
				"attr_char3",
				"attr_char4",
				"attr_char5",
				"attr_char6",
				"attr_char7",
				"attr_char8",
				"attr_char9",
				"attr_char10",
				"attr_char11",
				"attr_char12",
				"attr_char13",
				"attr_char14",
				"attr_char15",
				"attr_char16",
				"attr_char17",
				"attr_char18",
				"attr_char19",
				"attr_char20",
				"attr_char21",
				"attr_char22",
				"attr_char23",
				"attr_char24",
				"attr_char25",
				"attr_char26",
				"attr_char27",
				"attr_char28",
				"attr_char29",
				"attr_char30",
				"attr_num1",
				"attr_num2",
				"attr_num3",
				"attr_num4",
				"attr_num5",
				"attr_dt1",
				"attr_dt2",
				"attr_dt3",
				"attr_dt4",
				"attr_dt5",
				"attr_tm1",
				"attr_tm2",
				"attr_tm3",
				"attr_tm4",
				"attr_tm5",
				"batch_log_no",
				"log_sub_key1",
				"log_sub_key2",
				"file_id",
				"file_path",
				"file_nm"
			},
			{
				$not_send_flg,
				$not_send_upd_flg,
				$if_proc_typ,
				$data_no,
				$ext_sys_cd,
				$rmrks_t,
				$sdrv_sts_typ,
				$ins_ts,
				$sdrv_tm,
				$conv_ope,
				$file_io_ope,
				$web_api_ope,
				$cmd_exec_ope,
				$sdrv_clt_id,
				$sdrv_usr_id,
				$sdrv_usr_nm,
				$attr_char1,
				$attr_char2,
				$attr_char3,
				$attr_char4,
				$attr_char5,
				$attr_char6,
				$attr_char7,
				$attr_char8,
				$attr_char9,
				$attr_char10,
				$attr_char11,
				$attr_char12,
				$attr_char13,
				$attr_char14,
				$attr_char15,
				$attr_char16,
				$attr_char17,
				$attr_char18,
				$attr_char19,
				$attr_char20,
				$attr_char21,
				$attr_char22,
				$attr_char23,
				$attr_char24,
				$attr_char25,
				$attr_char26,
				$attr_char27,
				$attr_char28,
				$attr_char29,
				$attr_char30,
				$attr_num1,
				$attr_num2,
				$attr_num3,
				$attr_num4,
				$attr_num5,
				$attr_dt1,
				$attr_dt2,
				$attr_dt3,
				$attr_dt4,
				$attr_dt5,
				$attr_tm1,
				$attr_tm2,
				$attr_tm3,
				$attr_tm4,
				$attr_tm5,
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Export and import IF 送受信ＩＦ.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_SDRV_IF_R sdrvIf(){
		return (mcframe.serverPF.dbc.PFT_SDRV_IF_R) getConstInnerRow(offset + 0, $sdrvIf);
	}
	
	/**
	 * Export and import IF 送受信ＩＦ.<p>
	 *
	 */
	public void sdrvIf(mcframe.serverPF.dbc.PFT_SDRV_IF_R row){
		setConstInnerRow(offset + 0, $sdrvIf, row);
	}


	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public String if_proc_typ_nm() {
		return getConstString(offset + 1, $if_proc_typ_nm);
	}

	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public void if_proc_typ_nm(String value) {
		setConstString(offset + 1, $if_proc_typ_nm, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 2, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 2, $ext_sys_nm, value);
	}


	/**
	 * Exporting and importing status type name 送受信状況区分名.<p>
	 *
	 */
	public String sdrv_sts_typ_nm() {
		return getConstString(offset + 3, $sdrv_sts_typ_nm);
	}

	/**
	 * Exporting and importing status type name 送受信状況区分名.<p>
	 *
	 */
	public void sdrv_sts_typ_nm(String value) {
		setConstString(offset + 3, $sdrv_sts_typ_nm, value);
	}


	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public mcframe.serverPF.dbc.PFT_IF_FILE_R ifFile(){
		return (mcframe.serverPF.dbc.PFT_IF_FILE_R) getConstInnerRow(offset + 4, $ifFile);
	}
	
	/**
	 * IF file ＩＦファイル.<p>
	 *
	 */
	public void ifFile(mcframe.serverPF.dbc.PFT_IF_FILE_R row){
		setConstInnerRow(offset + 4, $ifFile, row);
	}


	public String getString(String name) {
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			return if_proc_typ_nm();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($sdrv_sts_typ_nm.equalsIgnoreCase(name)) {
			return sdrv_sts_typ_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			return if_proc_typ_nm();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($sdrv_sts_typ_nm.equalsIgnoreCase(name)) {
			return sdrv_sts_typ_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			if_proc_typ_nm(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($sdrv_sts_typ_nm.equalsIgnoreCase(name)) {
			sdrv_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			if_proc_typ_nm(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($sdrv_sts_typ_nm.equalsIgnoreCase(name)) {
			sdrv_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
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
	 * Not to be exported 送信対象外.<p>
	 *
	 */
	public boolean not_send_flg() {
		return sdrvIf().not_send_flg();
	}

	/**
	 * Not to be exported 送信対象外.<p>
	 *
	 */
	public void not_send_flg(boolean value) {
		sdrvIf().not_send_flg(value);
	}

	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public boolean not_send_upd_flg() {
		return sdrvIf().not_send_upd_flg();
	}

	/**
	 * Uncorrectable after exporting 送信後訂正不可.<p>
	 *
	 */
	public void not_send_upd_flg(boolean value) {
		sdrvIf().not_send_upd_flg(value);
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
	 * Exporting info. 送信情報.<p>
	 *
	 */
	public String rmrks_t() {
		return sdrvIf().sdrv_if_rmrks();
	}

	/**
	 * Exporting info. 送信情報.<p>
	 *
	 */
	public void rmrks_t(String value) {
		sdrvIf().sdrv_if_rmrks(value);
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
	 * Creation date and time 作成日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return sdrvIf().ins_ts();
	}

	/**
	 * Creation date and time 作成日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		sdrvIf().ins_ts(value);
	}

	/**
	 * Sending date and time 送信日時.<p>
	 *
	 */
	public MCDate sdrv_tm() {
		return sdrvIf().sdrv_tm();
	}

	/**
	 * Sending date and time 送信日時.<p>
	 *
	 */
	public void sdrv_tm(MCDate value) {
		sdrvIf().sdrv_tm(value);
	}

	/**
	 * Code convert operation コード変換オペレーション.<p>
	 *
	 */
	public String conv_ope() {
		return sdrvIf().conv_ope();
	}

	/**
	 * Code convert operation コード変換オペレーション.<p>
	 *
	 */
	public void conv_ope(String value) {
		sdrvIf().conv_ope(value);
	}

	/**
	 * File I/O operations ファイル入出力オペレーション.<p>
	 *
	 */
	public String file_io_ope() {
		return sdrvIf().file_io_ope();
	}

	/**
	 * File I/O operations ファイル入出力オペレーション.<p>
	 *
	 */
	public void file_io_ope(String value) {
		sdrvIf().file_io_ope(value);
	}

	/**
	 * Web API operation ＷｅｂＡＰＩオペレーション.<p>
	 *
	 */
	public String web_api_ope() {
		return sdrvIf().web_api_ope();
	}

	/**
	 * Web API operation ＷｅｂＡＰＩオペレーション.<p>
	 *
	 */
	public void web_api_ope(String value) {
		sdrvIf().web_api_ope(value);
	}

	/**
	 * Command execution operation コマンド実行オペレーション.<p>
	 *
	 */
	public String cmd_exec_ope() {
		return sdrvIf().cmd_exec_ope();
	}

	/**
	 * Command execution operation コマンド実行オペレーション.<p>
	 *
	 */
	public void cmd_exec_ope(String value) {
		sdrvIf().cmd_exec_ope(value);
	}

	/**
	 * Exporting/importing client ID 送受信クライアントＩＤ.<p>
	 *
	 */
	public String sdrv_clt_id() {
		return sdrvIf().sdrv_clt_id();
	}

	/**
	 * Exporting/importing client ID 送受信クライアントＩＤ.<p>
	 *
	 */
	public void sdrv_clt_id(String value) {
		sdrvIf().sdrv_clt_id(value);
	}

	/**
	 * Exporting/importing user ID 送受信ユーザＩＤ.<p>
	 *
	 */
	public String sdrv_usr_id() {
		return sdrvIf().sdrv_usr_id();
	}

	/**
	 * Exporting/importing user ID 送受信ユーザＩＤ.<p>
	 *
	 */
	public void sdrv_usr_id(String value) {
		sdrvIf().sdrv_usr_id(value);
	}

	/**
	 * Exporting/importing user name 送受信ユーザ名.<p>
	 *
	 */
	public String sdrv_usr_nm() {
		return sdrvIf().sdrv_usr_nm();
	}

	/**
	 * Exporting/importing user name 送受信ユーザ名.<p>
	 *
	 */
	public void sdrv_usr_nm(String value) {
		sdrvIf().sdrv_usr_nm(value);
	}

	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public String attr_char1() {
		return sdrvIf().attr_char1();
	}

	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public void attr_char1(String value) {
		sdrvIf().attr_char1(value);
	}

	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public String attr_char2() {
		return sdrvIf().attr_char2();
	}

	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public void attr_char2(String value) {
		sdrvIf().attr_char2(value);
	}

	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public String attr_char3() {
		return sdrvIf().attr_char3();
	}

	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public void attr_char3(String value) {
		sdrvIf().attr_char3(value);
	}

	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public String attr_char4() {
		return sdrvIf().attr_char4();
	}

	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public void attr_char4(String value) {
		sdrvIf().attr_char4(value);
	}

	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public String attr_char5() {
		return sdrvIf().attr_char5();
	}

	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public void attr_char5(String value) {
		sdrvIf().attr_char5(value);
	}

	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public String attr_char6() {
		return sdrvIf().attr_char6();
	}

	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public void attr_char6(String value) {
		sdrvIf().attr_char6(value);
	}

	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public String attr_char7() {
		return sdrvIf().attr_char7();
	}

	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public void attr_char7(String value) {
		sdrvIf().attr_char7(value);
	}

	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public String attr_char8() {
		return sdrvIf().attr_char8();
	}

	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public void attr_char8(String value) {
		sdrvIf().attr_char8(value);
	}

	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public String attr_char9() {
		return sdrvIf().attr_char9();
	}

	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public void attr_char9(String value) {
		sdrvIf().attr_char9(value);
	}

	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public String attr_char10() {
		return sdrvIf().attr_char10();
	}

	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public void attr_char10(String value) {
		sdrvIf().attr_char10(value);
	}

	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public String attr_char11() {
		return sdrvIf().attr_char11();
	}

	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public void attr_char11(String value) {
		sdrvIf().attr_char11(value);
	}

	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public String attr_char12() {
		return sdrvIf().attr_char12();
	}

	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public void attr_char12(String value) {
		sdrvIf().attr_char12(value);
	}

	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public String attr_char13() {
		return sdrvIf().attr_char13();
	}

	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public void attr_char13(String value) {
		sdrvIf().attr_char13(value);
	}

	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public String attr_char14() {
		return sdrvIf().attr_char14();
	}

	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public void attr_char14(String value) {
		sdrvIf().attr_char14(value);
	}

	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public String attr_char15() {
		return sdrvIf().attr_char15();
	}

	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public void attr_char15(String value) {
		sdrvIf().attr_char15(value);
	}

	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public String attr_char16() {
		return sdrvIf().attr_char16();
	}

	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public void attr_char16(String value) {
		sdrvIf().attr_char16(value);
	}

	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public String attr_char17() {
		return sdrvIf().attr_char17();
	}

	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public void attr_char17(String value) {
		sdrvIf().attr_char17(value);
	}

	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public String attr_char18() {
		return sdrvIf().attr_char18();
	}

	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public void attr_char18(String value) {
		sdrvIf().attr_char18(value);
	}

	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public String attr_char19() {
		return sdrvIf().attr_char19();
	}

	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public void attr_char19(String value) {
		sdrvIf().attr_char19(value);
	}

	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public String attr_char20() {
		return sdrvIf().attr_char20();
	}

	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public void attr_char20(String value) {
		sdrvIf().attr_char20(value);
	}

	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public String attr_char21() {
		return sdrvIf().attr_char21();
	}

	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public void attr_char21(String value) {
		sdrvIf().attr_char21(value);
	}

	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public String attr_char22() {
		return sdrvIf().attr_char22();
	}

	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public void attr_char22(String value) {
		sdrvIf().attr_char22(value);
	}

	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public String attr_char23() {
		return sdrvIf().attr_char23();
	}

	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public void attr_char23(String value) {
		sdrvIf().attr_char23(value);
	}

	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public String attr_char24() {
		return sdrvIf().attr_char24();
	}

	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public void attr_char24(String value) {
		sdrvIf().attr_char24(value);
	}

	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public String attr_char25() {
		return sdrvIf().attr_char25();
	}

	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public void attr_char25(String value) {
		sdrvIf().attr_char25(value);
	}

	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public String attr_char26() {
		return sdrvIf().attr_char26();
	}

	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public void attr_char26(String value) {
		sdrvIf().attr_char26(value);
	}

	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public String attr_char27() {
		return sdrvIf().attr_char27();
	}

	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public void attr_char27(String value) {
		sdrvIf().attr_char27(value);
	}

	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public String attr_char28() {
		return sdrvIf().attr_char28();
	}

	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public void attr_char28(String value) {
		sdrvIf().attr_char28(value);
	}

	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public String attr_char29() {
		return sdrvIf().attr_char29();
	}

	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public void attr_char29(String value) {
		sdrvIf().attr_char29(value);
	}

	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public String attr_char30() {
		return sdrvIf().attr_char30();
	}

	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public void attr_char30(String value) {
		sdrvIf().attr_char30(value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public MCNumber attr_num1() {
		return sdrvIf().attr_num1();
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(MCNumber value) {
		sdrvIf().attr_num1(value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(int value) {
		sdrvIf().attr_num1(value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(long value) {
		sdrvIf().attr_num1(value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(float value) {
		sdrvIf().attr_num1(value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(double value) {
		sdrvIf().attr_num1(value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public MCNumber attr_num2() {
		return sdrvIf().attr_num2();
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(MCNumber value) {
		sdrvIf().attr_num2(value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(int value) {
		sdrvIf().attr_num2(value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(long value) {
		sdrvIf().attr_num2(value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(float value) {
		sdrvIf().attr_num2(value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(double value) {
		sdrvIf().attr_num2(value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public MCNumber attr_num3() {
		return sdrvIf().attr_num3();
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(MCNumber value) {
		sdrvIf().attr_num3(value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(int value) {
		sdrvIf().attr_num3(value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(long value) {
		sdrvIf().attr_num3(value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(float value) {
		sdrvIf().attr_num3(value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(double value) {
		sdrvIf().attr_num3(value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public MCNumber attr_num4() {
		return sdrvIf().attr_num4();
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(MCNumber value) {
		sdrvIf().attr_num4(value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(int value) {
		sdrvIf().attr_num4(value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(long value) {
		sdrvIf().attr_num4(value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(float value) {
		sdrvIf().attr_num4(value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(double value) {
		sdrvIf().attr_num4(value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public MCNumber attr_num5() {
		return sdrvIf().attr_num5();
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(MCNumber value) {
		sdrvIf().attr_num5(value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(int value) {
		sdrvIf().attr_num5(value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(long value) {
		sdrvIf().attr_num5(value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(float value) {
		sdrvIf().attr_num5(value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(double value) {
		sdrvIf().attr_num5(value);
	}

	/**
	 * Business info. date 1 業務情報日付１.<p>
	 *
	 */
	public MCDate attr_dt1() {
		return sdrvIf().attr_dt1();
	}

	/**
	 * Business info. date 1 業務情報日付１.<p>
	 *
	 */
	public void attr_dt1(MCDate value) {
		sdrvIf().attr_dt1(value);
	}

	/**
	 * Business info. date 2 業務情報日付２.<p>
	 *
	 */
	public MCDate attr_dt2() {
		return sdrvIf().attr_dt2();
	}

	/**
	 * Business info. date 2 業務情報日付２.<p>
	 *
	 */
	public void attr_dt2(MCDate value) {
		sdrvIf().attr_dt2(value);
	}

	/**
	 * Business info. date 3 業務情報日付３.<p>
	 *
	 */
	public MCDate attr_dt3() {
		return sdrvIf().attr_dt3();
	}

	/**
	 * Business info. date 3 業務情報日付３.<p>
	 *
	 */
	public void attr_dt3(MCDate value) {
		sdrvIf().attr_dt3(value);
	}

	/**
	 * Business info. date 4 業務情報日付４.<p>
	 *
	 */
	public MCDate attr_dt4() {
		return sdrvIf().attr_dt4();
	}

	/**
	 * Business info. date 4 業務情報日付４.<p>
	 *
	 */
	public void attr_dt4(MCDate value) {
		sdrvIf().attr_dt4(value);
	}

	/**
	 * Business info. date 5 業務情報日付５.<p>
	 *
	 */
	public MCDate attr_dt5() {
		return sdrvIf().attr_dt5();
	}

	/**
	 * Business info. date 5 業務情報日付５.<p>
	 *
	 */
	public void attr_dt5(MCDate value) {
		sdrvIf().attr_dt5(value);
	}

	/**
	 * Business info. date and time 1 業務情報日時１.<p>
	 *
	 */
	public MCDate attr_tm1() {
		return sdrvIf().attr_tm1();
	}

	/**
	 * Business info. date and time 1 業務情報日時１.<p>
	 *
	 */
	public void attr_tm1(MCDate value) {
		sdrvIf().attr_tm1(value);
	}

	/**
	 * Business info. date and time 2 業務情報日時２.<p>
	 *
	 */
	public MCDate attr_tm2() {
		return sdrvIf().attr_tm2();
	}

	/**
	 * Business info. date and time 2 業務情報日時２.<p>
	 *
	 */
	public void attr_tm2(MCDate value) {
		sdrvIf().attr_tm2(value);
	}

	/**
	 * Business info. date and time 3 業務情報日時３.<p>
	 *
	 */
	public MCDate attr_tm3() {
		return sdrvIf().attr_tm3();
	}

	/**
	 * Business info. date and time 3 業務情報日時３.<p>
	 *
	 */
	public void attr_tm3(MCDate value) {
		sdrvIf().attr_tm3(value);
	}

	/**
	 * Business info. date and time 4 業務情報日時４.<p>
	 *
	 */
	public MCDate attr_tm4() {
		return sdrvIf().attr_tm4();
	}

	/**
	 * Business info. date and time 4 業務情報日時４.<p>
	 *
	 */
	public void attr_tm4(MCDate value) {
		sdrvIf().attr_tm4(value);
	}

	/**
	 * Business info. date and time 5 業務情報日時５.<p>
	 *
	 */
	public MCDate attr_tm5() {
		return sdrvIf().attr_tm5();
	}

	/**
	 * Business info. date and time 5 業務情報日時５.<p>
	 *
	 */
	public void attr_tm5(MCDate value) {
		sdrvIf().attr_tm5(value);
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

