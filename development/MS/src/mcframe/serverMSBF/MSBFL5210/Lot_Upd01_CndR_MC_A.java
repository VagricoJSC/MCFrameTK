package mcframe.serverMSBF.MSBFL5210;

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
 * ブロック"Lot_Upd01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Lot_Upd01_CndR_MC_A extends MCConstRow {

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	public static final String $lot_p = "lot_p";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Sublot No.?(Caller) サブロットＮＯ(呼出元).<p>
	 *
	 */
	public static final String $sublot_no_org = "sublot_no_org";

	public static final String $itm_cd = $lot_p + ".itm_cd";
	public static final String $itm_sub1 = $lot_p + ".itm_sub1";
	public static final String $itm_sub2 = $lot_p + ".itm_sub2";
	public static final String $itm_sub3 = $lot_p + ".itm_sub3";
	public static final String $lot_no = $lot_p + ".lot_no";
	public static final String $sublot_no = $lot_p + ".sublot_no";
	public static final String $schd_flg = $lot_p + ".schd_flg";
	public static final String $lot_sub_char1 = $lot_p + ".lot_sub_char1";
	public static final String $lot_sub_char2 = $lot_p + ".lot_sub_char2";
	public static final String $lot_sub_char3 = $lot_p + ".lot_sub_char3";
	public static final String $lot_sub_char4 = $lot_p + ".lot_sub_char4";
	public static final String $lot_sub_char5 = $lot_p + ".lot_sub_char5";
	public static final String $lot_sub_num1 = $lot_p + ".lot_sub_num1";
	public static final String $lot_sub_num2 = $lot_p + ".lot_sub_num2";
	public static final String $lot_sub_num3 = $lot_p + ".lot_sub_num3";
	public static final String $lot_sub_num4 = $lot_p + ".lot_sub_num4";
	public static final String $lot_sub_num5 = $lot_p + ".lot_sub_num5";
	public static final String $lot_sub_dt1 = $lot_p + ".lot_sub_dt1";
	public static final String $lot_sub_dt2 = $lot_p + ".lot_sub_dt2";
	public static final String $lot_sub_dt3 = $lot_p + ".lot_sub_dt3";
	public static final String $lot_sub_dt4 = $lot_p + ".lot_sub_dt4";
	public static final String $lot_sub_dt5 = $lot_p + ".lot_sub_dt5";
	public static final String $lot_sub_flg1 = $lot_p + ".lot_sub_flg1";
	public static final String $lot_sub_flg2 = $lot_p + ".lot_sub_flg2";
	public static final String $lot_sub_flg3 = $lot_p + ".lot_sub_flg3";
	public static final String $lot_sub_flg4 = $lot_p + ".lot_sub_flg4";
	public static final String $lot_sub_flg5 = $lot_p + ".lot_sub_flg5";

	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta lot_p_META = createInnerRowMeta($lot_p, mcframe.serverMS.dbc.MST_LOT_R.class);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta sublot_no_org_META = createCommonMeta($sublot_no_org, mcframe.commonMA.meta.MA_META.SUBLOT_NO);

	protected static final ConstMetaList<Lot_Upd01_CndR> constMetas = new ConstMetaList<Lot_Upd01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			base_dt_META,
			loc_cd_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			arr_act_no_META,
			arr_pr_no_META,
			lot_p_META,
			peg_no_META,
			insp_typ_META,
			sublot_no_org_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"schd_flg",
				"lot_sub_char1",
				"lot_sub_char2",
				"lot_sub_char3",
				"lot_sub_char4",
				"lot_sub_char5",
				"lot_sub_num1",
				"lot_sub_num2",
				"lot_sub_num3",
				"lot_sub_num4",
				"lot_sub_num5",
				"lot_sub_dt1",
				"lot_sub_dt2",
				"lot_sub_dt3",
				"lot_sub_dt4",
				"lot_sub_dt5",
				"lot_sub_flg1",
				"lot_sub_flg2",
				"lot_sub_flg3",
				"lot_sub_flg4",
				"lot_sub_flg5"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$schd_flg,
				$lot_sub_char1,
				$lot_sub_char2,
				$lot_sub_char3,
				$lot_sub_char4,
				$lot_sub_char5,
				$lot_sub_num1,
				$lot_sub_num2,
				$lot_sub_num3,
				$lot_sub_num4,
				$lot_sub_num5,
				$lot_sub_dt1,
				$lot_sub_dt2,
				$lot_sub_dt3,
				$lot_sub_dt4,
				$lot_sub_dt5,
				$lot_sub_flg1,
				$lot_sub_flg2,
				$lot_sub_flg3,
				$lot_sub_flg4,
				$lot_sub_flg5
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
	protected Lot_Upd01_CndR_MC_A(ConstMetaList<? extends Lot_Upd01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd01_CndR clone() {
		return (Lot_Upd01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd01_CndR createInstance() {
		return (Lot_Upd01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Upd01_CndR getValues(String... names) {
		return (Lot_Upd01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 0, $base_dt);
	}

	/**
	 * GR date 入庫日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 0, $base_dt, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 1, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 1, $loc_cd, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 2, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 2, $mfg_loc_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 3, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 3, $sppl_cd, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 4, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 4, $maker_cd, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 5, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 5, $arr_act_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 6, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 6, $arr_pr_no, value);
	}


	public mcframe.serverMS.dbc.MST_LOT_R lot_p(){
		return (mcframe.serverMS.dbc.MST_LOT_R) getConstInnerRow(offset + 7, $lot_p);
	}
	
	public void lot_p(mcframe.serverMS.dbc.MST_LOT_R row){
		setConstInnerRow(offset + 7, $lot_p, row);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 8, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 8, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 8, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 8, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 8, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 8, $peg_no, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 9, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 9, $insp_typ, value);
	}


	/**
	 * Sublot No.?(Caller) サブロットＮＯ(呼出元).<p>
	 *
	 */
	public String sublot_no_org() {
		return getConstString(offset + 10, $sublot_no_org);
	}

	/**
	 * Sublot No.?(Caller) サブロットＮＯ(呼出元).<p>
	 *
	 */
	public void sublot_no_org(String value) {
		setConstString(offset + 10, $sublot_no_org, value);
	}


	public String getString(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($sublot_no_org.equalsIgnoreCase(name)) {
			return sublot_no_org();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($sublot_no_org.equalsIgnoreCase(name)) {
			return sublot_no_org();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($sublot_no_org.equalsIgnoreCase(name)) {
			sublot_no_org(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($sublot_no_org.equalsIgnoreCase(name)) {
			sublot_no_org(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($lot_p.equalsIgnoreCase(name)) {
			return lot_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($lot_p.equalsIgnoreCase(name)) {
			lot_p(
				((MCContainerMeta) lot_p_META).castInnerRow(mcframe.serverMS.dbc.MST_LOT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return lot_p().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		lot_p().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return lot_p().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		lot_p().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return lot_p().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		lot_p().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return lot_p().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		lot_p().itm_sub3(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return lot_p().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		lot_p().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return lot_p().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		lot_p().sublot_no(value);
	}

	/**
	 * Schedule flg. 予定ＦＬＧ.<p>
	 *
	 */
	public boolean schd_flg() {
		return lot_p().schd_flg();
	}

	/**
	 * Schedule flg. 予定ＦＬＧ.<p>
	 *
	 */
	public void schd_flg(boolean value) {
		lot_p().schd_flg(value);
	}

	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public String lot_sub_char1() {
		return lot_p().lot_sub_char1();
	}

	/**
	 * Lot spare (String) 1 ロット予備（文字列）１.<p>
	 *
	 */
	public void lot_sub_char1(String value) {
		lot_p().lot_sub_char1(value);
	}

	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public String lot_sub_char2() {
		return lot_p().lot_sub_char2();
	}

	/**
	 * Lot spare (String) 2 ロット予備（文字列）２.<p>
	 *
	 */
	public void lot_sub_char2(String value) {
		lot_p().lot_sub_char2(value);
	}

	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public String lot_sub_char3() {
		return lot_p().lot_sub_char3();
	}

	/**
	 * Lot spare (String) 3 ロット予備（文字列）３.<p>
	 *
	 */
	public void lot_sub_char3(String value) {
		lot_p().lot_sub_char3(value);
	}

	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public String lot_sub_char4() {
		return lot_p().lot_sub_char4();
	}

	/**
	 * Lot spare (String) 4 ロット予備（文字列）４.<p>
	 *
	 */
	public void lot_sub_char4(String value) {
		lot_p().lot_sub_char4(value);
	}

	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public String lot_sub_char5() {
		return lot_p().lot_sub_char5();
	}

	/**
	 * Lot spare (String) 5 ロット予備（文字列）５.<p>
	 *
	 */
	public void lot_sub_char5(String value) {
		lot_p().lot_sub_char5(value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public MCNumber lot_sub_num1() {
		return lot_p().lot_sub_num1();
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(MCNumber value) {
		lot_p().lot_sub_num1(value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(int value) {
		lot_p().lot_sub_num1(value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(long value) {
		lot_p().lot_sub_num1(value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(float value) {
		lot_p().lot_sub_num1(value);
	}

	/**
	 * Lot spare (Numerical value) 1 ロット予備（数値）１.<p>
	 *
	 */
	public void lot_sub_num1(double value) {
		lot_p().lot_sub_num1(value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public MCNumber lot_sub_num2() {
		return lot_p().lot_sub_num2();
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(MCNumber value) {
		lot_p().lot_sub_num2(value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(int value) {
		lot_p().lot_sub_num2(value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(long value) {
		lot_p().lot_sub_num2(value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(float value) {
		lot_p().lot_sub_num2(value);
	}

	/**
	 * Lot spare (Numerical value) 2 ロット予備（数値）２.<p>
	 *
	 */
	public void lot_sub_num2(double value) {
		lot_p().lot_sub_num2(value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public MCNumber lot_sub_num3() {
		return lot_p().lot_sub_num3();
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(MCNumber value) {
		lot_p().lot_sub_num3(value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(int value) {
		lot_p().lot_sub_num3(value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(long value) {
		lot_p().lot_sub_num3(value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(float value) {
		lot_p().lot_sub_num3(value);
	}

	/**
	 * Lot spare (Numerical value) 3 ロット予備（数値）３.<p>
	 *
	 */
	public void lot_sub_num3(double value) {
		lot_p().lot_sub_num3(value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public MCNumber lot_sub_num4() {
		return lot_p().lot_sub_num4();
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(MCNumber value) {
		lot_p().lot_sub_num4(value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(int value) {
		lot_p().lot_sub_num4(value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(long value) {
		lot_p().lot_sub_num4(value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(float value) {
		lot_p().lot_sub_num4(value);
	}

	/**
	 * Lot spare (Numerical value) 4 ロット予備（数値）４.<p>
	 *
	 */
	public void lot_sub_num4(double value) {
		lot_p().lot_sub_num4(value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public MCNumber lot_sub_num5() {
		return lot_p().lot_sub_num5();
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(MCNumber value) {
		lot_p().lot_sub_num5(value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(int value) {
		lot_p().lot_sub_num5(value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(long value) {
		lot_p().lot_sub_num5(value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(float value) {
		lot_p().lot_sub_num5(value);
	}

	/**
	 * Lot spare (Numerical value) 5 ロット予備（数値）５.<p>
	 *
	 */
	public void lot_sub_num5(double value) {
		lot_p().lot_sub_num5(value);
	}

	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public MCDate lot_sub_dt1() {
		return lot_p().lot_sub_dt1();
	}

	/**
	 * Lot spare (Date) 1 ロット予備（日付）１.<p>
	 *
	 */
	public void lot_sub_dt1(MCDate value) {
		lot_p().lot_sub_dt1(value);
	}

	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public MCDate lot_sub_dt2() {
		return lot_p().lot_sub_dt2();
	}

	/**
	 * Lot spare (Date) 2 ロット予備（日付）２.<p>
	 *
	 */
	public void lot_sub_dt2(MCDate value) {
		lot_p().lot_sub_dt2(value);
	}

	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public MCDate lot_sub_dt3() {
		return lot_p().lot_sub_dt3();
	}

	/**
	 * Lot spare (Date) 3 ロット予備（日付）３.<p>
	 *
	 */
	public void lot_sub_dt3(MCDate value) {
		lot_p().lot_sub_dt3(value);
	}

	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public MCDate lot_sub_dt4() {
		return lot_p().lot_sub_dt4();
	}

	/**
	 * Lot spare (Date) 4 ロット予備（日付）４.<p>
	 *
	 */
	public void lot_sub_dt4(MCDate value) {
		lot_p().lot_sub_dt4(value);
	}

	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public MCDate lot_sub_dt5() {
		return lot_p().lot_sub_dt5();
	}

	/**
	 * Lot spare (Date) 5 ロット予備（日付）５.<p>
	 *
	 */
	public void lot_sub_dt5(MCDate value) {
		lot_p().lot_sub_dt5(value);
	}

	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public boolean lot_sub_flg1() {
		return lot_p().lot_sub_flg1();
	}

	/**
	 * Lot spare (flg.) 1 ロット予備（ＦＬＧ）１.<p>
	 *
	 */
	public void lot_sub_flg1(boolean value) {
		lot_p().lot_sub_flg1(value);
	}

	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public boolean lot_sub_flg2() {
		return lot_p().lot_sub_flg2();
	}

	/**
	 * Lot spare (flg.) 2 ロット予備（ＦＬＧ）２.<p>
	 *
	 */
	public void lot_sub_flg2(boolean value) {
		lot_p().lot_sub_flg2(value);
	}

	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public boolean lot_sub_flg3() {
		return lot_p().lot_sub_flg3();
	}

	/**
	 * Lot spare (flg.) 3 ロット予備（ＦＬＧ）３.<p>
	 *
	 */
	public void lot_sub_flg3(boolean value) {
		lot_p().lot_sub_flg3(value);
	}

	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public boolean lot_sub_flg4() {
		return lot_p().lot_sub_flg4();
	}

	/**
	 * Lot spare (flg.) 4 ロット予備（ＦＬＧ）４.<p>
	 *
	 */
	public void lot_sub_flg4(boolean value) {
		lot_p().lot_sub_flg4(value);
	}

	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public boolean lot_sub_flg5() {
		return lot_p().lot_sub_flg5();
	}

	/**
	 * Lot spare (flg.) 5 ロット予備（ＦＬＧ）５.<p>
	 *
	 */
	public void lot_sub_flg5(boolean value) {
		lot_p().lot_sub_flg5(value);
	}

}

