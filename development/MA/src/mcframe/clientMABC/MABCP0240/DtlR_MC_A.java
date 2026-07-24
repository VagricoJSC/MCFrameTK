package mcframe.clientMABC.MABCP0240;

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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $usr_nm_lcl = "usr_nm_lcl";
	/**
	 * Standard PIC name 標準担当者名.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	/**
	 * License ライセンス.<p>
	 *
	 */
	public static final String $license_flg = "license_flg";
	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public static final String $usr_alt_nm1 = "usr_alt_nm1";
	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public static final String $usr_alt_nm2 = "usr_alt_nm2";
	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public static final String $usr_alt_nm3 = "usr_alt_nm3";
	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public static final String $usr_alt_nm4 = "usr_alt_nm4";
	/**
	 * Full data access フルデータアクセス.<p>
	 *
	 */
	public static final String $full_da_flg = "full_da_flg";
	/**
	 * E-mail 1 Ｅ－Ｍａｉｌ１.<p>
	 *
	 */
	public static final String $email1 = "email1";
	/**
	 * E-mail 2 Ｅ－Ｍａｉｌ２.<p>
	 *
	 */
	public static final String $email2 = "email2";
	/**
	 * E-mail 3 Ｅ－Ｍａｉｌ３.<p>
	 *
	 */
	public static final String $email3 = "email3";
	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public static final String $tel1 = "tel1";
	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public static final String $tel2 = "tel2";
	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public static final String $tel3 = "tel3";
	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public static final String $th_image_flg = "th_image_flg";
	/**
	 * Image 画像.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public static final String $usr_com_typ = "usr_com_typ";
	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public static final String $usr_com_typ_nm = "usr_com_typ_nm";
	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public static final String $usr_com = "usr_com";
	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public static final String $wk_cost_nm = "wk_cost_nm";
	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public static final String $usr_info1 = "usr_info1";
	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public static final String $usr_info2 = "usr_info2";
	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public static final String $usr_info3 = "usr_info3";
	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public static final String $usr_info4 = "usr_info4";
	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public static final String $usr_info5 = "usr_info5";
	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public static final String $usr_info6 = "usr_info6";
	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public static final String $usr_info7 = "usr_info7";
	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public static final String $usr_info8 = "usr_info8";
	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public static final String $usr_info9 = "usr_info9";
	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public static final String $usr_info10 = "usr_info10";
	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public static final String $usr_info11 = "usr_info11";
	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public static final String $usr_info12 = "usr_info12";
	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public static final String $usr_info13 = "usr_info13";
	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public static final String $usr_info14 = "usr_info14";
	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public static final String $usr_info15 = "usr_info15";
	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public static final String $usr_info16 = "usr_info16";
	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public static final String $usr_info17 = "usr_info17";
	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public static final String $usr_info18 = "usr_info18";
	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public static final String $usr_info19 = "usr_info19";
	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public static final String $usr_info20 = "usr_info20";
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
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_lcl_META = createCommonMeta($usr_nm_lcl, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta license_flg_META = createCommonMeta($license_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_alt_nm1_META = createCommonMeta($usr_alt_nm1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm2_META = createCommonMeta($usr_alt_nm2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm3_META = createCommonMeta($usr_alt_nm3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm4_META = createCommonMeta($usr_alt_nm4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta full_da_flg_META = createCommonMeta($full_da_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta email1_META = createCommonMeta($email1, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email2_META = createCommonMeta($email2, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email3_META = createCommonMeta($email3, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta tel1_META = createCommonMeta($tel1, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel2_META = createCommonMeta($tel2, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel3_META = createCommonMeta($tel3, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta th_image_flg_META = createCommonMeta($th_image_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta usr_com_typ_META = createCommonMeta($usr_com_typ, mcframe.commonMA.meta.MA_META.USR_COM_TYP);
	public static final MCMeta usr_com_typ_nm_META = createCommonMeta($usr_com_typ_nm, mcframe.commonMA.meta.MA_META.USR_COM_TYP_NM);
	public static final MCMeta usr_com_META = createCommonMeta($usr_com, mcframe.commonMA.meta.MA_META.USR_COM);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wk_cost_nm_META = createCommonMeta($wk_cost_nm, mcframe.commonMA.meta.MA_META.WK_COST_NM);
	public static final MCMeta usr_info1_META = createCommonMeta($usr_info1, mcframe.commonMA.meta.MA_META.USR_INFO1);
	public static final MCMeta usr_info2_META = createCommonMeta($usr_info2, mcframe.commonMA.meta.MA_META.USR_INFO2);
	public static final MCMeta usr_info3_META = createCommonMeta($usr_info3, mcframe.commonMA.meta.MA_META.USR_INFO3);
	public static final MCMeta usr_info4_META = createCommonMeta($usr_info4, mcframe.commonMA.meta.MA_META.USR_INFO4);
	public static final MCMeta usr_info5_META = createCommonMeta($usr_info5, mcframe.commonMA.meta.MA_META.USR_INFO5);
	public static final MCMeta usr_info6_META = createCommonMeta($usr_info6, mcframe.commonMA.meta.MA_META.USR_INFO6);
	public static final MCMeta usr_info7_META = createCommonMeta($usr_info7, mcframe.commonMA.meta.MA_META.USR_INFO7);
	public static final MCMeta usr_info8_META = createCommonMeta($usr_info8, mcframe.commonMA.meta.MA_META.USR_INFO8);
	public static final MCMeta usr_info9_META = createCommonMeta($usr_info9, mcframe.commonMA.meta.MA_META.USR_INFO9);
	public static final MCMeta usr_info10_META = createCommonMeta($usr_info10, mcframe.commonMA.meta.MA_META.USR_INFO10);
	public static final MCMeta usr_info11_META = createCommonMeta($usr_info11, mcframe.commonMA.meta.MA_META.USR_INFO11);
	public static final MCMeta usr_info12_META = createCommonMeta($usr_info12, mcframe.commonMA.meta.MA_META.USR_INFO12);
	public static final MCMeta usr_info13_META = createCommonMeta($usr_info13, mcframe.commonMA.meta.MA_META.USR_INFO13);
	public static final MCMeta usr_info14_META = createCommonMeta($usr_info14, mcframe.commonMA.meta.MA_META.USR_INFO14);
	public static final MCMeta usr_info15_META = createCommonMeta($usr_info15, mcframe.commonMA.meta.MA_META.USR_INFO15);
	public static final MCMeta usr_info16_META = createCommonMeta($usr_info16, mcframe.commonMA.meta.MA_META.USR_INFO16);
	public static final MCMeta usr_info17_META = createCommonMeta($usr_info17, mcframe.commonMA.meta.MA_META.USR_INFO17);
	public static final MCMeta usr_info18_META = createCommonMeta($usr_info18, mcframe.commonMA.meta.MA_META.USR_INFO18);
	public static final MCMeta usr_info19_META = createCommonMeta($usr_info19, mcframe.commonMA.meta.MA_META.USR_INFO19);
	public static final MCMeta usr_info20_META = createCommonMeta($usr_info20, mcframe.commonMA.meta.MA_META.USR_INFO20);
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
			usr_cd_META,
			usr_nm_lcl_META,
			usr_nm_META,
			license_flg_META,
			usr_alt_nm1_META,
			usr_alt_nm2_META,
			usr_alt_nm3_META,
			usr_alt_nm4_META,
			full_da_flg_META,
			email1_META,
			email2_META,
			email3_META,
			tel1_META,
			tel2_META,
			tel3_META,
			th_image_flg_META,
			th_image_META,
			usr_com_typ_META,
			usr_com_typ_nm_META,
			usr_com_META,
			wk_cost_cd_META,
			wk_cost_nm_META,
			usr_info1_META,
			usr_info2_META,
			usr_info3_META,
			usr_info4_META,
			usr_info5_META,
			usr_info6_META,
			usr_info7_META,
			usr_info8_META,
			usr_info9_META,
			usr_info10_META,
			usr_info11_META,
			usr_info12_META,
			usr_info13_META,
			usr_info14_META,
			usr_info15_META,
			usr_info16_META,
			usr_info17_META,
			usr_info18_META,
			usr_info19_META,
			usr_info20_META,
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
			$usr_cd	// usr_cd
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$usr_cd, "user_nm"}	// usr_cd
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
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 2, $usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 2, $usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String usr_nm_lcl() {
		return getConstString(offset + 3, $usr_nm_lcl);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void usr_nm_lcl(String value) {
		setConstString(offset + 3, $usr_nm_lcl, value);
	}


	/**
	 * Standard PIC name 標準担当者名.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 4, $usr_nm);
	}

	/**
	 * Standard PIC name 標準担当者名.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 4, $usr_nm, value);
	}


	/**
	 * License ライセンス.<p>
	 *
	 */
	public boolean license_flg() {
		return getConstBoolean(offset + 5, $license_flg);
	}

	/**
	 * License ライセンス.<p>
	 *
	 */
	public void license_flg(boolean value) {
		setConstBoolean(offset + 5, $license_flg, value);
	}


	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public String usr_alt_nm1() {
		return getConstString(offset + 6, $usr_alt_nm1);
	}

	/**
	 * PIC alias name 1 担当者別名１.<p>
	 *
	 */
	public void usr_alt_nm1(String value) {
		setConstString(offset + 6, $usr_alt_nm1, value);
	}


	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public String usr_alt_nm2() {
		return getConstString(offset + 7, $usr_alt_nm2);
	}

	/**
	 * PIC alias name 2 担当者別名２.<p>
	 *
	 */
	public void usr_alt_nm2(String value) {
		setConstString(offset + 7, $usr_alt_nm2, value);
	}


	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public String usr_alt_nm3() {
		return getConstString(offset + 8, $usr_alt_nm3);
	}

	/**
	 * PIC alias name 3 担当者別名３.<p>
	 *
	 */
	public void usr_alt_nm3(String value) {
		setConstString(offset + 8, $usr_alt_nm3, value);
	}


	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public String usr_alt_nm4() {
		return getConstString(offset + 9, $usr_alt_nm4);
	}

	/**
	 * PIC alias name 4 担当者別名４.<p>
	 *
	 */
	public void usr_alt_nm4(String value) {
		setConstString(offset + 9, $usr_alt_nm4, value);
	}


	/**
	 * Full data access フルデータアクセス.<p>
	 *
	 */
	public boolean full_da_flg() {
		return getConstBoolean(offset + 10, $full_da_flg);
	}

	/**
	 * Full data access フルデータアクセス.<p>
	 *
	 */
	public void full_da_flg(boolean value) {
		setConstBoolean(offset + 10, $full_da_flg, value);
	}


	/**
	 * E-mail 1 Ｅ－Ｍａｉｌ１.<p>
	 *
	 */
	public String email1() {
		return getConstString(offset + 11, $email1);
	}

	/**
	 * E-mail 1 Ｅ－Ｍａｉｌ１.<p>
	 *
	 */
	public void email1(String value) {
		setConstString(offset + 11, $email1, value);
	}


	/**
	 * E-mail 2 Ｅ－Ｍａｉｌ２.<p>
	 *
	 */
	public String email2() {
		return getConstString(offset + 12, $email2);
	}

	/**
	 * E-mail 2 Ｅ－Ｍａｉｌ２.<p>
	 *
	 */
	public void email2(String value) {
		setConstString(offset + 12, $email2, value);
	}


	/**
	 * E-mail 3 Ｅ－Ｍａｉｌ３.<p>
	 *
	 */
	public String email3() {
		return getConstString(offset + 13, $email3);
	}

	/**
	 * E-mail 3 Ｅ－Ｍａｉｌ３.<p>
	 *
	 */
	public void email3(String value) {
		setConstString(offset + 13, $email3, value);
	}


	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public String tel1() {
		return getConstString(offset + 14, $tel1);
	}

	/**
	 * TEL 1 ＴＥＬ１.<p>
	 *
	 */
	public void tel1(String value) {
		setConstString(offset + 14, $tel1, value);
	}


	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public String tel2() {
		return getConstString(offset + 15, $tel2);
	}

	/**
	 * TEL 2 ＴＥＬ２.<p>
	 *
	 */
	public void tel2(String value) {
		setConstString(offset + 15, $tel2, value);
	}


	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public String tel3() {
		return getConstString(offset + 16, $tel3);
	}

	/**
	 * TEL 3 ＴＥＬ３.<p>
	 *
	 */
	public void tel3(String value) {
		setConstString(offset + 16, $tel3, value);
	}


	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public boolean th_image_flg() {
		return getConstBoolean(offset + 17, $th_image_flg);
	}

	/**
	 * Search image 画像検索.<p>
	 *
	 */
	public void th_image_flg(boolean value) {
		setConstBoolean(offset + 17, $th_image_flg, value);
	}


	/**
	 * Image 画像.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 18, $th_image);
	}

	/**
	 * Image 画像.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 18, $th_image, value);
	}


	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public String usr_com_typ() {
		return getConstString(offset + 19, $usr_com_typ);
	}

	/**
	 * Employee type 社員区分.<p>
	 *
	 */
	public void usr_com_typ(String value) {
		setConstString(offset + 19, $usr_com_typ, value);
	}


	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public String usr_com_typ_nm() {
		return getConstString(offset + 20, $usr_com_typ_nm);
	}

	/**
	 * Employee type name 社員区分名.<p>
	 *
	 */
	public void usr_com_typ_nm(String value) {
		setConstString(offset + 20, $usr_com_typ_nm, value);
	}


	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public String usr_com() {
		return getConstString(offset + 21, $usr_com);
	}

	/**
	 * Affiliation company 所属会社.<p>
	 *
	 */
	public void usr_com(String value) {
		setConstString(offset + 21, $usr_com, value);
	}


	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 22, $wk_cost_cd);
	}

	/**
	 * Work element cd. 工数管理ＣＤ.<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 22, $wk_cost_cd, value);
	}


	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public String wk_cost_nm() {
		return getConstString(offset + 23, $wk_cost_nm);
	}

	/**
	 * Work element name 工数管理名.<p>
	 *
	 */
	public void wk_cost_nm(String value) {
		setConstString(offset + 23, $wk_cost_nm, value);
	}


	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public String usr_info1() {
		return getConstString(offset + 24, $usr_info1);
	}

	/**
	 * PIC info. 1 担当者情報１.<p>
	 *
	 */
	public void usr_info1(String value) {
		setConstString(offset + 24, $usr_info1, value);
	}


	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public String usr_info2() {
		return getConstString(offset + 25, $usr_info2);
	}

	/**
	 * PIC info. 2 担当者情報２.<p>
	 *
	 */
	public void usr_info2(String value) {
		setConstString(offset + 25, $usr_info2, value);
	}


	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public String usr_info3() {
		return getConstString(offset + 26, $usr_info3);
	}

	/**
	 * PIC info. 3 担当者情報３.<p>
	 *
	 */
	public void usr_info3(String value) {
		setConstString(offset + 26, $usr_info3, value);
	}


	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public String usr_info4() {
		return getConstString(offset + 27, $usr_info4);
	}

	/**
	 * PIC info. 4 担当者情報４.<p>
	 *
	 */
	public void usr_info4(String value) {
		setConstString(offset + 27, $usr_info4, value);
	}


	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public String usr_info5() {
		return getConstString(offset + 28, $usr_info5);
	}

	/**
	 * PIC info. 5 担当者情報５.<p>
	 *
	 */
	public void usr_info5(String value) {
		setConstString(offset + 28, $usr_info5, value);
	}


	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public String usr_info6() {
		return getConstString(offset + 29, $usr_info6);
	}

	/**
	 * PIC info. 6 担当者情報６.<p>
	 *
	 */
	public void usr_info6(String value) {
		setConstString(offset + 29, $usr_info6, value);
	}


	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public String usr_info7() {
		return getConstString(offset + 30, $usr_info7);
	}

	/**
	 * PIC info. 7 担当者情報７.<p>
	 *
	 */
	public void usr_info7(String value) {
		setConstString(offset + 30, $usr_info7, value);
	}


	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public String usr_info8() {
		return getConstString(offset + 31, $usr_info8);
	}

	/**
	 * PIC info. 8 担当者情報８.<p>
	 *
	 */
	public void usr_info8(String value) {
		setConstString(offset + 31, $usr_info8, value);
	}


	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public String usr_info9() {
		return getConstString(offset + 32, $usr_info9);
	}

	/**
	 * PIC info. 9 担当者情報９.<p>
	 *
	 */
	public void usr_info9(String value) {
		setConstString(offset + 32, $usr_info9, value);
	}


	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public String usr_info10() {
		return getConstString(offset + 33, $usr_info10);
	}

	/**
	 * PIC info. 10 担当者情報１０.<p>
	 *
	 */
	public void usr_info10(String value) {
		setConstString(offset + 33, $usr_info10, value);
	}


	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public String usr_info11() {
		return getConstString(offset + 34, $usr_info11);
	}

	/**
	 * PIC info. 11 担当者情報１１.<p>
	 *
	 */
	public void usr_info11(String value) {
		setConstString(offset + 34, $usr_info11, value);
	}


	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public String usr_info12() {
		return getConstString(offset + 35, $usr_info12);
	}

	/**
	 * PIC info. 12 担当者情報１２.<p>
	 *
	 */
	public void usr_info12(String value) {
		setConstString(offset + 35, $usr_info12, value);
	}


	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public String usr_info13() {
		return getConstString(offset + 36, $usr_info13);
	}

	/**
	 * PIC info. 13 担当者情報１３.<p>
	 *
	 */
	public void usr_info13(String value) {
		setConstString(offset + 36, $usr_info13, value);
	}


	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public String usr_info14() {
		return getConstString(offset + 37, $usr_info14);
	}

	/**
	 * PIC info. 14 担当者情報１４.<p>
	 *
	 */
	public void usr_info14(String value) {
		setConstString(offset + 37, $usr_info14, value);
	}


	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public String usr_info15() {
		return getConstString(offset + 38, $usr_info15);
	}

	/**
	 * PIC info. 15 担当者情報１５.<p>
	 *
	 */
	public void usr_info15(String value) {
		setConstString(offset + 38, $usr_info15, value);
	}


	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public String usr_info16() {
		return getConstString(offset + 39, $usr_info16);
	}

	/**
	 * PIC info. 16 担当者情報１６.<p>
	 *
	 */
	public void usr_info16(String value) {
		setConstString(offset + 39, $usr_info16, value);
	}


	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public String usr_info17() {
		return getConstString(offset + 40, $usr_info17);
	}

	/**
	 * PIC info. 17 担当者情報１７.<p>
	 *
	 */
	public void usr_info17(String value) {
		setConstString(offset + 40, $usr_info17, value);
	}


	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public String usr_info18() {
		return getConstString(offset + 41, $usr_info18);
	}

	/**
	 * PIC info. 18 担当者情報１８.<p>
	 *
	 */
	public void usr_info18(String value) {
		setConstString(offset + 41, $usr_info18, value);
	}


	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public String usr_info19() {
		return getConstString(offset + 42, $usr_info19);
	}

	/**
	 * PIC info. 19 担当者情報１９.<p>
	 *
	 */
	public void usr_info19(String value) {
		setConstString(offset + 42, $usr_info19, value);
	}


	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public String usr_info20() {
		return getConstString(offset + 43, $usr_info20);
	}

	/**
	 * PIC info. 20 担当者情報２０.<p>
	 *
	 */
	public void usr_info20(String value) {
		setConstString(offset + 43, $usr_info20, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 44, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 44, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 45, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 45, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 46, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 46, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 51, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 51, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 52, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 56, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 56, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 57, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 57, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 58, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 58, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 59, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 59, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 60, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 60, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 61, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 61, $del_ts, value);
	}


	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			return usr_nm_lcl();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($email1.equalsIgnoreCase(name)) {
			return email1();
		}
		if ($email2.equalsIgnoreCase(name)) {
			return email2();
		}
		if ($email3.equalsIgnoreCase(name)) {
			return email3();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($tel3.equalsIgnoreCase(name)) {
			return tel3();
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			return usr_com_typ_nm();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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
		if ($license_flg.equalsIgnoreCase(name)) {
			return license_flg();
		}
		if ($full_da_flg.equalsIgnoreCase(name)) {
			return full_da_flg();
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		return super.getBoolean(name);
	}
	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			return usr_nm_lcl();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($email1.equalsIgnoreCase(name)) {
			return email1();
		}
		if ($email2.equalsIgnoreCase(name)) {
			return email2();
		}
		if ($email3.equalsIgnoreCase(name)) {
			return email3();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($tel3.equalsIgnoreCase(name)) {
			return tel3();
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			return usr_com_typ_nm();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			return wk_cost_nm();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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
		if ($license_flg.equalsIgnoreCase(name)) {
			return license_flg();
		}
		if ($full_da_flg.equalsIgnoreCase(name)) {
			return full_da_flg();
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			return th_image_flg();
		}
		return super.getBooleanNE(name);
	}
	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			usr_nm_lcl(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
			return;
		}
		if ($email1.equalsIgnoreCase(name)) {
			email1(value);
			return;
		}
		if ($email2.equalsIgnoreCase(name)) {
			email2(value);
			return;
		}
		if ($email3.equalsIgnoreCase(name)) {
			email3(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($tel3.equalsIgnoreCase(name)) {
			tel3(value);
			return;
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			usr_com_typ_nm(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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
		if ($license_flg.equalsIgnoreCase(name)) {
			license_flg(value);
			return;
		}
		if ($full_da_flg.equalsIgnoreCase(name)) {
			full_da_flg(value);
			return;
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}
	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm_lcl.equalsIgnoreCase(name)) {
			usr_nm_lcl(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
			return;
		}
		if ($email1.equalsIgnoreCase(name)) {
			email1(value);
			return;
		}
		if ($email2.equalsIgnoreCase(name)) {
			email2(value);
			return;
		}
		if ($email3.equalsIgnoreCase(name)) {
			email3(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($tel3.equalsIgnoreCase(name)) {
			tel3(value);
			return;
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com_typ_nm.equalsIgnoreCase(name)) {
			usr_com_typ_nm(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wk_cost_nm.equalsIgnoreCase(name)) {
			wk_cost_nm(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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
		if ($license_flg.equalsIgnoreCase(name)) {
			license_flg(value);
			return;
		}
		if ($full_da_flg.equalsIgnoreCase(name)) {
			full_da_flg(value);
			return;
		}
		if ($th_image_flg.equalsIgnoreCase(name)) {
			th_image_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}
	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}



}

