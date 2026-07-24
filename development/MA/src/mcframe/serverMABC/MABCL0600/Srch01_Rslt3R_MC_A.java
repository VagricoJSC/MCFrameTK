package mcframe.serverMABC.MABCL0600;

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
 * ブロック"Srch01_Rslt3"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt3R_MC_A extends MCConstRow {

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public static final String $lcl_cd = "lcl_cd";
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public static final String $lcl_nm = "lcl_nm";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";


	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta lcl_nm_META = createCommonMeta($lcl_nm, mcframe.commonMA.meta.MA_META.LCL_NM);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<Srch01_Rslt3R> constMetas = new ConstMetaList<Srch01_Rslt3R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bp_cd_META,
			lcl_cd_META,
			lcl_nm_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			memo1_META,
			memo2_META,
			memo3_META,
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		))
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
	protected Srch01_Rslt3R_MC_A(ConstMetaList<? extends Srch01_Rslt3R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt3R clone() {
		return (Srch01_Rslt3R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt3R createInstance() {
		return (Srch01_Rslt3R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt3R getValues(String... names) {
		return (Srch01_Rslt3R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}


	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 1, $lcl_cd);
	}

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 1, $lcl_cd, value);
	}


	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public String lcl_nm() {
		return getConstString(offset + 2, $lcl_nm);
	}

	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public void lcl_nm(String value) {
		setConstString(offset + 2, $lcl_nm, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 3, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 3, $bp_nm, value);
	}


	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 4, $bp_alt_nm1);
	}

	/**
	 * BP alias name 1 取引先別名１.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 4, $bp_alt_nm1, value);
	}


	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 5, $bp_alt_nm2);
	}

	/**
	 * BP alias name 2 取引先別名２.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 5, $bp_alt_nm2, value);
	}


	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 6, $bp_alt_nm3);
	}

	/**
	 * BP alias name 3 取引先別名３.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 6, $bp_alt_nm3, value);
	}


	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 7, $bp_alt_nm4);
	}

	/**
	 * BP alias name 4 取引先別名４.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 7, $bp_alt_nm4, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}


	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 11, $memo4);
	}

	/**
	 * Memo 4 メモ４.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 11, $memo4, value);
	}


	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 12, $memo5);
	}

	/**
	 * Memo 5 メモ５.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 12, $memo5, value);
	}


	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 13, $memo6);
	}

	/**
	 * Memo 6 メモ６.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 13, $memo6, value);
	}


	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 14, $memo7);
	}

	/**
	 * Memo 7 メモ７.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 14, $memo7, value);
	}


	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 15, $memo8);
	}

	/**
	 * Memo 8 メモ８.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 15, $memo8, value);
	}


	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 16, $memo9);
	}

	/**
	 * Memo 9 メモ９.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 16, $memo9, value);
	}


	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 17, $memo10);
	}

	/**
	 * Memo 10 メモ１０.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 17, $memo10, value);
	}


	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 18, $memo11);
	}

	/**
	 * Memo 11 メモ１１.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 18, $memo11, value);
	}


	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 19, $memo12);
	}

	/**
	 * Memo 12 メモ１２.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 19, $memo12, value);
	}


	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 20, $memo13);
	}

	/**
	 * Memo 13 メモ１３.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 20, $memo13, value);
	}


	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 21, $memo14);
	}

	/**
	 * Memo 14 メモ１４.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 21, $memo14, value);
	}


	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 22, $memo15);
	}

	/**
	 * Memo 15 メモ１５.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 22, $memo15, value);
	}


	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 23, $memo16);
	}

	/**
	 * Memo 16 メモ１６.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 23, $memo16, value);
	}


	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 24, $memo17);
	}

	/**
	 * Memo 17 メモ１７.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 24, $memo17, value);
	}


	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 25, $memo18);
	}

	/**
	 * Memo 18 メモ１８.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 25, $memo18, value);
	}


	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 26, $memo19);
	}

	/**
	 * Memo 19 メモ１９.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 26, $memo19, value);
	}


	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 27, $memo20);
	}

	/**
	 * Memo 20 メモ２０.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 27, $memo20, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 28, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 28, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 29, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 29, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 31, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 31, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 32, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 32, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 33, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 33, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 34, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 34, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 35, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 35, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 36, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 36, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 37, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 37, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 38, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 38, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 39, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 39, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
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

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
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

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			lcl_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
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

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			lcl_nm(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
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



}

