package mcframe.serverMBBE.MBBEL0060;

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
 * ブロック"Srch01_RsltBase"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltBaseR_MC_A extends MCConstRow {

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public static final String $biz_dat_nm = "biz_dat_nm";
	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public static final String $module_id = "module_id";
	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public static final String $logic_id = "logic_id";
	/**
	 * Function type 機能種別.<p>
	 *
	 */
	public static final String $func_actyp = "func_actyp";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $biz_dat_rmrks1 = "biz_dat_rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $biz_dat_rmrks2 = "biz_dat_rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $biz_dat_rmrks3 = "biz_dat_rmrks3";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public static final String $form_file_nm = "form_file_nm";
	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public static final String $cartridge = "cartridge";
	/**
	 * Cartridge name カートリッジ名.<p>
	 *
	 */
	public static final String $cartridge_nm = "cartridge_nm";
	/**
	 * Enable report output 帳票出力を有効にする.<p>
	 *
	 */
	public static final String $print_flg = "print_flg";
	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public static final String $dwnld_flg = "dwnld_flg";
	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public static final String $sql_src = "sql_src";


	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_nm_META = createCommonMeta($biz_dat_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_NM);
	public static final MCMeta module_id_META = createCommonMeta($module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta logic_id_META = createCommonMeta($logic_id, mcframe.commonMA.meta.MA_META.LOGIC_ID);
	public static final MCMeta func_actyp_META = createCommonMeta($func_actyp, mcframe.commonMA.meta.MA_META.FUNC_ACTYP);
	public static final MCMeta biz_dat_rmrks1_META = createCommonMeta($biz_dat_rmrks1, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks2_META = createCommonMeta($biz_dat_rmrks2, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks3_META = createCommonMeta($biz_dat_rmrks3, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta form_file_nm_META = createCommonMeta($form_file_nm, mcframe.commonMA.meta.MA_META.PRINT_FILE_NAME);
	public static final MCMeta cartridge_META = createCommonMeta($cartridge, mcframe.commonMA.meta.MA_META.CARTRIDGE);
	public static final MCMeta cartridge_nm_META = createCommonMeta($cartridge_nm, mcframe.commonMA.meta.MA_META.CARTRIDGE_NM);
	public static final MCMeta print_flg_META = createCommonMeta($print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dwnld_flg_META = createCommonMeta($dwnld_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sql_src_META = createCommonMeta($sql_src, mcframe.commonMA.meta.MA_META.SQL_SRC);

	protected static final ConstMetaList<Srch01_RsltBaseR> constMetas = new ConstMetaList<Srch01_RsltBaseR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_id_META,
			biz_dat_nm_META,
			module_id_META,
			logic_id_META,
			func_actyp_META,
			biz_dat_rmrks1_META,
			biz_dat_rmrks2_META,
			biz_dat_rmrks3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			form_file_nm_META,
			cartridge_META,
			cartridge_nm_META,
			print_flg_META,
			dwnld_flg_META,
			sql_src_META
		},
		new String[][]{
			{
			},
			{
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
	protected Srch01_RsltBaseR_MC_A(ConstMetaList<? extends Srch01_RsltBaseR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltBaseR clone() {
		return (Srch01_RsltBaseR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltBaseR createInstance() {
		return (Srch01_RsltBaseR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltBaseR getValues(String... names) {
		return (Srch01_RsltBaseR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 0, $biz_dat_id);
	}

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 0, $biz_dat_id, value);
	}


	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public String biz_dat_nm() {
		return getConstString(offset + 1, $biz_dat_nm);
	}

	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public void biz_dat_nm(String value) {
		setConstString(offset + 1, $biz_dat_nm, value);
	}


	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public String module_id() {
		return getConstString(offset + 2, $module_id);
	}

	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public void module_id(String value) {
		setConstString(offset + 2, $module_id, value);
	}


	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public String logic_id() {
		return getConstString(offset + 3, $logic_id);
	}

	/**
	 * Screen ID 画面ＩＤ.<p>
	 *
	 */
	public void logic_id(String value) {
		setConstString(offset + 3, $logic_id, value);
	}


	/**
	 * Function type 機能種別.<p>
	 *
	 */
	public String func_actyp() {
		return getConstString(offset + 4, $func_actyp);
	}

	/**
	 * Function type 機能種別.<p>
	 *
	 */
	public void func_actyp(String value) {
		setConstString(offset + 4, $func_actyp, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String biz_dat_rmrks1() {
		return getConstString(offset + 5, $biz_dat_rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void biz_dat_rmrks1(String value) {
		setConstString(offset + 5, $biz_dat_rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String biz_dat_rmrks2() {
		return getConstString(offset + 6, $biz_dat_rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void biz_dat_rmrks2(String value) {
		setConstString(offset + 6, $biz_dat_rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String biz_dat_rmrks3() {
		return getConstString(offset + 7, $biz_dat_rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void biz_dat_rmrks3(String value) {
		setConstString(offset + 7, $biz_dat_rmrks3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 8, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 8, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 9, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 9, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 10, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 10, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 11, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 11, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 12, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 12, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 13, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 14, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 14, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 15, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 15, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 16, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 16, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 17, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 17, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 18, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 18, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 19, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 19, $upd_srv_req_no, value);
	}


	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public String form_file_nm() {
		return getConstString(offset + 20, $form_file_nm);
	}

	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public void form_file_nm(String value) {
		setConstString(offset + 20, $form_file_nm, value);
	}


	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public String cartridge() {
		return getConstString(offset + 21, $cartridge);
	}

	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public void cartridge(String value) {
		setConstString(offset + 21, $cartridge, value);
	}


	/**
	 * Cartridge name カートリッジ名.<p>
	 *
	 */
	public String cartridge_nm() {
		return getConstString(offset + 22, $cartridge_nm);
	}

	/**
	 * Cartridge name カートリッジ名.<p>
	 *
	 */
	public void cartridge_nm(String value) {
		setConstString(offset + 22, $cartridge_nm, value);
	}


	/**
	 * Enable report output 帳票出力を有効にする.<p>
	 *
	 */
	public boolean print_flg() {
		return getConstBoolean(offset + 23, $print_flg);
	}

	/**
	 * Enable report output 帳票出力を有効にする.<p>
	 *
	 */
	public void print_flg(boolean value) {
		setConstBoolean(offset + 23, $print_flg, value);
	}


	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public boolean dwnld_flg() {
		return getConstBoolean(offset + 24, $dwnld_flg);
	}

	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public void dwnld_flg(boolean value) {
		setConstBoolean(offset + 24, $dwnld_flg, value);
	}


	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public String sql_src() {
		return getConstString(offset + 25, $sql_src);
	}

	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public void sql_src(String value) {
		setConstString(offset + 25, $sql_src, value);
	}


	public String getString(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			return logic_id();
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			return func_actyp();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		if ($cartridge_nm.equalsIgnoreCase(name)) {
			return cartridge_nm();
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($print_flg.equalsIgnoreCase(name)) {
			return print_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			return logic_id();
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			return func_actyp();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
		}
		if ($cartridge_nm.equalsIgnoreCase(name)) {
			return cartridge_nm();
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($print_flg.equalsIgnoreCase(name)) {
			return print_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			logic_id(value);
			return;
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			func_actyp(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		if ($cartridge_nm.equalsIgnoreCase(name)) {
			cartridge_nm(value);
			return;
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($print_flg.equalsIgnoreCase(name)) {
			print_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			logic_id(value);
			return;
		}
		if ($func_actyp.equalsIgnoreCase(name)) {
			func_actyp(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
			return;
		}
		if ($cartridge_nm.equalsIgnoreCase(name)) {
			cartridge_nm(value);
			return;
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($print_flg.equalsIgnoreCase(name)) {
			print_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

