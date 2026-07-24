package mcframe.clientMSBB.MSBBP4010;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Sales project management type 案件管理区分.<p>
	 *
	 */
	public static final String $wrk_mng_typ = "wrk_mng_typ";
	/**
	 * Sales project management type name 案件管理区分名.<p>
	 *
	 */
	public static final String $wrk_mng_typ_nm = "wrk_mng_typ_nm";
	/**
	 * Sales project management cd. 案件管理ＣＤ.<p>
	 *
	 */
	public static final String $wrk_mng_cd = "wrk_mng_cd";
	/**
	 * Sales project management name 案件管理名.<p>
	 *
	 */
	public static final String $wrk_mng_nm = "wrk_mng_nm";
	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public static final String $str1 = "str1";
	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public static final String $str2 = "str2";
	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public static final String $str3 = "str3";
	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public static final String $num1 = "num1";
	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public static final String $num2 = "num2";
	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public static final String $num3 = "num3";
	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public static final String $flg1 = "flg1";
	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public static final String $flg2 = "flg2";
	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public static final String $flg3 = "flg3";
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
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_mng_typ_META = createCommonMeta($wrk_mng_typ, mcframe.commonMS.meta.MS_META.WRK_MNG_TYP);
	public static final MCMeta wrk_mng_typ_nm_META = createCommonMeta($wrk_mng_typ_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_TYP_NM);
	public static final MCMeta wrk_mng_cd_META = createCommonMeta($wrk_mng_cd, mcframe.commonMS.meta.MS_META.WRK_MNG_CD);
	public static final MCMeta wrk_mng_nm_META = createCommonMeta($wrk_mng_nm, mcframe.commonMS.meta.MS_META.WRK_MNG_NM);
	public static final MCMeta str1_META = createCommonMeta($str1, mcframe.commonMS.meta.MS_META.WRK_STR1);
	public static final MCMeta str2_META = createCommonMeta($str2, mcframe.commonMS.meta.MS_META.WRK_STR2);
	public static final MCMeta str3_META = createCommonMeta($str3, mcframe.commonMS.meta.MS_META.WRK_STR3);
	public static final MCMeta num1_META = createCommonMeta($num1, mcframe.commonMS.meta.MS_META.WRK_NUM1);
	public static final MCMeta num2_META = createCommonMeta($num2, mcframe.commonMS.meta.MS_META.WRK_NUM2);
	public static final MCMeta num3_META = createCommonMeta($num3, mcframe.commonMS.meta.MS_META.WRK_NUM3);
	public static final MCMeta flg1_META = createCommonMeta($flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg2_META = createCommonMeta($flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta flg3_META = createCommonMeta($flg3, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			wrk_mng_typ_META,
			wrk_mng_typ_nm_META,
			wrk_mng_cd_META,
			wrk_mng_nm_META,
			str1_META,
			str2_META,
			str3_META,
			num1_META,
			num2_META,
			num3_META,
			flg1_META,
			flg2_META,
			flg3_META,
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
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$wrk_mng_typ,	// wrk_mng_typ
			$wrk_mng_cd	// wrk_mng_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

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
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	/**
	 * Sales project management type 案件管理区分.<p>
	 *
	 */
	public String wrk_mng_typ() {
		return getConstString(offset + 2, $wrk_mng_typ);
	}

	/**
	 * Sales project management type 案件管理区分.<p>
	 *
	 */
	public void wrk_mng_typ(String value) {
		setConstString(offset + 2, $wrk_mng_typ, value);
	}


	/**
	 * Sales project management type name 案件管理区分名.<p>
	 *
	 */
	public String wrk_mng_typ_nm() {
		return getConstString(offset + 3, $wrk_mng_typ_nm);
	}

	/**
	 * Sales project management type name 案件管理区分名.<p>
	 *
	 */
	public void wrk_mng_typ_nm(String value) {
		setConstString(offset + 3, $wrk_mng_typ_nm, value);
	}


	/**
	 * Sales project management cd. 案件管理ＣＤ.<p>
	 *
	 */
	public String wrk_mng_cd() {
		return getConstString(offset + 4, $wrk_mng_cd);
	}

	/**
	 * Sales project management cd. 案件管理ＣＤ.<p>
	 *
	 */
	public void wrk_mng_cd(String value) {
		setConstString(offset + 4, $wrk_mng_cd, value);
	}


	/**
	 * Sales project management name 案件管理名.<p>
	 *
	 */
	public String wrk_mng_nm() {
		return getConstString(offset + 5, $wrk_mng_nm);
	}

	/**
	 * Sales project management name 案件管理名.<p>
	 *
	 */
	public void wrk_mng_nm(String value) {
		setConstString(offset + 5, $wrk_mng_nm, value);
	}


	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public String str1() {
		return getConstString(offset + 6, $str1);
	}

	/**
	 * String 1 文字列１.<p>
	 *
	 */
	public void str1(String value) {
		setConstString(offset + 6, $str1, value);
	}


	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public String str2() {
		return getConstString(offset + 7, $str2);
	}

	/**
	 * String 2 文字列２.<p>
	 *
	 */
	public void str2(String value) {
		setConstString(offset + 7, $str2, value);
	}


	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public String str3() {
		return getConstString(offset + 8, $str3);
	}

	/**
	 * String 3 文字列３.<p>
	 *
	 */
	public void str3(String value) {
		setConstString(offset + 8, $str3, value);
	}


	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public MCNumber num1() {
		return getConstNumber(offset + 9, $num1);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(MCNumber value) {
		setConstNumber(offset + 9, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(int value) {
		setConstNumber(offset + 9, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(long value) {
		setConstNumber(offset + 9, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(float value) {
		setConstNumber(offset + 9, $num1, value);
	}

	/**
	 * Numerical 1 数値１.<p>
	 *
	 */
	public void num1(double value) {
		setConstNumber(offset + 9, $num1, value);
	}


	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public MCNumber num2() {
		return getConstNumber(offset + 10, $num2);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(MCNumber value) {
		setConstNumber(offset + 10, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(int value) {
		setConstNumber(offset + 10, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(long value) {
		setConstNumber(offset + 10, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(float value) {
		setConstNumber(offset + 10, $num2, value);
	}

	/**
	 * Numerical 2 数値２.<p>
	 *
	 */
	public void num2(double value) {
		setConstNumber(offset + 10, $num2, value);
	}


	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public MCNumber num3() {
		return getConstNumber(offset + 11, $num3);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(MCNumber value) {
		setConstNumber(offset + 11, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(int value) {
		setConstNumber(offset + 11, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(long value) {
		setConstNumber(offset + 11, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(float value) {
		setConstNumber(offset + 11, $num3, value);
	}

	/**
	 * Numerical 3 数値３.<p>
	 *
	 */
	public void num3(double value) {
		setConstNumber(offset + 11, $num3, value);
	}


	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public boolean flg1() {
		return getConstBoolean(offset + 12, $flg1);
	}

	/**
	 * Flg. 1 フラグ１.<p>
	 *
	 */
	public void flg1(boolean value) {
		setConstBoolean(offset + 12, $flg1, value);
	}


	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public boolean flg2() {
		return getConstBoolean(offset + 13, $flg2);
	}

	/**
	 * Flg. 2 フラグ２.<p>
	 *
	 */
	public void flg2(boolean value) {
		setConstBoolean(offset + 13, $flg2, value);
	}


	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public boolean flg3() {
		return getConstBoolean(offset + 14, $flg3);
	}

	/**
	 * Flg. 3 フラグ３.<p>
	 *
	 */
	public void flg3(boolean value) {
		setConstBoolean(offset + 14, $flg3, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 15, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 15, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 16, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 16, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 17, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 17, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 18, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 18, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 19, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 19, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 20, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 20, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 21, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 21, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 22, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 22, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 23, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 24, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 24, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 25, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 25, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 26, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 26, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 27, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 27, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 28, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 28, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 29, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 29, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 30, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 30, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 31, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 31, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 32, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $del_ts, value);
	}


	public String getString(String name) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			return wrk_mng_typ_nm();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			return wrk_mng_nm();
		}
		if ($str1.equalsIgnoreCase(name)) {
			return str1();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			return wrk_mng_typ();
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			return wrk_mng_typ_nm();
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			return wrk_mng_cd();
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			return wrk_mng_nm();
		}
		if ($str1.equalsIgnoreCase(name)) {
			return str1();
		}
		if ($str2.equalsIgnoreCase(name)) {
			return str2();
		}
		if ($str3.equalsIgnoreCase(name)) {
			return str3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($num1.equalsIgnoreCase(name)) {
			return num1();
		}
		if ($num2.equalsIgnoreCase(name)) {
			return num2();
		}
		if ($num3.equalsIgnoreCase(name)) {
			return num3();
		}
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
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($flg1.equalsIgnoreCase(name)) {
			return flg1();
		}
		if ($flg2.equalsIgnoreCase(name)) {
			return flg2();
		}
		if ($flg3.equalsIgnoreCase(name)) {
			return flg3();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			wrk_mng_typ_nm(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			wrk_mng_nm(value);
			return;
		}
		if ($str1.equalsIgnoreCase(name)) {
			str1(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wrk_mng_typ.equalsIgnoreCase(name)) {
			wrk_mng_typ(value);
			return;
		}
		if ($wrk_mng_typ_nm.equalsIgnoreCase(name)) {
			wrk_mng_typ_nm(value);
			return;
		}
		if ($wrk_mng_cd.equalsIgnoreCase(name)) {
			wrk_mng_cd(value);
			return;
		}
		if ($wrk_mng_nm.equalsIgnoreCase(name)) {
			wrk_mng_nm(value);
			return;
		}
		if ($str1.equalsIgnoreCase(name)) {
			str1(value);
			return;
		}
		if ($str2.equalsIgnoreCase(name)) {
			str2(value);
			return;
		}
		if ($str3.equalsIgnoreCase(name)) {
			str3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($num1.equalsIgnoreCase(name)) {
			num1(value);
			return;
		}
		if ($num2.equalsIgnoreCase(name)) {
			num2(value);
			return;
		}
		if ($num3.equalsIgnoreCase(name)) {
			num3(value);
			return;
		}
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($flg1.equalsIgnoreCase(name)) {
			flg1(value);
			return;
		}
		if ($flg2.equalsIgnoreCase(name)) {
			flg2(value);
			return;
		}
		if ($flg3.equalsIgnoreCase(name)) {
			flg3(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

