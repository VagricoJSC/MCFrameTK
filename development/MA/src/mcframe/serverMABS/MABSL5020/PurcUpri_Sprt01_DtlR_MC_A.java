package mcframe.serverMABS.MABSL5020;

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
 * ブロック"PurcUpri_Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcUpri_Sprt01_DtlR_MC_A extends MCConstRow {

	public static final String $purc_upri_srv = "purc_upri_srv";

	public static final String $peg_no = $purc_upri_srv + ".peg_no";
	public static final String $grp_no = $purc_upri_srv + ".grp_no";
	public static final String $wg_cd = $purc_upri_srv + ".wg_cd";
	public static final String $itm_cd = $purc_upri_srv + ".itm_cd";
	public static final String $itm_sub1 = $purc_upri_srv + ".itm_sub1";
	public static final String $itm_sub2 = $purc_upri_srv + ".itm_sub2";
	public static final String $itm_sub3 = $purc_upri_srv + ".itm_sub3";
	public static final String $sppl_cd = $purc_upri_srv + ".sppl_cd";
	public static final String $maker_cd = $purc_upri_srv + ".maker_cd";
	public static final String $unit_cd = $purc_upri_srv + ".unit_cd";
	public static final String $qty = $purc_upri_srv + ".qty";
	public static final String $cur_cd = $purc_upri_srv + ".cur_cd";
	public static final String $loc_cd = $purc_upri_srv + ".loc_cd";
	public static final String $dlv_cd = $purc_upri_srv + ".dlv_cd";
	public static final String $dt = $purc_upri_srv + ".dt";
	public static final String $upri = $purc_upri_srv + ".upri";
	public static final String $interim_flg = $purc_upri_srv + ".interim_flg";

	public static final MCMeta purc_upri_srv_META = createInnerRowMeta($purc_upri_srv, mcframe.serverMA.dbc.MAW_PURC_UPRI_SRV_R.class);

	protected static final ConstMetaList<PurcUpri_Sprt01_DtlR> constMetas = new ConstMetaList<PurcUpri_Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			purc_upri_srv_META
		},
		new String[][]{
			{
				"peg_no",
				"grp_no",
				"wg_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"sppl_cd",
				"maker_cd",
				"unit_cd",
				"qty",
				"cur_cd",
				"loc_cd",
				"dlv_cd",
				"dt",
				"upri",
				"interim_flg"
			},
			{
				$peg_no,
				$grp_no,
				$wg_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$sppl_cd,
				$maker_cd,
				$unit_cd,
				$qty,
				$cur_cd,
				$loc_cd,
				$dlv_cd,
				$dt,
				$upri,
				$interim_flg
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
	protected PurcUpri_Sprt01_DtlR_MC_A(ConstMetaList<? extends PurcUpri_Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcUpri_Sprt01_DtlR clone() {
		return (PurcUpri_Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcUpri_Sprt01_DtlR createInstance() {
		return (PurcUpri_Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcUpri_Sprt01_DtlR getValues(String... names) {
		return (PurcUpri_Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMA.dbc.MAW_PURC_UPRI_SRV_R purc_upri_srv(){
		return (mcframe.serverMA.dbc.MAW_PURC_UPRI_SRV_R) getConstInnerRow(offset + 0, $purc_upri_srv);
	}
	
	public void purc_upri_srv(mcframe.serverMA.dbc.MAW_PURC_UPRI_SRV_R row){
		setConstInnerRow(offset + 0, $purc_upri_srv, row);
	}






	public MCRow getInnerRow(String name) {
		if ($purc_upri_srv.equalsIgnoreCase(name)) {
			return purc_upri_srv();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($purc_upri_srv.equalsIgnoreCase(name)) {
			purc_upri_srv(
				((MCContainerMeta) purc_upri_srv_META).castInnerRow(mcframe.serverMA.dbc.MAW_PURC_UPRI_SRV_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return purc_upri_srv().peg_no();
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		purc_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		purc_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		purc_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		purc_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		purc_upri_srv().peg_no(value);
	}

	/**
	 * Group No. グループＮＯ.<p>
	 *
	 */
	public String grp_no() {
		return purc_upri_srv().grp_no();
	}

	/**
	 * Group No. グループＮＯ.<p>
	 *
	 */
	public void grp_no(String value) {
		purc_upri_srv().grp_no(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return purc_upri_srv().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		purc_upri_srv().wg_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return purc_upri_srv().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		purc_upri_srv().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return purc_upri_srv().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		purc_upri_srv().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return purc_upri_srv().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		purc_upri_srv().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return purc_upri_srv().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		purc_upri_srv().itm_sub3(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return purc_upri_srv().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		purc_upri_srv().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return purc_upri_srv().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		purc_upri_srv().maker_cd(value);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return purc_upri_srv().unit_cd();
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		purc_upri_srv().unit_cd(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return purc_upri_srv().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		purc_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		purc_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		purc_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		purc_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		purc_upri_srv().qty(value);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return purc_upri_srv().cur_cd();
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		purc_upri_srv().cur_cd(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return purc_upri_srv().loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		purc_upri_srv().loc_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return purc_upri_srv().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		purc_upri_srv().dlv_cd(value);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate dt() {
		return purc_upri_srv().dt();
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void dt(MCDate value) {
		purc_upri_srv().dt(value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public MCNumber upri() {
		return purc_upri_srv().upri();
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void upri(MCNumber value) {
		purc_upri_srv().upri(value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void upri(int value) {
		purc_upri_srv().upri(value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void upri(long value) {
		purc_upri_srv().upri(value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void upri(float value) {
		purc_upri_srv().upri(value);
	}

	/**
	 * Purchase unit price 購買単価.<p>
	 *
	 */
	public void upri(double value) {
		purc_upri_srv().upri(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return purc_upri_srv().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		purc_upri_srv().interim_flg(value);
	}

}

