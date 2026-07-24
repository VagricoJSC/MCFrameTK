package mcframe.clientMABS.MABSP0910;

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
 * ブロック"ItmDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ItmDtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
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
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_grp_cd = "sls_upri_grp_cd";
	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public static final String $sls_upri_grp_nm = "sls_upri_grp_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public static final String $sls_upri_rank_cd = "sls_upri_rank_cd";
	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public static final String $sls_upri_rank_nm = "sls_upri_rank_nm";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public static final String $lot_qty = "lot_qty";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri = "upri";
	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public static final String $upri_bf = "upri_bf";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public static final String $upri_rate = "upri_rate";
	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public static final String $upri_rate_bf = "upri_rate_bf";
	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public static final String $sub_upri1 = "sub_upri1";
	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public static final String $sub_upri2 = "sub_upri2";
	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public static final String $sub_upri3 = "sub_upri3";
	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public static final String $not_cost_flg = "not_cost_flg";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sls_upri_grp_cd_META = createCommonMeta($sls_upri_grp_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_CD);
	public static final MCMeta sls_upri_grp_nm_META = createCommonMeta($sls_upri_grp_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_GRP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta sls_upri_rank_cd_META = createCommonMeta($sls_upri_rank_cd, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_CD);
	public static final MCMeta sls_upri_rank_nm_META = createCommonMeta($sls_upri_rank_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_RANK_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta lot_qty_META = createCommonMeta($lot_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta upri_META = createCommonMeta($upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_bf_META = createCommonMeta($upri_bf, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upri_rate_META = createCommonMeta($upri_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta upri_rate_bf_META = createCommonMeta($upri_rate_bf, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta sub_upri1_META = createCommonMeta($sub_upri1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri2_META = createCommonMeta($sub_upri2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri3_META = createCommonMeta($sub_upri3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_cost_flg_META = createCommonMeta($not_cost_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<ItmDtlR> constMetas = new ConstMetaList<ItmDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			wg_cd_META,
			wg_nm_META,
			sls_upri_grp_cd_META,
			sls_upri_grp_nm_META,
			itm_p_META,
			sls_upri_rank_cd_META,
			sls_upri_rank_nm_META,
			unit_cd_META,
			unit_nm_META,
			lot_qty_META,
			cur_cd_META,
			cur_nm_META,
			st_dt_META,
			end_dt_META,
			upri_META,
			upri_bf_META,
			interim_flg_META,
			upri_rate_META,
			upri_rate_bf_META,
			sub_upri1_META,
			sub_upri2_META,
			sub_upri3_META,
			not_cost_flg_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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
	protected ItmDtlR_MC_A(ConstMetaList<? extends ItmDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmDtlR clone() {
		return (ItmDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmDtlR createInstance() {
		return (ItmDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ItmDtlR getValues(String... names) {
		return (ItmDtlR) super.getValues(names);
	}



	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 2, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 2, $wg_nm, value);
	}


	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public String sls_upri_grp_cd() {
		return getConstString(offset + 3, $sls_upri_grp_cd);
	}

	/**
	 * Sales unit price classification cd. 販売単価分類ＣＤ.<p>
	 *
	 */
	public void sls_upri_grp_cd(String value) {
		setConstString(offset + 3, $sls_upri_grp_cd, value);
	}


	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public String sls_upri_grp_nm() {
		return getConstString(offset + 4, $sls_upri_grp_nm);
	}

	/**
	 * Sales unit price classification name 販売単価分類名.<p>
	 *
	 */
	public void sls_upri_grp_nm(String value) {
		setConstString(offset + 4, $sls_upri_grp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $itm_p, row);
	}


	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public String sls_upri_rank_cd() {
		return getConstString(offset + 6, $sls_upri_rank_cd);
	}

	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public void sls_upri_rank_cd(String value) {
		setConstString(offset + 6, $sls_upri_rank_cd, value);
	}


	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public String sls_upri_rank_nm() {
		return getConstString(offset + 7, $sls_upri_rank_nm);
	}

	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public void sls_upri_rank_nm(String value) {
		setConstString(offset + 7, $sls_upri_rank_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 8, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 8, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 9, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 9, $unit_nm, value);
	}


	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public MCNumber lot_qty() {
		return getConstNumber(offset + 10, $lot_qty);
	}

	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public void lot_qty(MCNumber value) {
		setConstNumber(offset + 10, $lot_qty, value);
	}

	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public void lot_qty(int value) {
		setConstNumber(offset + 10, $lot_qty, value);
	}

	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public void lot_qty(long value) {
		setConstNumber(offset + 10, $lot_qty, value);
	}

	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public void lot_qty(float value) {
		setConstNumber(offset + 10, $lot_qty, value);
	}

	/**
	 * Lot qty. ロット数.<p>
	 *
	 */
	public void lot_qty(double value) {
		setConstNumber(offset + 10, $lot_qty, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 11, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 11, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 12, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 12, $cur_nm, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 13, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 13, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 14, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 14, $end_dt, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 15, $upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 15, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 15, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 15, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 15, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 15, $upri, value);
	}


	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public MCNumber upri_bf() {
		return getConstNumber(offset + 16, $upri_bf);
	}

	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public void upri_bf(MCNumber value) {
		setConstNumber(offset + 16, $upri_bf, value);
	}

	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public void upri_bf(int value) {
		setConstNumber(offset + 16, $upri_bf, value);
	}

	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public void upri_bf(long value) {
		setConstNumber(offset + 16, $upri_bf, value);
	}

	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public void upri_bf(float value) {
		setConstNumber(offset + 16, $upri_bf, value);
	}

	/**
	 * Unit price before revised 改定前単価.<p>
	 *
	 */
	public void upri_bf(double value) {
		setConstNumber(offset + 16, $upri_bf, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 17, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 17, $interim_flg, value);
	}


	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public MCNumber upri_rate() {
		return getConstNumber(offset + 18, $upri_rate);
	}

	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public void upri_rate(MCNumber value) {
		setConstNumber(offset + 18, $upri_rate, value);
	}

	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public void upri_rate(int value) {
		setConstNumber(offset + 18, $upri_rate, value);
	}

	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public void upri_rate(long value) {
		setConstNumber(offset + 18, $upri_rate, value);
	}

	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public void upri_rate(float value) {
		setConstNumber(offset + 18, $upri_rate, value);
	}

	/**
	 * Ratio (%) 掛率（％）.<p>
	 *
	 */
	public void upri_rate(double value) {
		setConstNumber(offset + 18, $upri_rate, value);
	}


	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public MCNumber upri_rate_bf() {
		return getConstNumber(offset + 19, $upri_rate_bf);
	}

	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public void upri_rate_bf(MCNumber value) {
		setConstNumber(offset + 19, $upri_rate_bf, value);
	}

	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public void upri_rate_bf(int value) {
		setConstNumber(offset + 19, $upri_rate_bf, value);
	}

	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public void upri_rate_bf(long value) {
		setConstNumber(offset + 19, $upri_rate_bf, value);
	}

	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public void upri_rate_bf(float value) {
		setConstNumber(offset + 19, $upri_rate_bf, value);
	}

	/**
	 * Ratio before revision (%) 改定前掛率（％）.<p>
	 *
	 */
	public void upri_rate_bf(double value) {
		setConstNumber(offset + 19, $upri_rate_bf, value);
	}


	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public MCNumber sub_upri1() {
		return getConstNumber(offset + 20, $sub_upri1);
	}

	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public void sub_upri1(MCNumber value) {
		setConstNumber(offset + 20, $sub_upri1, value);
	}

	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public void sub_upri1(int value) {
		setConstNumber(offset + 20, $sub_upri1, value);
	}

	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public void sub_upri1(long value) {
		setConstNumber(offset + 20, $sub_upri1, value);
	}

	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public void sub_upri1(float value) {
		setConstNumber(offset + 20, $sub_upri1, value);
	}

	/**
	 * Spare unit price 1 予備単価１.<p>
	 *
	 */
	public void sub_upri1(double value) {
		setConstNumber(offset + 20, $sub_upri1, value);
	}


	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public MCNumber sub_upri2() {
		return getConstNumber(offset + 21, $sub_upri2);
	}

	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public void sub_upri2(MCNumber value) {
		setConstNumber(offset + 21, $sub_upri2, value);
	}

	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public void sub_upri2(int value) {
		setConstNumber(offset + 21, $sub_upri2, value);
	}

	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public void sub_upri2(long value) {
		setConstNumber(offset + 21, $sub_upri2, value);
	}

	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public void sub_upri2(float value) {
		setConstNumber(offset + 21, $sub_upri2, value);
	}

	/**
	 * Spare unit price 2 予備単価２.<p>
	 *
	 */
	public void sub_upri2(double value) {
		setConstNumber(offset + 21, $sub_upri2, value);
	}


	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public MCNumber sub_upri3() {
		return getConstNumber(offset + 22, $sub_upri3);
	}

	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public void sub_upri3(MCNumber value) {
		setConstNumber(offset + 22, $sub_upri3, value);
	}

	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public void sub_upri3(int value) {
		setConstNumber(offset + 22, $sub_upri3, value);
	}

	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public void sub_upri3(long value) {
		setConstNumber(offset + 22, $sub_upri3, value);
	}

	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public void sub_upri3(float value) {
		setConstNumber(offset + 22, $sub_upri3, value);
	}

	/**
	 * Spare unit price 3 予備単価３.<p>
	 *
	 */
	public void sub_upri3(double value) {
		setConstNumber(offset + 22, $sub_upri3, value);
	}


	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public boolean not_cost_flg() {
		return getConstBoolean(offset + 23, $not_cost_flg);
	}

	/**
	 * Not costing 原価対象外.<p>
	 *
	 */
	public void not_cost_flg(boolean value) {
		setConstBoolean(offset + 23, $not_cost_flg, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 24, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 24, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 25, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 25, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 26, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 26, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 27, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 27, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 28, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 28, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 29, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 30, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 30, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 31, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 31, $ins_func_nm, value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			return sls_upri_rank_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			return lot_qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			return upri_bf();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			return upri_rate_bf();
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			return sub_upri1();
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			return sub_upri2();
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			return sub_upri3();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
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
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			return sls_upri_grp_cd();
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			return sls_upri_grp_nm();
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			return sls_upri_rank_cd();
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			return sls_upri_rank_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			return lot_qty();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			return upri_bf();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			return upri_rate_bf();
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			return sub_upri1();
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			return sub_upri2();
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			return sub_upri3();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			return not_cost_flg();
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
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			sls_upri_rank_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
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
		if ($sls_upri_grp_cd.equalsIgnoreCase(name)) {
			sls_upri_grp_cd(value);
			return;
		}
		if ($sls_upri_grp_nm.equalsIgnoreCase(name)) {
			sls_upri_grp_nm(value);
			return;
		}
		if ($sls_upri_rank_cd.equalsIgnoreCase(name)) {
			sls_upri_rank_cd(value);
			return;
		}
		if ($sls_upri_rank_nm.equalsIgnoreCase(name)) {
			sls_upri_rank_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($lot_qty.equalsIgnoreCase(name)) {
			lot_qty(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($upri_bf.equalsIgnoreCase(name)) {
			upri_bf(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($upri_rate_bf.equalsIgnoreCase(name)) {
			upri_rate_bf(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($not_cost_flg.equalsIgnoreCase(name)) {
			not_cost_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

}

