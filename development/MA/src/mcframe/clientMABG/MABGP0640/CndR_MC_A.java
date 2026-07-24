package mcframe.clientMABG.MABGP0640;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	public static final String $dt_p = "dt_p";
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public static final String $calc_ctg_cd = "calc_ctg_cd";
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public static final String $calc_ctg_nm = "calc_ctg_nm";
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
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public static final String $ac_slip_typ_nm = "ac_slip_typ_nm";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	/**
	 * Null 無.<p>
	 *
	 */
	public static final String $no_itm_jnl_flg = "no_itm_jnl_flg";
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public static final String $ac_rsn_nm = "ac_rsn_nm";
	/**
	 * Null 無.<p>
	 *
	 */
	public static final String $no_ac_rsn_flg = "no_ac_rsn_flg";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $tgt_dpt_cd = "tgt_dpt_cd";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $tgt_dpt_nm = "tgt_dpt_nm";
	/**
	 * Null 無.<p>
	 *
	 */
	public static final String $no_tgt_dpt_flg = "no_tgt_dpt_flg";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $tgt_loc_cd = "tgt_loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $tgt_loc_nm = "tgt_loc_nm";
	/**
	 * Null 無.<p>
	 *
	 */
	public static final String $no_tgt_loc_flg = "no_tgt_loc_flg";
	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public static final String $io_trans_typ = "io_trans_typ";
	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public static final String $io_trans_typ_nm = "io_trans_typ_nm";
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
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public static final String $off_del_flg = "off_del_flg";
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public static final String $on_del_flg = "on_del_flg";

	public static final String $dt = $dt_p + ".dt";
	public static final String $st_dt_fr = $dt_p + ".st_dt_fr";
	public static final String $st_dt_to = $dt_p + ".st_dt_to";
	public static final String $end_dt_fr = $dt_p + ".end_dt_fr";
	public static final String $end_dt_to = $dt_p + ".end_dt_to";

	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP0020.StEndDtR.class);
	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta calc_ctg_cd_META = createCommonMeta($calc_ctg_cd, mcframe.commonMA.meta.MA_META.CALC_CTG_CD);
	public static final MCMeta calc_ctg_nm_META = createCommonMeta($calc_ctg_nm, mcframe.commonMA.meta.MA_META.CALC_CTG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_slip_typ_nm_META = createCommonMeta($ac_slip_typ_nm, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP_NM);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta no_itm_jnl_flg_META = createCommonMeta($no_itm_jnl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);
	public static final MCMeta ac_rsn_nm_META = createCommonMeta($ac_rsn_nm, mcframe.commonMA.meta.MA_META.AC_RSN_NM);
	public static final MCMeta no_ac_rsn_flg_META = createCommonMeta($no_ac_rsn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tgt_dpt_cd_META = createCommonMeta($tgt_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta tgt_dpt_nm_META = createCommonMeta($tgt_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta no_tgt_dpt_flg_META = createCommonMeta($no_tgt_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tgt_loc_cd_META = createCommonMeta($tgt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta tgt_loc_nm_META = createCommonMeta($tgt_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta no_tgt_loc_flg_META = createCommonMeta($no_tgt_loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_trans_typ_META = createCommonMeta($io_trans_typ, mcframe.commonMA.meta.MA_META.IO_TRANS_TYP);
	public static final MCMeta io_trans_typ_nm_META = createCommonMeta($io_trans_typ_nm, mcframe.commonMA.meta.MA_META.IO_TRANS_TYP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta off_del_flg_META = createCommonMeta($off_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta on_del_flg_META = createCommonMeta($on_del_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dt_p_META,
			ope_META,
			calc_ctg_cd_META,
			calc_ctg_nm_META,
			wg_cd_META,
			wg_nm_META,
			ac_slip_typ_META,
			ac_slip_typ_nm_META,
			itm_jnl_cd_META,
			itm_jnl_nm_META,
			no_itm_jnl_flg_META,
			ac_rsn_cd_META,
			ac_rsn_nm_META,
			no_ac_rsn_flg_META,
			tgt_dpt_cd_META,
			tgt_dpt_nm_META,
			no_tgt_dpt_flg_META,
			tgt_loc_cd_META,
			tgt_loc_nm_META,
			no_tgt_loc_flg_META,
			io_trans_typ_META,
			io_trans_typ_nm_META,
			memo1_META,
			memo2_META,
			memo3_META,
			off_del_flg_META,
			on_del_flg_META
		},
		new String[][]{
			{
				"dt",
				"st_dt_fr",
				"st_dt_to",
				"end_dt_fr",
				"end_dt_to"
			},
			{
				$dt,
				$st_dt_fr,
				$st_dt_to,
				$end_dt_fr,
				$end_dt_to
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
				{$tgt_dpt_cd, "dpt_nm"},	// tgt_dpt_cd
				{$tgt_loc_cd, "loc_nm"}	// tgt_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$tgt_dpt_cd, "dt;true"}	// tgt_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "rd_flg"},	// wg_cd
				{$tgt_dpt_cd, "ym;mode_this_month_flg"}	// tgt_dpt_cd
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0020.StEndDtR dt_p(){
		return (mcframe.clientMAUB.MAUBP0020.StEndDtR) getConstInnerRow(offset + 0, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP0020.StEndDtR row){
		setConstInnerRow(offset + 0, $dt_p, row);
	}


	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 1, $ope);
	}

	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 1, $ope, value);
	}


	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public String calc_ctg_cd() {
		return getConstString(offset + 2, $calc_ctg_cd);
	}

	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public void calc_ctg_cd(String value) {
		setConstString(offset + 2, $calc_ctg_cd, value);
	}


	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public String calc_ctg_nm() {
		return getConstString(offset + 3, $calc_ctg_nm);
	}

	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public void calc_ctg_nm(String value) {
		setConstString(offset + 3, $calc_ctg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 5, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 5, $wg_nm, value);
	}


	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 6, $ac_slip_typ);
	}

	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 6, $ac_slip_typ, value);
	}


	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public String ac_slip_typ_nm() {
		return getConstString(offset + 7, $ac_slip_typ_nm);
	}

	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public void ac_slip_typ_nm(String value) {
		setConstString(offset + 7, $ac_slip_typ_nm, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 8, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 8, $itm_jnl_cd, value);
	}


	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 9, $itm_jnl_nm);
	}

	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 9, $itm_jnl_nm, value);
	}


	/**
	 * Null 無.<p>
	 *
	 */
	public boolean no_itm_jnl_flg() {
		return getConstBoolean(offset + 10, $no_itm_jnl_flg);
	}

	/**
	 * Null 無.<p>
	 *
	 */
	public void no_itm_jnl_flg(boolean value) {
		setConstBoolean(offset + 10, $no_itm_jnl_flg, value);
	}


	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 11, $ac_rsn_cd);
	}

	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 11, $ac_rsn_cd, value);
	}


	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public String ac_rsn_nm() {
		return getConstString(offset + 12, $ac_rsn_nm);
	}

	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public void ac_rsn_nm(String value) {
		setConstString(offset + 12, $ac_rsn_nm, value);
	}


	/**
	 * Null 無.<p>
	 *
	 */
	public boolean no_ac_rsn_flg() {
		return getConstBoolean(offset + 13, $no_ac_rsn_flg);
	}

	/**
	 * Null 無.<p>
	 *
	 */
	public void no_ac_rsn_flg(boolean value) {
		setConstBoolean(offset + 13, $no_ac_rsn_flg, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String tgt_dpt_cd() {
		return getConstString(offset + 14, $tgt_dpt_cd);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void tgt_dpt_cd(String value) {
		setConstString(offset + 14, $tgt_dpt_cd, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String tgt_dpt_nm() {
		return getConstString(offset + 15, $tgt_dpt_nm);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void tgt_dpt_nm(String value) {
		setConstString(offset + 15, $tgt_dpt_nm, value);
	}


	/**
	 * Null 無.<p>
	 *
	 */
	public boolean no_tgt_dpt_flg() {
		return getConstBoolean(offset + 16, $no_tgt_dpt_flg);
	}

	/**
	 * Null 無.<p>
	 *
	 */
	public void no_tgt_dpt_flg(boolean value) {
		setConstBoolean(offset + 16, $no_tgt_dpt_flg, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String tgt_loc_cd() {
		return getConstString(offset + 17, $tgt_loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void tgt_loc_cd(String value) {
		setConstString(offset + 17, $tgt_loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String tgt_loc_nm() {
		return getConstString(offset + 18, $tgt_loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void tgt_loc_nm(String value) {
		setConstString(offset + 18, $tgt_loc_nm, value);
	}


	/**
	 * Null 無.<p>
	 *
	 */
	public boolean no_tgt_loc_flg() {
		return getConstBoolean(offset + 19, $no_tgt_loc_flg);
	}

	/**
	 * Null 無.<p>
	 *
	 */
	public void no_tgt_loc_flg(boolean value) {
		setConstBoolean(offset + 19, $no_tgt_loc_flg, value);
	}


	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public String io_trans_typ() {
		return getConstString(offset + 20, $io_trans_typ);
	}

	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public void io_trans_typ(String value) {
		setConstString(offset + 20, $io_trans_typ, value);
	}


	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public String io_trans_typ_nm() {
		return getConstString(offset + 21, $io_trans_typ_nm);
	}

	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public void io_trans_typ_nm(String value) {
		setConstString(offset + 21, $io_trans_typ_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 22, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 22, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 23, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 23, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 24, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 24, $memo3, value);
	}


	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public boolean off_del_flg() {
		return getConstBoolean(offset + 25, $off_del_flg);
	}

	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public void off_del_flg(boolean value) {
		setConstBoolean(offset + 25, $off_del_flg, value);
	}


	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public boolean on_del_flg() {
		return getConstBoolean(offset + 26, $on_del_flg);
	}

	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public void on_del_flg(boolean value) {
		setConstBoolean(offset + 26, $on_del_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			return tgt_dpt_cd();
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			return tgt_dpt_nm();
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			return tgt_loc_cd();
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			return tgt_loc_nm();
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			return io_trans_typ();
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			return io_trans_typ_nm();
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
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($no_itm_jnl_flg.equalsIgnoreCase(name)) {
			return no_itm_jnl_flg();
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			return no_ac_rsn_flg();
		}
		if ($no_tgt_dpt_flg.equalsIgnoreCase(name)) {
			return no_tgt_dpt_flg();
		}
		if ($no_tgt_loc_flg.equalsIgnoreCase(name)) {
			return no_tgt_loc_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			return calc_ctg_cd();
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			return calc_ctg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			return ac_slip_typ_nm();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			return ac_rsn_nm();
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			return tgt_dpt_cd();
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			return tgt_dpt_nm();
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			return tgt_loc_cd();
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			return tgt_loc_nm();
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			return io_trans_typ();
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			return io_trans_typ_nm();
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
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($no_itm_jnl_flg.equalsIgnoreCase(name)) {
			return no_itm_jnl_flg();
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			return no_ac_rsn_flg();
		}
		if ($no_tgt_dpt_flg.equalsIgnoreCase(name)) {
			return no_tgt_dpt_flg();
		}
		if ($no_tgt_loc_flg.equalsIgnoreCase(name)) {
			return no_tgt_loc_flg();
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			return off_del_flg();
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			return on_del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			tgt_dpt_cd(value);
			return;
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			tgt_dpt_nm(value);
			return;
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			tgt_loc_cd(value);
			return;
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			tgt_loc_nm(value);
			return;
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			io_trans_typ(value);
			return;
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			io_trans_typ_nm(value);
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
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($no_itm_jnl_flg.equalsIgnoreCase(name)) {
			no_itm_jnl_flg(value);
			return;
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			no_ac_rsn_flg(value);
			return;
		}
		if ($no_tgt_dpt_flg.equalsIgnoreCase(name)) {
			no_tgt_dpt_flg(value);
			return;
		}
		if ($no_tgt_loc_flg.equalsIgnoreCase(name)) {
			no_tgt_loc_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($calc_ctg_cd.equalsIgnoreCase(name)) {
			calc_ctg_cd(value);
			return;
		}
		if ($calc_ctg_nm.equalsIgnoreCase(name)) {
			calc_ctg_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_slip_typ_nm.equalsIgnoreCase(name)) {
			ac_slip_typ_nm(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		if ($ac_rsn_nm.equalsIgnoreCase(name)) {
			ac_rsn_nm(value);
			return;
		}
		if ($tgt_dpt_cd.equalsIgnoreCase(name)) {
			tgt_dpt_cd(value);
			return;
		}
		if ($tgt_dpt_nm.equalsIgnoreCase(name)) {
			tgt_dpt_nm(value);
			return;
		}
		if ($tgt_loc_cd.equalsIgnoreCase(name)) {
			tgt_loc_cd(value);
			return;
		}
		if ($tgt_loc_nm.equalsIgnoreCase(name)) {
			tgt_loc_nm(value);
			return;
		}
		if ($io_trans_typ.equalsIgnoreCase(name)) {
			io_trans_typ(value);
			return;
		}
		if ($io_trans_typ_nm.equalsIgnoreCase(name)) {
			io_trans_typ_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($no_itm_jnl_flg.equalsIgnoreCase(name)) {
			no_itm_jnl_flg(value);
			return;
		}
		if ($no_ac_rsn_flg.equalsIgnoreCase(name)) {
			no_ac_rsn_flg(value);
			return;
		}
		if ($no_tgt_dpt_flg.equalsIgnoreCase(name)) {
			no_tgt_dpt_flg(value);
			return;
		}
		if ($no_tgt_loc_flg.equalsIgnoreCase(name)) {
			no_tgt_loc_flg(value);
			return;
		}
		if ($off_del_flg.equalsIgnoreCase(name)) {
			off_del_flg(value);
			return;
		}
		if ($on_del_flg.equalsIgnoreCase(name)) {
			on_del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0020.StEndDtR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate dt() {
		return dt_p().dt();
	}

	public void dt(MCDate value) {
		dt_p().dt(value);
	}

	public MCDate st_dt_fr() {
		return dt_p().st_dt_fr();
	}

	public void st_dt_fr(MCDate value) {
		dt_p().st_dt_fr(value);
	}

	public MCDate st_dt_to() {
		return dt_p().st_dt_to();
	}

	public void st_dt_to(MCDate value) {
		dt_p().st_dt_to(value);
	}

	public MCDate end_dt_fr() {
		return dt_p().end_dt_fr();
	}

	public void end_dt_fr(MCDate value) {
		dt_p().end_dt_fr(value);
	}

	public MCDate end_dt_to() {
		return dt_p().end_dt_to();
	}

	public void end_dt_to(MCDate value) {
		dt_p().end_dt_to(value);
	}

}

