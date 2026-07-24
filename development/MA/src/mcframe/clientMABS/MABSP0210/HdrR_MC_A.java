package mcframe.clientMABS.MABSP0210;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public static final String $lot_inh_col_typ = "lot_inh_col_typ";
	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public static final String $lot_inh_col_typ_nm = "lot_inh_col_typ_nm";
	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public static final String $lot_inh_typ = "lot_inh_typ";
	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public static final String $lot_inh_typ_nm = "lot_inh_typ_nm";
	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public static final String $add_concat_col = "add_concat_col";
	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public static final String $add_concat_col_nm = "add_concat_col_nm";
	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public static final String $overflow_err_flg = "overflow_err_flg";
	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";

	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";

	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta lot_inh_col_typ_META = createCommonMeta($lot_inh_col_typ, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP);
	public static final MCMeta lot_inh_col_typ_nm_META = createCommonMeta($lot_inh_col_typ_nm, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP_NM);
	public static final MCMeta lot_inh_typ_META = createCommonMeta($lot_inh_typ, mcframe.commonMA.meta.MA_META.LOT_INH_TYP);
	public static final MCMeta lot_inh_typ_nm_META = createCommonMeta($lot_inh_typ_nm, mcframe.commonMA.meta.MA_META.LOT_INH_TYP_NM);
	public static final MCMeta add_concat_col_META = createCommonMeta($add_concat_col, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP);
	public static final MCMeta add_concat_col_nm_META = createCommonMeta($add_concat_col_nm, mcframe.commonMA.meta.MA_META.LOT_INH_COL_TYP_NM);
	public static final MCMeta overflow_err_flg_META = createCommonMeta($overflow_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			par_itm_p_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			lot_inh_col_typ_META,
			lot_inh_col_typ_nm_META,
			lot_inh_typ_META,
			lot_inh_typ_nm_META,
			add_concat_col_META,
			add_concat_col_nm_META,
			overflow_err_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			upd_cntr_META
		},
		new String[][]{
			{
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm"
			},
			{
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$par_itm_p + ".itm_cd",	// par_itm_p.itm_cd
			$par_itm_p + ".itm_sub1",	// par_itm_p.itm_sub1
			$par_itm_p + ".itm_sub2",	// par_itm_p.itm_sub2
			$par_itm_p + ".itm_sub3",	// par_itm_p.itm_sub3
			$wg_cd,	// wg_cd
			$bom_ptn,	// bom_ptn
			$lot_inh_col_typ	// lot_inh_col_typ
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;def_bom_ptn"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;def_bom_ptn"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_nm;itm_sub3;def_bom_ptn"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_nm;def_bom_ptn"},	// par_itm_p.itm_sub3
				{$wg_cd, "wg_nm"},	// wg_cd
				{$add_concat_col, "lot_inh_col_typ_nm"}	// add_concat_col
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST;par_itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST;par_itm_cd;par_itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.LOT_INH_DEST;par_itm_cd;par_itm_sub1;par_itm_sub2"},	// par_itm_p.itm_sub3
				{$wg_cd, "true"},	// wg_cd
				{$bom_ptn, "par_itm_cd;par_itm_sub1;par_itm_sub2;par_itm_sub3;wg_cd"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$par_itm_p + ".itm_cd", "itm_is_srch_typ"},	// par_itm_p.itm_cd
				{$par_itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// par_itm_p.itm_sub1
				{$par_itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// par_itm_p.itm_sub2
				{$par_itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// par_itm_p.itm_sub3
				{$wg_cd, "rd_flg"},	// wg_cd
				{$bom_ptn, "par_itm_cd;par_itm_sub1;par_itm_sub2;par_itm_sub3;wg_cd"}	// bom_ptn
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
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


	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 1, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 1, $par_itm_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 3, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 3, $wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 4, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 4, $bom_ptn, value);
	}


	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public String lot_inh_col_typ() {
		return getConstString(offset + 5, $lot_inh_col_typ);
	}

	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public void lot_inh_col_typ(String value) {
		setConstString(offset + 5, $lot_inh_col_typ, value);
	}


	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public String lot_inh_col_typ_nm() {
		return getConstString(offset + 6, $lot_inh_col_typ_nm);
	}

	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public void lot_inh_col_typ_nm(String value) {
		setConstString(offset + 6, $lot_inh_col_typ_nm, value);
	}


	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public String lot_inh_typ() {
		return getConstString(offset + 7, $lot_inh_typ);
	}

	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public void lot_inh_typ(String value) {
		setConstString(offset + 7, $lot_inh_typ, value);
	}


	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public String lot_inh_typ_nm() {
		return getConstString(offset + 8, $lot_inh_typ_nm);
	}

	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public void lot_inh_typ_nm(String value) {
		setConstString(offset + 8, $lot_inh_typ_nm, value);
	}


	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public String add_concat_col() {
		return getConstString(offset + 9, $add_concat_col);
	}

	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public void add_concat_col(String value) {
		setConstString(offset + 9, $add_concat_col, value);
	}


	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public String add_concat_col_nm() {
		return getConstString(offset + 10, $add_concat_col_nm);
	}

	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public void add_concat_col_nm(String value) {
		setConstString(offset + 10, $add_concat_col_nm, value);
	}


	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public boolean overflow_err_flg() {
		return getConstBoolean(offset + 11, $overflow_err_flg);
	}

	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public void overflow_err_flg(boolean value) {
		setConstBoolean(offset + 11, $overflow_err_flg, value);
	}


	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 12, $memo1);
	}

	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 12, $memo1, value);
	}


	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 13, $memo2);
	}

	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 13, $memo2, value);
	}


	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 14, $memo3);
	}

	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 14, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 15, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 15, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 16, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 16, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 17, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 17, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 18, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 18, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 19, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 19, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 20, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 20, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 21, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 21, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 22, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 22, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 23, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 24, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 25, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 25, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 26, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 26, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 27, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 27, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 28, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 28, $del_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 29, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			return lot_inh_col_typ();
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_col_typ_nm();
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			return lot_inh_typ();
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_typ_nm();
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			return add_concat_col();
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			return add_concat_col_nm();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			return overflow_err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			return lot_inh_col_typ();
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_col_typ_nm();
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			return lot_inh_typ();
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			return lot_inh_typ_nm();
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			return add_concat_col();
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			return add_concat_col_nm();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			return overflow_err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			lot_inh_col_typ(value);
			return;
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_col_typ_nm(value);
			return;
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			lot_inh_typ(value);
			return;
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_typ_nm(value);
			return;
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			add_concat_col(value);
			return;
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			add_concat_col_nm(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			overflow_err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($lot_inh_col_typ.equalsIgnoreCase(name)) {
			lot_inh_col_typ(value);
			return;
		}
		if ($lot_inh_col_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_col_typ_nm(value);
			return;
		}
		if ($lot_inh_typ.equalsIgnoreCase(name)) {
			lot_inh_typ(value);
			return;
		}
		if ($lot_inh_typ_nm.equalsIgnoreCase(name)) {
			lot_inh_typ_nm(value);
			return;
		}
		if ($add_concat_col.equalsIgnoreCase(name)) {
			add_concat_col(value);
			return;
		}
		if ($add_concat_col_nm.equalsIgnoreCase(name)) {
			add_concat_col_nm(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($overflow_err_flg.equalsIgnoreCase(name)) {
			overflow_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

}

