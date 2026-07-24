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
 * ブロック"Lot_Chk03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Lot_Chk03_CndR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	public static final String $lot_p = "lot_p";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $itm_cd = $lot_p + ".itm_cd";
	public static final String $itm_sub1 = $lot_p + ".itm_sub1";
	public static final String $itm_sub2 = $lot_p + ".itm_sub2";
	public static final String $itm_sub3 = $lot_p + ".itm_sub3";
	public static final String $lot_no = $lot_p + ".lot_no";
	public static final String $sublot_no = $lot_p + ".sublot_no";
	public static final String $ver_no = $lot_p + ".ver_no";
	public static final String $first_gr_dt = $lot_p + ".first_gr_dt";
	public static final String $vld_dt = $lot_p + ".vld_dt";
	public static final String $lot_seq = $lot_p + ".lot_seq";
	public static final String $stk_insp_typ = $lot_p + ".stk_insp_typ";
	public static final String $quality_typ = $lot_p + ".quality_typ";
	public static final String $mfg_aprv_sts_typ = $lot_p + ".mfg_aprv_sts_typ";
	public static final String $insp_aprv_sts_typ = $lot_p + ".insp_aprv_sts_typ";
	public static final String $plnt_aprv_sts_typ = $lot_p + ".plnt_aprv_sts_typ";
	public static final String $mrkt_judg_sts_typ = $lot_p + ".mrkt_judg_sts_typ";
	public static final String $act_cont_fctr = $lot_p + ".act_cont_fctr";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta lot_p_META = createInnerRowMeta($lot_p, mcframe.serverMS.dbc.MST_LOT_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Lot_Chk03_CndR> constMetas = new ConstMetaList<Lot_Chk03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			lot_p_META,
			err_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"lot_no",
				"sublot_no",
				"ver_no",
				"first_gr_dt",
				"vld_dt",
				"lot_seq",
				"stk_insp_typ",
				"quality_typ",
				"mfg_aprv_sts_typ",
				"insp_aprv_sts_typ",
				"plnt_aprv_sts_typ",
				"mrkt_judg_sts_typ",
				"act_cont_fctr"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$lot_no,
				$sublot_no,
				$ver_no,
				$first_gr_dt,
				$vld_dt,
				$lot_seq,
				$stk_insp_typ,
				$quality_typ,
				$mfg_aprv_sts_typ,
				$insp_aprv_sts_typ,
				$plnt_aprv_sts_typ,
				$mrkt_judg_sts_typ,
				$act_cont_fctr
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
	protected Lot_Chk03_CndR_MC_A(ConstMetaList<? extends Lot_Chk03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Chk03_CndR clone() {
		return (Lot_Chk03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Chk03_CndR createInstance() {
		return (Lot_Chk03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Lot_Chk03_CndR getValues(String... names) {
		return (Lot_Chk03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付ＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_LOT_R lot_p(){
		return (mcframe.serverMS.dbc.MST_LOT_R) getConstInnerRow(offset + 1, $lot_p);
	}
	
	public void lot_p(mcframe.serverMS.dbc.MST_LOT_R row){
		setConstInnerRow(offset + 1, $lot_p, row);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return lot_p().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		lot_p().ver_no(value);
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return lot_p().first_gr_dt();
	}

	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		lot_p().first_gr_dt(value);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return lot_p().vld_dt();
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		lot_p().vld_dt(value);
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public String lot_seq() {
		return lot_p().lot_seq();
	}

	/**
	 * Lot sequence ロットシーケンス.<p>
	 *
	 */
	public void lot_seq(String value) {
		lot_p().lot_seq(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return lot_p().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		lot_p().stk_insp_typ(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return lot_p().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		lot_p().quality_typ(value);
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return lot_p().mfg_aprv_sts_typ();
	}

	/**
	 * Mfg. approval status type 製造承認状況区分.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		lot_p().mfg_aprv_sts_typ(value);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return lot_p().insp_aprv_sts_typ();
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		lot_p().insp_aprv_sts_typ(value);
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return lot_p().plnt_aprv_sts_typ();
	}

	/**
	 * Factory release approval status type 工場出荷承認状況区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		lot_p().plnt_aprv_sts_typ(value);
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return lot_p().mrkt_judg_sts_typ();
	}

	/**
	 * Market release decision status type 市場出荷判定状況区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		lot_p().mrkt_judg_sts_typ(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return lot_p().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		lot_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		lot_p().act_cont_fctr(value);
	}

}

