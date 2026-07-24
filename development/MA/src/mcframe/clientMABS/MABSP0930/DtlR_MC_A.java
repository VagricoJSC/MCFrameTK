package mcframe.clientMABS.MABSP0930;

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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Direct delivery sales 仕入直送売上.<p>
	 *
	 */
	public static final String $ddlv_sls_flg = "ddlv_sls_flg";
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Delivery/relay location cd. 納入／中継場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Delivery/relay location name 納入／中継場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
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
	public static final String $itm_p = "itm_p";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
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
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	public static final String $qty_p = "qty_p";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public static final String $outsrc_upri_typ_nm = "outsrc_upri_typ_nm";
	/**
	 * Unit price 単価.<p>
	 *
	 */
	public static final String $upri = "upri";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public static final String $proc_upri = "proc_upri";
	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public static final String $onr_prov_upri = "onr_prov_upri";
	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public static final String $slf_supprt_upri = "slf_supprt_upri";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public static final String $proc_amt = "proc_amt";
	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public static final String $onr_prov_amt = "onr_prov_amt";
	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public static final String $slf_supprt_amt = "slf_supprt_amt";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $qty = $qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ddlv_sls_flg_META = createCommonMeta($ddlv_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta outsrc_upri_typ_nm_META = createCommonMeta($outsrc_upri_typ_nm, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP_NM);
	public static final MCMeta upri_META = createCommonMeta($upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_upri_META = createCommonMeta($proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_upri_META = createCommonMeta($onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slf_supprt_upri_META = createCommonMeta($slf_supprt_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta proc_amt_META = createCommonMeta($proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_amt_META = createCommonMeta($onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta slf_supprt_amt_META = createCommonMeta($slf_supprt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			peg_no_META,
			ddlv_sls_flg_META,
			dt_META,
			dpt_cd_META,
			dpt_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			loc_cd_META,
			loc_nm_META,
			wg_cd_META,
			wg_nm_META,
			itm_p_META,
			sppl_cd_META,
			sppl_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			bom_ptn_META,
			maker_cd_META,
			maker_nm_META,
			cur_cd_META,
			cur_nm_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			qty_p_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			outsrc_upri_typ_META,
			outsrc_upri_typ_nm_META,
			upri_META,
			interim_flg_META,
			proc_upri_META,
			onr_prov_upri_META,
			slf_supprt_upri_META,
			amt_META,
			proc_amt_META,
			onr_prov_amt_META,
			slf_supprt_amt_META,
			err_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$qty
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
				{$dpt_cd, "dpt_nm;loc_cd"},	// dpt_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;purc_unit_cd;sppl_cd;sppl_nm;maker_cd;maker_nm;cur_cd;cur_nm;mfg_loc_cd;mfg_loc_nm;bom_ptn"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;purc_unit_cd;sppl_cd;sppl_nm;maker_cd;maker_nm;cur_cd;cur_nm;mfg_loc_cd;mfg_loc_nm;bom_ptn"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;purc_unit_cd;sppl_cd;sppl_nm;maker_cd;maker_nm;cur_cd;cur_nm;mfg_loc_cd;mfg_loc_nm;bom_ptn"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;purc_unit_cd;sppl_cd;sppl_nm;maker_cd;maker_nm;cur_cd;cur_nm;mfg_loc_cd;mfg_loc_nm;bom_ptn"},	// itm_p.itm_sub3
				{$sppl_cd, "bp_nm;cur_cd"},	// sppl_cd
				{$mfg_loc_cd, "loc_nm;maker_cd"},	// mfg_loc_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$outsrc_upri_typ, "outsrc_upri_typ_nm"}	// outsrc_upri_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;dt;ddlv_sls_flg"},	// dpt_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// loc_cd
				{$itm_p + ".itm_cd", "true;dt;sppl_cd;wg_cd"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "true;dt;sppl_cd;wg_cd;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "true;dt;sppl_cd;wg_cd;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "true;dt;sppl_cd;wg_cd;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.OUTSIDE;wg_cd;sppl_cd"},	// mfg_loc_cd
				{$bom_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd"},	// bom_ptn
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER"},	// maker_cd
				{$unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dpt_cd, "dpt_is_srch_typ;dt;ddlv_sls_flg"},	// dpt_cd
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$itm_p + ".itm_cd", "outsrc_flg;dt;sppl_cd;wg_cd"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "outsrc_flg;dt;sppl_cd;wg_cd;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "outsrc_flg;dt;sppl_cd;wg_cd;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "outsrc_flg;dt;sppl_cd;wg_cd;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$mfg_loc_cd, "loc_is_srch_typ;wg_cd;sppl_cd"},	// mfg_loc_cd
				{$bom_ptn, "par_itm_cd;par_itm_sub1;par_itm_sub2;par_itm_sub3;wg_cd"},	// bom_ptn
				{$maker_cd, "bp_is_srch_typ"},	// maker_cd
				{$unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// unit_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$sno1, "SNO1"},	// sno1
				{$sno2, "SNO2"},	// sno2
				{$sno3, "SNO3"},	// sno3
				{$sno4, "SNO4"}	// sno4
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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Direct delivery sales 仕入直送売上.<p>
	 *
	 */
	public boolean ddlv_sls_flg() {
		return getConstBoolean(offset + 2, $ddlv_sls_flg);
	}

	/**
	 * Direct delivery sales 仕入直送売上.<p>
	 *
	 */
	public void ddlv_sls_flg(boolean value) {
		setConstBoolean(offset + 2, $ddlv_sls_flg, value);
	}


	/**
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 3, $dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 3, $dt, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 4, $dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 4, $dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 5, $dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 5, $dpt_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 6, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 6, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 7, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 7, $dlv_nm, value);
	}


	/**
	 * Delivery/relay location cd. 納入／中継場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 8, $loc_cd);
	}

	/**
	 * Delivery/relay location cd. 納入／中継場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 8, $loc_cd, value);
	}


	/**
	 * Delivery/relay location name 納入／中継場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 9, $loc_nm);
	}

	/**
	 * Delivery/relay location name 納入／中継場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 9, $loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 11, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 11, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 12, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 12, $itm_p, row);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 13, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 13, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 14, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 14, $sppl_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 15, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 15, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 16, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 16, $mfg_loc_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 17, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 17, $bom_ptn, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 18, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 18, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 19, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 19, $maker_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 20, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 20, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 21, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 21, $cur_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 22, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 22, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 23, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 23, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 24, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 24, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 24, $dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $qty_p, row);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 26, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 26, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 27, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 27, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 28, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 28, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 29, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 29, $sno4, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 30, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 30, $outsrc_upri_typ, value);
	}


	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public String outsrc_upri_typ_nm() {
		return getConstString(offset + 31, $outsrc_upri_typ_nm);
	}

	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public void outsrc_upri_typ_nm(String value) {
		setConstString(offset + 31, $outsrc_upri_typ_nm, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 32, $upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 32, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 32, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 32, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 32, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 32, $upri, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 33, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 33, $interim_flg, value);
	}


	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCNumber proc_upri() {
		return getConstNumber(offset + 34, $proc_upri);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(MCNumber value) {
		setConstNumber(offset + 34, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(int value) {
		setConstNumber(offset + 34, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(long value) {
		setConstNumber(offset + 34, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(float value) {
		setConstNumber(offset + 34, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(double value) {
		setConstNumber(offset + 34, $proc_upri, value);
	}


	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public MCNumber onr_prov_upri() {
		return getConstNumber(offset + 35, $onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 35, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(int value) {
		setConstNumber(offset + 35, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(long value) {
		setConstNumber(offset + 35, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(float value) {
		setConstNumber(offset + 35, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(double value) {
		setConstNumber(offset + 35, $onr_prov_upri, value);
	}


	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public MCNumber slf_supprt_upri() {
		return getConstNumber(offset + 36, $slf_supprt_upri);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(MCNumber value) {
		setConstNumber(offset + 36, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(int value) {
		setConstNumber(offset + 36, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(long value) {
		setConstNumber(offset + 36, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(float value) {
		setConstNumber(offset + 36, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(double value) {
		setConstNumber(offset + 36, $slf_supprt_upri, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 37, $amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 37, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 37, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 37, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 37, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 37, $amt, value);
	}


	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public MCNumber proc_amt() {
		return getConstNumber(offset + 38, $proc_amt);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(MCNumber value) {
		setConstNumber(offset + 38, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(int value) {
		setConstNumber(offset + 38, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(long value) {
		setConstNumber(offset + 38, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(float value) {
		setConstNumber(offset + 38, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(double value) {
		setConstNumber(offset + 38, $proc_amt, value);
	}


	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public MCNumber onr_prov_amt() {
		return getConstNumber(offset + 39, $onr_prov_amt);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 39, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(int value) {
		setConstNumber(offset + 39, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(long value) {
		setConstNumber(offset + 39, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(float value) {
		setConstNumber(offset + 39, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(double value) {
		setConstNumber(offset + 39, $onr_prov_amt, value);
	}


	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public MCNumber slf_supprt_amt() {
		return getConstNumber(offset + 40, $slf_supprt_amt);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(MCNumber value) {
		setConstNumber(offset + 40, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(int value) {
		setConstNumber(offset + 40, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(long value) {
		setConstNumber(offset + 40, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(float value) {
		setConstNumber(offset + 40, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(double value) {
		setConstNumber(offset + 40, $slf_supprt_amt, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 41, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 41, $err_flg, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			return proc_upri();
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			return onr_prov_upri();
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			return slf_supprt_upri();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			return proc_amt();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			return slf_supprt_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			return ddlv_sls_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			return outsrc_upri_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($upri.equalsIgnoreCase(name)) {
			return upri();
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			return proc_upri();
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			return onr_prov_upri();
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			return slf_supprt_upri();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			return proc_amt();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			return slf_supprt_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			return ddlv_sls_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			ddlv_sls_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($outsrc_upri_typ_nm.equalsIgnoreCase(name)) {
			outsrc_upri_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($upri.equalsIgnoreCase(name)) {
			upri(value);
			return;
		}
		if ($proc_upri.equalsIgnoreCase(name)) {
			proc_upri(value);
			return;
		}
		if ($onr_prov_upri.equalsIgnoreCase(name)) {
			onr_prov_upri(value);
			return;
		}
		if ($slf_supprt_upri.equalsIgnoreCase(name)) {
			slf_supprt_upri(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($proc_amt.equalsIgnoreCase(name)) {
			proc_amt(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($slf_supprt_amt.equalsIgnoreCase(name)) {
			slf_supprt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			ddlv_sls_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
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
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	public MCNumber qty() {
		return qty_p().qty();
	}

	public void qty(MCNumber value) {
		qty_p().qty(value);
	}

	public void qty(int value) {
		qty_p().qty(value);
	}

	public void qty(long value) {
		qty_p().qty(value);
	}

	public void qty(float value) {
		qty_p().qty(value);
	}

	public void qty(double value) {
		qty_p().qty(value);
	}

}

