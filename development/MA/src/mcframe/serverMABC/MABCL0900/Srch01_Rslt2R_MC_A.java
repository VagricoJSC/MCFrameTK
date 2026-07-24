package mcframe.serverMABC.MABCL0900;

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
 * ブロック"Srch01_Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt2R_MC_A extends MCConstRow {

	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public static final String $key1 = "key1";
	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public static final String $key2 = "key2";
	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public static final String $key3 = "key3";
	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public static final String $key4 = "key4";
	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public static final String $key5 = "key5";
	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public static final String $key6 = "key6";
	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public static final String $key7 = "key7";
	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public static final String $key8 = "key8";
	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public static final String $key9 = "key9";
	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public static final String $key10 = "key10";
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
	 * String 1 文字列１.<p>
	 *
	 */
	public static final String $char1 = "char1";
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public static final String $char2 = "char2";
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public static final String $char3 = "char3";
	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public static final String $char4 = "char4";
	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public static final String $char5 = "char5";
	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public static final String $char6 = "char6";
	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public static final String $char7 = "char7";
	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public static final String $char8 = "char8";
	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public static final String $char9 = "char9";
	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public static final String $char10 = "char10";
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


	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);
	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta lcl_nm_META = createCommonMeta($lcl_nm, mcframe.commonMA.meta.MA_META.LCL_NM);
	public static final MCMeta char1_META = createCommonMeta($char1, mcframe.commonMA.meta.MA_META.GP_CHAR1);
	public static final MCMeta char2_META = createCommonMeta($char2, mcframe.commonMA.meta.MA_META.GP_CHAR2);
	public static final MCMeta char3_META = createCommonMeta($char3, mcframe.commonMA.meta.MA_META.GP_CHAR3);
	public static final MCMeta char4_META = createCommonMeta($char4, mcframe.commonMA.meta.MA_META.GP_CHAR4);
	public static final MCMeta char5_META = createCommonMeta($char5, mcframe.commonMA.meta.MA_META.GP_CHAR5);
	public static final MCMeta char6_META = createCommonMeta($char6, mcframe.commonMA.meta.MA_META.GP_CHAR6);
	public static final MCMeta char7_META = createCommonMeta($char7, mcframe.commonMA.meta.MA_META.GP_CHAR7);
	public static final MCMeta char8_META = createCommonMeta($char8, mcframe.commonMA.meta.MA_META.GP_CHAR8);
	public static final MCMeta char9_META = createCommonMeta($char9, mcframe.commonMA.meta.MA_META.GP_CHAR9);
	public static final MCMeta char10_META = createCommonMeta($char10, mcframe.commonMA.meta.MA_META.GP_CHAR10);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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

	protected static final ConstMetaList<Srch01_Rslt2R> constMetas = new ConstMetaList<Srch01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			gp_grp_cd_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META,
			lcl_cd_META,
			lcl_nm_META,
			char1_META,
			char2_META,
			char3_META,
			char4_META,
			char5_META,
			char6_META,
			char7_META,
			char8_META,
			char9_META,
			char10_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
	protected Srch01_Rslt2R_MC_A(ConstMetaList<? extends Srch01_Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R clone() {
		return (Srch01_Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R createInstance() {
		return (Srch01_Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R getValues(String... names) {
		return (Srch01_Rslt2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 0, $gp_grp_cd);
	}

	/**
	 * General purpose classification cd. 汎用分類ＣＤ.<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 0, $gp_grp_cd, value);
	}


	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 1, $key1);
	}

	/**
	 * Key 1 キー１.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 1, $key1, value);
	}


	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 2, $key2);
	}

	/**
	 * Key 2 キー２.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 2, $key2, value);
	}


	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 3, $key3);
	}

	/**
	 * Key 3 キー３.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 3, $key3, value);
	}


	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 4, $key4);
	}

	/**
	 * Key 4 キー４.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 4, $key4, value);
	}


	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 5, $key5);
	}

	/**
	 * Key 5 キー５.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 5, $key5, value);
	}


	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 6, $key6);
	}

	/**
	 * Key 6 キー６.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 6, $key6, value);
	}


	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 7, $key7);
	}

	/**
	 * Key 7 キー７.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 7, $key7, value);
	}


	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 8, $key8);
	}

	/**
	 * Key 8 キー８.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 8, $key8, value);
	}


	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 9, $key9);
	}

	/**
	 * Key 9 キー９.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 9, $key9, value);
	}


	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 10, $key10);
	}

	/**
	 * Key 10 キー１０.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 10, $key10, value);
	}


	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 11, $lcl_cd);
	}

	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 11, $lcl_cd, value);
	}


	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public String lcl_nm() {
		return getConstString(offset + 12, $lcl_nm);
	}

	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public void lcl_nm(String value) {
		setConstString(offset + 12, $lcl_nm, value);
	}


	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public String char1() {
		return getConstString(offset + 13, $char1);
	}

	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public void char1(String value) {
		setConstString(offset + 13, $char1, value);
	}


	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public String char2() {
		return getConstString(offset + 14, $char2);
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public void char2(String value) {
		setConstString(offset + 14, $char2, value);
	}


	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public String char3() {
		return getConstString(offset + 15, $char3);
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public void char3(String value) {
		setConstString(offset + 15, $char3, value);
	}


	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public String char4() {
		return getConstString(offset + 16, $char4);
	}

	/**
	 * String 4 文字列４.<p>
	 *
	 */
	public void char4(String value) {
		setConstString(offset + 16, $char4, value);
	}


	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public String char5() {
		return getConstString(offset + 17, $char5);
	}

	/**
	 * String 5 文字列５.<p>
	 *
	 */
	public void char5(String value) {
		setConstString(offset + 17, $char5, value);
	}


	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public String char6() {
		return getConstString(offset + 18, $char6);
	}

	/**
	 * String 6 文字列６.<p>
	 *
	 */
	public void char6(String value) {
		setConstString(offset + 18, $char6, value);
	}


	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public String char7() {
		return getConstString(offset + 19, $char7);
	}

	/**
	 * String 7 文字列７.<p>
	 *
	 */
	public void char7(String value) {
		setConstString(offset + 19, $char7, value);
	}


	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public String char8() {
		return getConstString(offset + 20, $char8);
	}

	/**
	 * String 8 文字列８.<p>
	 *
	 */
	public void char8(String value) {
		setConstString(offset + 20, $char8, value);
	}


	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public String char9() {
		return getConstString(offset + 21, $char9);
	}

	/**
	 * String 9 文字列９.<p>
	 *
	 */
	public void char9(String value) {
		setConstString(offset + 21, $char9, value);
	}


	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public String char10() {
		return getConstString(offset + 22, $char10);
	}

	/**
	 * String 10 文字列１０.<p>
	 *
	 */
	public void char10(String value) {
		setConstString(offset + 22, $char10, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 23, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 23, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 24, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 24, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 25, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 25, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 26, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 26, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 27, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 27, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 28, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 29, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 29, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 30, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 30, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 31, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 32, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 32, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 33, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 33, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 36, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 36, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}


	public String getString(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		if ($lcl_nm.equalsIgnoreCase(name)) {
			return lcl_nm();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
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
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
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
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
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

