package mcframe.serverMGBD.MGBDL0210;

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
 * ブロック"Chk01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Chk01_RsltR_MC_A extends MCConstRow {

	public static final String $dbc = "dbc";
	/**
	 * Carry-over allocation account cd. 繰越配賦科目ＣＤ.<p>
	 *
	 */
	public static final String $co_alc_ac_cd = "co_alc_ac_cd";

	public static final String $wg_cd = $dbc + ".wg_cd";
	public static final String $ym = $dbc + ".ym";
	public static final String $inpt_alc_typ = $dbc + ".inpt_alc_typ";
	public static final String $alc_ac_cd = $dbc + ".alc_ac_cd";
	public static final String $dpt_cd = $dbc + ".dpt_cd";
	public static final String $loc_cd = $dbc + ".loc_cd";
	public static final String $oper_cd = $dbc + ".oper_cd";
	public static final String $bp_cd = $dbc + ".bp_cd";
	public static final String $ctg_cd = $dbc + ".ctg_cd";
	public static final String $itm_cd = $dbc + ".itm_cd";
	public static final String $itm_sub1 = $dbc + ".itm_sub1";
	public static final String $itm_sub2 = $dbc + ".itm_sub2";
	public static final String $itm_sub3 = $dbc + ".itm_sub3";
	public static final String $lot_no = $dbc + ".lot_no";
	public static final String $sublot_no = $dbc + ".sublot_no";
	public static final String $sno1 = $dbc + ".sno1";
	public static final String $sno2 = $dbc + ".sno2";
	public static final String $sno3 = $dbc + ".sno3";
	public static final String $sno4 = $dbc + ".sno4";
	public static final String $itm_mfg_inst_no = $dbc + ".itm_mfg_inst_no";
	public static final String $iv_no = $dbc + ".iv_no";
	public static final String $po_no = $dbc + ".po_no";
	public static final String $slo_no = $dbc + ".slo_no";
	public static final String $amt = $dbc + ".amt";
	public static final String $expns_cd = $dbc + ".expns_cd";
	public static final String $alc_ptn_cd = $dbc + ".alc_ptn_cd";

	public static final MCMeta dbc_META = createInnerRowMeta($dbc, mcframe.serverMG.dbc.MGT_ALC_CALC_ERR_R.class);
	public static final MCMeta co_alc_ac_cd_META = createCommonMeta($co_alc_ac_cd, mcframe.commonMA.meta.MA_META.ALC_AC_CD);

	protected static final ConstMetaList<Chk01_RsltR> constMetas = new ConstMetaList<Chk01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dbc_META,
			co_alc_ac_cd_META
		},
		new String[][]{
			{
				"wg_cd",
				"ym",
				"inpt_alc_typ",
				"alc_ac_cd",
				"dpt_cd",
				"loc_cd",
				"oper_cd",
				"bp_cd",
				"ctg_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"itm_mfg_inst_no",
				"iv_no",
				"po_no",
				"slo_no",
				"amt",
				"expns_cd",
				"alc_ptn_cd"
			},
			{
				$wg_cd,
				$ym,
				$inpt_alc_typ,
				$alc_ac_cd,
				$dpt_cd,
				$loc_cd,
				$oper_cd,
				$bp_cd,
				$ctg_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$itm_mfg_inst_no,
				$iv_no,
				$po_no,
				$slo_no,
				$amt,
				$expns_cd,
				$alc_ptn_cd
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dbc + ".wg_cd", "E"},	// dbc.wg_cd
				{$dbc + ".ym", "E"},	// dbc.ym
				{$dbc + ".inpt_alc_typ", "E"},	// dbc.inpt_alc_typ
				{$dbc + ".alc_ac_cd", "E"}	// dbc.alc_ac_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected Chk01_RsltR_MC_A(ConstMetaList<? extends Chk01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR clone() {
		return (Chk01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR createInstance() {
		return (Chk01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Chk01_RsltR getValues(String... names) {
		return (Chk01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMG.dbc.MGT_ALC_CALC_ERR_R dbc(){
		return (mcframe.serverMG.dbc.MGT_ALC_CALC_ERR_R) getConstInnerRow(offset + 0, $dbc);
	}
	
	public void dbc(mcframe.serverMG.dbc.MGT_ALC_CALC_ERR_R row){
		setConstInnerRow(offset + 0, $dbc, row);
	}


	/**
	 * Carry-over allocation account cd. 繰越配賦科目ＣＤ.<p>
	 *
	 */
	public String co_alc_ac_cd() {
		return getConstString(offset + 1, $co_alc_ac_cd);
	}

	/**
	 * Carry-over allocation account cd. 繰越配賦科目ＣＤ.<p>
	 *
	 */
	public void co_alc_ac_cd(String value) {
		setConstString(offset + 1, $co_alc_ac_cd, value);
	}


	public String getString(String name) {
		if ($co_alc_ac_cd.equalsIgnoreCase(name)) {
			return co_alc_ac_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($co_alc_ac_cd.equalsIgnoreCase(name)) {
			return co_alc_ac_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($co_alc_ac_cd.equalsIgnoreCase(name)) {
			co_alc_ac_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_alc_ac_cd.equalsIgnoreCase(name)) {
			co_alc_ac_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dbc.equalsIgnoreCase(name)) {
			return dbc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dbc.equalsIgnoreCase(name)) {
			dbc(
				((MCContainerMeta) dbc_META).castInnerRow(mcframe.serverMG.dbc.MGT_ALC_CALC_ERR_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return dbc().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		dbc().wg_cd(value);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return dbc().ym();
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		dbc().ym(value);
	}

	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public String inpt_alc_typ() {
		return dbc().inpt_alc_typ();
	}

	/**
	 * Input expense type 入力費用区分.<p>
	 *
	 */
	public void inpt_alc_typ(String value) {
		dbc().inpt_alc_typ(value);
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public String alc_ac_cd() {
		return dbc().alc_ac_cd();
	}

	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public void alc_ac_cd(String value) {
		dbc().alc_ac_cd(value);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd() {
		return dbc().dpt_cd();
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd(String value) {
		dbc().dpt_cd(value);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return dbc().loc_cd();
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		dbc().loc_cd(value);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return dbc().oper_cd();
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		dbc().oper_cd(value);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return dbc().bp_cd();
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		dbc().bp_cd(value);
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public String ctg_cd() {
		return dbc().ctg_cd();
	}

	/**
	 * Item category cd. 品群ＣＤ.<p>
	 *
	 */
	public void ctg_cd(String value) {
		dbc().ctg_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dbc().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dbc().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dbc().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dbc().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dbc().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dbc().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dbc().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dbc().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return dbc().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		dbc().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return dbc().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		dbc().sublot_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return dbc().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		dbc().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return dbc().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		dbc().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return dbc().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		dbc().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return dbc().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		dbc().sno4(value);
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return dbc().itm_mfg_inst_no();
	}

	/**
	 * Item mfg. order No. 品目製造指図ＮＯ.<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		dbc().itm_mfg_inst_no(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return dbc().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		dbc().iv_no(value);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return dbc().po_no();
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		dbc().po_no(value);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return dbc().slo_no();
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		dbc().slo_no(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber amt() {
		return dbc().amt();
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(int value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(long value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(float value) {
		dbc().amt(value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void amt(double value) {
		dbc().amt(value);
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public String expns_cd() {
		return dbc().expns_cd();
	}

	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public void expns_cd(String value) {
		dbc().expns_cd(value);
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public String alc_ptn_cd() {
		return dbc().alc_ptn_cd();
	}

	/**
	 * Allocation pattern cd. 配賦パタンＣＤ.<p>
	 *
	 */
	public void alc_ptn_cd(String value) {
		dbc().alc_ptn_cd(value);
	}

}

