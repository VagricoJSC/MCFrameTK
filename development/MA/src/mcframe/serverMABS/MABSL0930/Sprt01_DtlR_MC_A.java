package mcframe.serverMABS.MABSL0930;

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
 * ブロック"Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Sprt01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Application date 適用日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
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


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
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

	protected static final ConstMetaList<Sprt01_DtlR> constMetas = new ConstMetaList<Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			dt_META,
			wg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sppl_cd_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			maker_cd_META,
			dlv_cd_META,
			loc_cd_META,
			cur_cd_META,
			unit_cd_META,
			qty_META,
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
				{$outsrc_upri_typ, "MAC_OUTSRC_UPRI_TYP"}	// outsrc_upri_typ
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
	protected Sprt01_DtlR_MC_A(ConstMetaList<? extends Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR clone() {
		return (Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR createInstance() {
		return (Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Sprt01_DtlR getValues(String... names) {
		return (Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Application date 適用日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 1, $dt);
	}

	/**
	 * Application date 適用日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 1, $dt, value);
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
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 7, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 7, $sppl_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 8, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 8, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 9, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 9, $bom_ptn, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 10, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 10, $maker_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 11, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 11, $dlv_cd, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 12, $loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 12, $loc_cd, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 13, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 13, $cur_cd, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 14, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 14, $unit_cd, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 15, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 15, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 15, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 15, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 15, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 15, $qty, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 16, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 16, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 17, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 17, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 18, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 18, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 19, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 19, $sno4, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 20, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 20, $outsrc_upri_typ, value);
	}


	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public String outsrc_upri_typ_nm() {
		return getConstString(offset + 21, $outsrc_upri_typ_nm);
	}

	/**
	 * Subcontracting unit price type name 外注単価区分名.<p>
	 *
	 */
	public void outsrc_upri_typ_nm(String value) {
		setConstString(offset + 21, $outsrc_upri_typ_nm, value);
	}


	/**
	 * Unit price 単価.<p>
	 *
	 */
	public MCNumber upri() {
		return getConstNumber(offset + 22, $upri);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		setConstNumber(offset + 22, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(int value) {
		setConstNumber(offset + 22, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(long value) {
		setConstNumber(offset + 22, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(float value) {
		setConstNumber(offset + 22, $upri, value);
	}

	/**
	 * Unit price 単価.<p>
	 *
	 */
	public void upri(double value) {
		setConstNumber(offset + 22, $upri, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 23, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 23, $interim_flg, value);
	}


	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public MCNumber proc_upri() {
		return getConstNumber(offset + 24, $proc_upri);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(MCNumber value) {
		setConstNumber(offset + 24, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(int value) {
		setConstNumber(offset + 24, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(long value) {
		setConstNumber(offset + 24, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(float value) {
		setConstNumber(offset + 24, $proc_upri, value);
	}

	/**
	 * Subcontracting unit price 加工単価.<p>
	 *
	 */
	public void proc_upri(double value) {
		setConstNumber(offset + 24, $proc_upri, value);
	}


	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public MCNumber onr_prov_upri() {
		return getConstNumber(offset + 25, $onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 25, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(int value) {
		setConstNumber(offset + 25, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(long value) {
		setConstNumber(offset + 25, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(float value) {
		setConstNumber(offset + 25, $onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price 有償支給単価.<p>
	 *
	 */
	public void onr_prov_upri(double value) {
		setConstNumber(offset + 25, $onr_prov_upri, value);
	}


	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public MCNumber slf_supprt_upri() {
		return getConstNumber(offset + 26, $slf_supprt_upri);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(MCNumber value) {
		setConstNumber(offset + 26, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(int value) {
		setConstNumber(offset + 26, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(long value) {
		setConstNumber(offset + 26, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(float value) {
		setConstNumber(offset + 26, $slf_supprt_upri, value);
	}

	/**
	 * Self supply unit price 自給単価.<p>
	 *
	 */
	public void slf_supprt_upri(double value) {
		setConstNumber(offset + 26, $slf_supprt_upri, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 27, $amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 27, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 27, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 27, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 27, $amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 27, $amt, value);
	}


	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public MCNumber proc_amt() {
		return getConstNumber(offset + 28, $proc_amt);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(MCNumber value) {
		setConstNumber(offset + 28, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(int value) {
		setConstNumber(offset + 28, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(long value) {
		setConstNumber(offset + 28, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(float value) {
		setConstNumber(offset + 28, $proc_amt, value);
	}

	/**
	 * Subcontracting amount 加工金額.<p>
	 *
	 */
	public void proc_amt(double value) {
		setConstNumber(offset + 28, $proc_amt, value);
	}


	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public MCNumber onr_prov_amt() {
		return getConstNumber(offset + 29, $onr_prov_amt);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 29, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(int value) {
		setConstNumber(offset + 29, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(long value) {
		setConstNumber(offset + 29, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(float value) {
		setConstNumber(offset + 29, $onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount 有償支給金額.<p>
	 *
	 */
	public void onr_prov_amt(double value) {
		setConstNumber(offset + 29, $onr_prov_amt, value);
	}


	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public MCNumber slf_supprt_amt() {
		return getConstNumber(offset + 30, $slf_supprt_amt);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(MCNumber value) {
		setConstNumber(offset + 30, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(int value) {
		setConstNumber(offset + 30, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(long value) {
		setConstNumber(offset + 30, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(float value) {
		setConstNumber(offset + 30, $slf_supprt_amt, value);
	}

	/**
	 * Self supply amount 自給金額.<p>
	 *
	 */
	public void slf_supprt_amt(double value) {
		setConstNumber(offset + 30, $slf_supprt_amt, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 31, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 31, $err_flg, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
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
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
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



}

