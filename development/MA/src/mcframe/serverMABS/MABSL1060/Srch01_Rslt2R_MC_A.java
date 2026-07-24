package mcframe.serverMABS.MABSL1060;

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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_cd = "main_itm_cd";
	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public static final String $main_itm_sub1 = "main_itm_sub1";
	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public static final String $main_itm_sub2 = "main_itm_sub2";
	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public static final String $main_itm_sub3 = "main_itm_sub3";
	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public static final String $main_itm_nm = "main_itm_nm";
	/**
	 * Representative item type 代表品目区分.<p>
	 *
	 */
	public static final String $main_itm_typ = "main_itm_typ";
	/**
	 * Representative item type name 代表品目区分名.<p>
	 *
	 */
	public static final String $main_itm_typ_nm = "main_itm_typ_nm";
	/**
	 * Representative item type details cd. 代表品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_typ_d_cd = "main_itm_typ_d_cd";
	/**
	 * Representative item type details name 代表品目区分詳細名.<p>
	 *
	 */
	public static final String $main_itm_typ_d_nm = "main_itm_typ_d_nm";
	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public static final String $set_itm_cd = "set_itm_cd";
	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public static final String $set_itm_sub1 = "set_itm_sub1";
	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public static final String $set_itm_sub2 = "set_itm_sub2";
	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public static final String $set_itm_sub3 = "set_itm_sub3";
	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public static final String $set_itm_nm = "set_itm_nm";
	/**
	 * Assortment item type 品揃品目区分.<p>
	 *
	 */
	public static final String $set_itm_typ = "set_itm_typ";
	/**
	 * Assortment item type name 品揃品目区分名.<p>
	 *
	 */
	public static final String $set_itm_typ_nm = "set_itm_typ_nm";
	/**
	 * Assortment item type details cd. 品揃品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $set_itm_typ_d_cd = "set_itm_typ_d_cd";
	/**
	 * Assortment item type details name 品揃品目区分詳細名.<p>
	 *
	 */
	public static final String $set_itm_typ_d_nm = "set_itm_typ_d_nm";
	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public static final String $main_itm_unit_cd = "main_itm_unit_cd";
	/**
	 * Representative item unit name 代表品目単位名.<p>
	 *
	 */
	public static final String $main_itm_unit_nm = "main_itm_unit_nm";
	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public static final String $main_itm_dec_place = "main_itm_dec_place";
	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public static final String $main_itm_qty = "main_itm_qty";
	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public static final String $set_itm_unit_cd = "set_itm_unit_cd";
	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public static final String $set_itm_unit_nm = "set_itm_unit_nm";
	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public static final String $set_itm_dec_place = "set_itm_dec_place";
	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public static final String $set_itm_qty = "set_itm_qty";
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


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta main_itm_cd_META = createCommonMeta($main_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta main_itm_sub1_META = createCommonMeta($main_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta main_itm_sub2_META = createCommonMeta($main_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta main_itm_sub3_META = createCommonMeta($main_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta main_itm_nm_META = createCommonMeta($main_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta main_itm_typ_META = createCommonMeta($main_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta main_itm_typ_nm_META = createCommonMeta($main_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta main_itm_typ_d_cd_META = createCommonMeta($main_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta main_itm_typ_d_nm_META = createCommonMeta($main_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta set_itm_cd_META = createCommonMeta($set_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta set_itm_sub1_META = createCommonMeta($set_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta set_itm_sub2_META = createCommonMeta($set_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta set_itm_sub3_META = createCommonMeta($set_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta set_itm_nm_META = createCommonMeta($set_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta set_itm_typ_META = createCommonMeta($set_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta set_itm_typ_nm_META = createCommonMeta($set_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta set_itm_typ_d_cd_META = createCommonMeta($set_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta set_itm_typ_d_nm_META = createCommonMeta($set_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta main_itm_unit_cd_META = createCommonMeta($main_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta main_itm_unit_nm_META = createCommonMeta($main_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta main_itm_dec_place_META = createCommonMeta($main_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta main_itm_qty_META = createCommonMeta($main_itm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta set_itm_unit_cd_META = createCommonMeta($set_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta set_itm_unit_nm_META = createCommonMeta($set_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta set_itm_dec_place_META = createCommonMeta($set_itm_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta set_itm_qty_META = createCommonMeta($set_itm_qty, mcframe.commonMA.meta.MA_META.QTY);
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

	protected static final ConstMetaList<Srch01_Rslt2R> constMetas = new ConstMetaList<Srch01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			set_grp_cd_META,
			main_itm_cd_META,
			main_itm_sub1_META,
			main_itm_sub2_META,
			main_itm_sub3_META,
			main_itm_nm_META,
			main_itm_typ_META,
			main_itm_typ_nm_META,
			main_itm_typ_d_cd_META,
			main_itm_typ_d_nm_META,
			set_itm_cd_META,
			set_itm_sub1_META,
			set_itm_sub2_META,
			set_itm_sub3_META,
			set_itm_nm_META,
			set_itm_typ_META,
			set_itm_typ_nm_META,
			set_itm_typ_d_cd_META,
			set_itm_typ_d_nm_META,
			main_itm_unit_cd_META,
			main_itm_unit_nm_META,
			main_itm_dec_place_META,
			main_itm_qty_META,
			set_itm_unit_cd_META,
			set_itm_unit_nm_META,
			set_itm_dec_place_META,
			set_itm_qty_META,
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

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$main_itm_typ, "MAC_ITM_TYP"},	// main_itm_typ
				{$set_itm_typ, "MAC_ITM_TYP"}	// set_itm_typ
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
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 1, $set_grp_cd);
	}

	/**
	 * Assortment group cd. 品揃グループＣＤ.<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 1, $set_grp_cd, value);
	}


	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public String main_itm_cd() {
		return getConstString(offset + 2, $main_itm_cd);
	}

	/**
	 * Representative item cd. 代表品目ＣＤ.<p>
	 *
	 */
	public void main_itm_cd(String value) {
		setConstString(offset + 2, $main_itm_cd, value);
	}


	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public String main_itm_sub1() {
		return getConstString(offset + 3, $main_itm_sub1);
	}

	/**
	 * Representative branch No. 1 代表枝番１.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		setConstString(offset + 3, $main_itm_sub1, value);
	}


	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public String main_itm_sub2() {
		return getConstString(offset + 4, $main_itm_sub2);
	}

	/**
	 * Representative branch No. 2 代表枝番２.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		setConstString(offset + 4, $main_itm_sub2, value);
	}


	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public String main_itm_sub3() {
		return getConstString(offset + 5, $main_itm_sub3);
	}

	/**
	 * Representative branch No. 3 代表枝番３.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		setConstString(offset + 5, $main_itm_sub3, value);
	}


	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public String main_itm_nm() {
		return getConstString(offset + 6, $main_itm_nm);
	}

	/**
	 * Representative item name 代表品名.<p>
	 *
	 */
	public void main_itm_nm(String value) {
		setConstString(offset + 6, $main_itm_nm, value);
	}


	/**
	 * Representative item type 代表品目区分.<p>
	 *
	 */
	public String main_itm_typ() {
		return getConstString(offset + 7, $main_itm_typ);
	}

	/**
	 * Representative item type 代表品目区分.<p>
	 *
	 */
	public void main_itm_typ(String value) {
		setConstString(offset + 7, $main_itm_typ, value);
	}


	/**
	 * Representative item type name 代表品目区分名.<p>
	 *
	 */
	public String main_itm_typ_nm() {
		return getConstString(offset + 8, $main_itm_typ_nm);
	}

	/**
	 * Representative item type name 代表品目区分名.<p>
	 *
	 */
	public void main_itm_typ_nm(String value) {
		setConstString(offset + 8, $main_itm_typ_nm, value);
	}


	/**
	 * Representative item type details cd. 代表品目区分詳細ＣＤ.<p>
	 *
	 */
	public String main_itm_typ_d_cd() {
		return getConstString(offset + 9, $main_itm_typ_d_cd);
	}

	/**
	 * Representative item type details cd. 代表品目区分詳細ＣＤ.<p>
	 *
	 */
	public void main_itm_typ_d_cd(String value) {
		setConstString(offset + 9, $main_itm_typ_d_cd, value);
	}


	/**
	 * Representative item type details name 代表品目区分詳細名.<p>
	 *
	 */
	public String main_itm_typ_d_nm() {
		return getConstString(offset + 10, $main_itm_typ_d_nm);
	}

	/**
	 * Representative item type details name 代表品目区分詳細名.<p>
	 *
	 */
	public void main_itm_typ_d_nm(String value) {
		setConstString(offset + 10, $main_itm_typ_d_nm, value);
	}


	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public String set_itm_cd() {
		return getConstString(offset + 11, $set_itm_cd);
	}

	/**
	 * Assortment item cd. 品揃品目ＣＤ.<p>
	 *
	 */
	public void set_itm_cd(String value) {
		setConstString(offset + 11, $set_itm_cd, value);
	}


	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public String set_itm_sub1() {
		return getConstString(offset + 12, $set_itm_sub1);
	}

	/**
	 * Assortment branch No. 1 品揃枝番１.<p>
	 *
	 */
	public void set_itm_sub1(String value) {
		setConstString(offset + 12, $set_itm_sub1, value);
	}


	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public String set_itm_sub2() {
		return getConstString(offset + 13, $set_itm_sub2);
	}

	/**
	 * Assortment branch No. 2 品揃枝番２.<p>
	 *
	 */
	public void set_itm_sub2(String value) {
		setConstString(offset + 13, $set_itm_sub2, value);
	}


	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public String set_itm_sub3() {
		return getConstString(offset + 14, $set_itm_sub3);
	}

	/**
	 * Assortment branch No. 3 品揃枝番３.<p>
	 *
	 */
	public void set_itm_sub3(String value) {
		setConstString(offset + 14, $set_itm_sub3, value);
	}


	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public String set_itm_nm() {
		return getConstString(offset + 15, $set_itm_nm);
	}

	/**
	 * Assortment item name 品揃品名.<p>
	 *
	 */
	public void set_itm_nm(String value) {
		setConstString(offset + 15, $set_itm_nm, value);
	}


	/**
	 * Assortment item type 品揃品目区分.<p>
	 *
	 */
	public String set_itm_typ() {
		return getConstString(offset + 16, $set_itm_typ);
	}

	/**
	 * Assortment item type 品揃品目区分.<p>
	 *
	 */
	public void set_itm_typ(String value) {
		setConstString(offset + 16, $set_itm_typ, value);
	}


	/**
	 * Assortment item type name 品揃品目区分名.<p>
	 *
	 */
	public String set_itm_typ_nm() {
		return getConstString(offset + 17, $set_itm_typ_nm);
	}

	/**
	 * Assortment item type name 品揃品目区分名.<p>
	 *
	 */
	public void set_itm_typ_nm(String value) {
		setConstString(offset + 17, $set_itm_typ_nm, value);
	}


	/**
	 * Assortment item type details cd. 品揃品目区分詳細ＣＤ.<p>
	 *
	 */
	public String set_itm_typ_d_cd() {
		return getConstString(offset + 18, $set_itm_typ_d_cd);
	}

	/**
	 * Assortment item type details cd. 品揃品目区分詳細ＣＤ.<p>
	 *
	 */
	public void set_itm_typ_d_cd(String value) {
		setConstString(offset + 18, $set_itm_typ_d_cd, value);
	}


	/**
	 * Assortment item type details name 品揃品目区分詳細名.<p>
	 *
	 */
	public String set_itm_typ_d_nm() {
		return getConstString(offset + 19, $set_itm_typ_d_nm);
	}

	/**
	 * Assortment item type details name 品揃品目区分詳細名.<p>
	 *
	 */
	public void set_itm_typ_d_nm(String value) {
		setConstString(offset + 19, $set_itm_typ_d_nm, value);
	}


	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public String main_itm_unit_cd() {
		return getConstString(offset + 20, $main_itm_unit_cd);
	}

	/**
	 * Representative item unit cd. 代表品目単位ＣＤ.<p>
	 *
	 */
	public void main_itm_unit_cd(String value) {
		setConstString(offset + 20, $main_itm_unit_cd, value);
	}


	/**
	 * Representative item unit name 代表品目単位名.<p>
	 *
	 */
	public String main_itm_unit_nm() {
		return getConstString(offset + 21, $main_itm_unit_nm);
	}

	/**
	 * Representative item unit name 代表品目単位名.<p>
	 *
	 */
	public void main_itm_unit_nm(String value) {
		setConstString(offset + 21, $main_itm_unit_nm, value);
	}


	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber main_itm_dec_place() {
		return getConstNumber(offset + 22, $main_itm_dec_place);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 22, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(int value) {
		setConstNumber(offset + 22, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(long value) {
		setConstNumber(offset + 22, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(float value) {
		setConstNumber(offset + 22, $main_itm_dec_place, value);
	}

	/**
	 * Representative item number of decimal places 代表品目小数部有効桁数.<p>
	 *
	 */
	public void main_itm_dec_place(double value) {
		setConstNumber(offset + 22, $main_itm_dec_place, value);
	}


	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public MCNumber main_itm_qty() {
		return getConstNumber(offset + 23, $main_itm_qty);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(MCNumber value) {
		setConstNumber(offset + 23, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(int value) {
		setConstNumber(offset + 23, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(long value) {
		setConstNumber(offset + 23, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(float value) {
		setConstNumber(offset + 23, $main_itm_qty, value);
	}

	/**
	 * Representative item qty. 代表品目数量.<p>
	 *
	 */
	public void main_itm_qty(double value) {
		setConstNumber(offset + 23, $main_itm_qty, value);
	}


	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public String set_itm_unit_cd() {
		return getConstString(offset + 24, $set_itm_unit_cd);
	}

	/**
	 * Assortment item unit cd. 品揃品目単位ＣＤ.<p>
	 *
	 */
	public void set_itm_unit_cd(String value) {
		setConstString(offset + 24, $set_itm_unit_cd, value);
	}


	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public String set_itm_unit_nm() {
		return getConstString(offset + 25, $set_itm_unit_nm);
	}

	/**
	 * Assortment item unit name 品揃品目単位名.<p>
	 *
	 */
	public void set_itm_unit_nm(String value) {
		setConstString(offset + 25, $set_itm_unit_nm, value);
	}


	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public MCNumber set_itm_dec_place() {
		return getConstNumber(offset + 26, $set_itm_dec_place);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(int value) {
		setConstNumber(offset + 26, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(long value) {
		setConstNumber(offset + 26, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(float value) {
		setConstNumber(offset + 26, $set_itm_dec_place, value);
	}

	/**
	 * Assortment item number of decimal places 品揃品目小数部有効桁数.<p>
	 *
	 */
	public void set_itm_dec_place(double value) {
		setConstNumber(offset + 26, $set_itm_dec_place, value);
	}


	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public MCNumber set_itm_qty() {
		return getConstNumber(offset + 27, $set_itm_qty);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void set_itm_qty(MCNumber value) {
		setConstNumber(offset + 27, $set_itm_qty, value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void set_itm_qty(int value) {
		setConstNumber(offset + 27, $set_itm_qty, value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void set_itm_qty(long value) {
		setConstNumber(offset + 27, $set_itm_qty, value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void set_itm_qty(float value) {
		setConstNumber(offset + 27, $set_itm_qty, value);
	}

	/**
	 * Assortment item qty. 品揃品目数量.<p>
	 *
	 */
	public void set_itm_qty(double value) {
		setConstNumber(offset + 27, $set_itm_qty, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 28, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 28, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 29, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 29, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 30, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 30, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 31, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 31, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 32, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 32, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 33, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 33, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 34, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 34, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 35, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 35, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 36, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 37, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 37, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 38, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 38, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 39, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 39, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 40, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 40, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 41, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 41, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 42, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 42, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 43, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 43, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 44, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 44, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 45, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $del_ts, value);
	}


	public String getString(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			return main_itm_nm();
		}
		if ($main_itm_typ.equalsIgnoreCase(name)) {
			return main_itm_typ();
		}
		if ($main_itm_typ_nm.equalsIgnoreCase(name)) {
			return main_itm_typ_nm();
		}
		if ($main_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return main_itm_typ_d_cd();
		}
		if ($main_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return main_itm_typ_d_nm();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			return set_itm_nm();
		}
		if ($set_itm_typ.equalsIgnoreCase(name)) {
			return set_itm_typ();
		}
		if ($set_itm_typ_nm.equalsIgnoreCase(name)) {
			return set_itm_typ_nm();
		}
		if ($set_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return set_itm_typ_d_cd();
		}
		if ($set_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return set_itm_typ_d_nm();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			return main_itm_unit_nm();
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			return set_itm_unit_cd();
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			return set_itm_unit_nm();
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			return main_itm_dec_place();
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			return main_itm_qty();
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			return set_itm_dec_place();
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			return set_itm_qty();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			return main_itm_nm();
		}
		if ($main_itm_typ.equalsIgnoreCase(name)) {
			return main_itm_typ();
		}
		if ($main_itm_typ_nm.equalsIgnoreCase(name)) {
			return main_itm_typ_nm();
		}
		if ($main_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return main_itm_typ_d_cd();
		}
		if ($main_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return main_itm_typ_d_nm();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			return set_itm_nm();
		}
		if ($set_itm_typ.equalsIgnoreCase(name)) {
			return set_itm_typ();
		}
		if ($set_itm_typ_nm.equalsIgnoreCase(name)) {
			return set_itm_typ_nm();
		}
		if ($set_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return set_itm_typ_d_cd();
		}
		if ($set_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return set_itm_typ_d_nm();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			return main_itm_unit_nm();
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			return set_itm_unit_cd();
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			return set_itm_unit_nm();
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			return main_itm_dec_place();
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			return main_itm_qty();
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			return set_itm_dec_place();
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			return set_itm_qty();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			main_itm_nm(value);
			return;
		}
		if ($main_itm_typ.equalsIgnoreCase(name)) {
			main_itm_typ(value);
			return;
		}
		if ($main_itm_typ_nm.equalsIgnoreCase(name)) {
			main_itm_typ_nm(value);
			return;
		}
		if ($main_itm_typ_d_cd.equalsIgnoreCase(name)) {
			main_itm_typ_d_cd(value);
			return;
		}
		if ($main_itm_typ_d_nm.equalsIgnoreCase(name)) {
			main_itm_typ_d_nm(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			set_itm_nm(value);
			return;
		}
		if ($set_itm_typ.equalsIgnoreCase(name)) {
			set_itm_typ(value);
			return;
		}
		if ($set_itm_typ_nm.equalsIgnoreCase(name)) {
			set_itm_typ_nm(value);
			return;
		}
		if ($set_itm_typ_d_cd.equalsIgnoreCase(name)) {
			set_itm_typ_d_cd(value);
			return;
		}
		if ($set_itm_typ_d_nm.equalsIgnoreCase(name)) {
			set_itm_typ_d_nm(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			main_itm_unit_nm(value);
			return;
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			set_itm_unit_cd(value);
			return;
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			set_itm_unit_nm(value);
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			main_itm_nm(value);
			return;
		}
		if ($main_itm_typ.equalsIgnoreCase(name)) {
			main_itm_typ(value);
			return;
		}
		if ($main_itm_typ_nm.equalsIgnoreCase(name)) {
			main_itm_typ_nm(value);
			return;
		}
		if ($main_itm_typ_d_cd.equalsIgnoreCase(name)) {
			main_itm_typ_d_cd(value);
			return;
		}
		if ($main_itm_typ_d_nm.equalsIgnoreCase(name)) {
			main_itm_typ_d_nm(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			set_itm_nm(value);
			return;
		}
		if ($set_itm_typ.equalsIgnoreCase(name)) {
			set_itm_typ(value);
			return;
		}
		if ($set_itm_typ_nm.equalsIgnoreCase(name)) {
			set_itm_typ_nm(value);
			return;
		}
		if ($set_itm_typ_d_cd.equalsIgnoreCase(name)) {
			set_itm_typ_d_cd(value);
			return;
		}
		if ($set_itm_typ_d_nm.equalsIgnoreCase(name)) {
			set_itm_typ_d_nm(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			main_itm_unit_nm(value);
			return;
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			set_itm_unit_cd(value);
			return;
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			set_itm_unit_nm(value);
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
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($main_itm_dec_place.equalsIgnoreCase(name)) {
			main_itm_dec_place(value);
			return;
		}
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_dec_place.equalsIgnoreCase(name)) {
			set_itm_dec_place(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

