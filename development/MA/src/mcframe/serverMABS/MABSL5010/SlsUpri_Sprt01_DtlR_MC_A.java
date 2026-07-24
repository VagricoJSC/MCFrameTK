package mcframe.serverMABS.MABSL5010;

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
 * ブロック"SlsUpri_Sprt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsUpri_Sprt01_DtlR_MC_A extends MCConstRow {

	public static final String $sls_upri_srv = "sls_upri_srv";
	/**
	 * No error flg. エラー無しＦＬＧ.<p>
	 *
	 */
	public static final String $not_err_flg = "not_err_flg";

	public static final String $peg_no = $sls_upri_srv + ".peg_no";
	public static final String $grp_no = $sls_upri_srv + ".grp_no";
	public static final String $wg_cd = $sls_upri_srv + ".wg_cd";
	public static final String $sls_upri_flg = $sls_upri_srv + ".sls_upri_flg";
	public static final String $std_sls_upri_flg = $sls_upri_srv + ".std_sls_upri_flg";
	public static final String $std_upri_flg = $sls_upri_srv + ".std_upri_flg";
	public static final String $itm_cd = $sls_upri_srv + ".itm_cd";
	public static final String $itm_sub1 = $sls_upri_srv + ".itm_sub1";
	public static final String $itm_sub2 = $sls_upri_srv + ".itm_sub2";
	public static final String $itm_sub3 = $sls_upri_srv + ".itm_sub3";
	public static final String $cst_cd = $sls_upri_srv + ".cst_cd";
	public static final String $dlv_cd = $sls_upri_srv + ".dlv_cd";
	public static final String $dest_cd1 = $sls_upri_srv + ".dest_cd1";
	public static final String $dest_cd2 = $sls_upri_srv + ".dest_cd2";
	public static final String $dest_cd3 = $sls_upri_srv + ".dest_cd3";
	public static final String $unit_cd = $sls_upri_srv + ".unit_cd";
	public static final String $qty = $sls_upri_srv + ".qty";
	public static final String $cur_cd = $sls_upri_srv + ".cur_cd";
	public static final String $dt = $sls_upri_srv + ".dt";
	public static final String $std_upri_wg_cd = $sls_upri_srv + ".std_upri_wg_cd";
	public static final String $sls_upri = $sls_upri_srv + ".sls_upri";
	public static final String $std_sls_upri = $sls_upri_srv + ".std_sls_upri";
	public static final String $std_upri = $sls_upri_srv + ".std_upri";
	public static final String $interim_flg = $sls_upri_srv + ".interim_flg";

	public static final MCMeta sls_upri_srv_META = createInnerRowMeta($sls_upri_srv, mcframe.serverMA.dbc.MAW_SLS_UPRI_SRV_R.class);
	public static final MCMeta not_err_flg_META = createCommonMeta($not_err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<SlsUpri_Sprt01_DtlR> constMetas = new ConstMetaList<SlsUpri_Sprt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sls_upri_srv_META,
			not_err_flg_META
		},
		new String[][]{
			{
				"peg_no",
				"grp_no",
				"wg_cd",
				"sls_upri_flg",
				"std_sls_upri_flg",
				"std_upri_flg",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"cst_cd",
				"dlv_cd",
				"dest_cd1",
				"dest_cd2",
				"dest_cd3",
				"unit_cd",
				"qty",
				"cur_cd",
				"dt",
				"std_upri_wg_cd",
				"sls_upri",
				"std_sls_upri",
				"std_upri",
				"interim_flg"
			},
			{
				$peg_no,
				$grp_no,
				$wg_cd,
				$sls_upri_flg,
				$std_sls_upri_flg,
				$std_upri_flg,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$cst_cd,
				$dlv_cd,
				$dest_cd1,
				$dest_cd2,
				$dest_cd3,
				$unit_cd,
				$qty,
				$cur_cd,
				$dt,
				$std_upri_wg_cd,
				$sls_upri,
				$std_sls_upri,
				$std_upri,
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
	protected SlsUpri_Sprt01_DtlR_MC_A(ConstMetaList<? extends SlsUpri_Sprt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsUpri_Sprt01_DtlR clone() {
		return (SlsUpri_Sprt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsUpri_Sprt01_DtlR createInstance() {
		return (SlsUpri_Sprt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsUpri_Sprt01_DtlR getValues(String... names) {
		return (SlsUpri_Sprt01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMA.dbc.MAW_SLS_UPRI_SRV_R sls_upri_srv(){
		return (mcframe.serverMA.dbc.MAW_SLS_UPRI_SRV_R) getConstInnerRow(offset + 0, $sls_upri_srv);
	}
	
	public void sls_upri_srv(mcframe.serverMA.dbc.MAW_SLS_UPRI_SRV_R row){
		setConstInnerRow(offset + 0, $sls_upri_srv, row);
	}


	/**
	 * No error flg. エラー無しＦＬＧ.<p>
	 *
	 */
	public boolean not_err_flg() {
		return getConstBoolean(offset + 1, $not_err_flg);
	}

	/**
	 * No error flg. エラー無しＦＬＧ.<p>
	 *
	 */
	public void not_err_flg(boolean value) {
		setConstBoolean(offset + 1, $not_err_flg, value);
	}


	public boolean getBoolean(String name) {
		if ($not_err_flg.equalsIgnoreCase(name)) {
			return not_err_flg();
		}
		return super.getBoolean(name);
	}

	public boolean getBooleanNE(String name) {
		if ($not_err_flg.equalsIgnoreCase(name)) {
			return not_err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setBoolean(String name, boolean value) {
		if ($not_err_flg.equalsIgnoreCase(name)) {
			not_err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($not_err_flg.equalsIgnoreCase(name)) {
			not_err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sls_upri_srv.equalsIgnoreCase(name)) {
			return sls_upri_srv();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sls_upri_srv.equalsIgnoreCase(name)) {
			sls_upri_srv(
				((MCContainerMeta) sls_upri_srv_META).castInnerRow(mcframe.serverMA.dbc.MAW_SLS_UPRI_SRV_R.class, value)
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
		return sls_upri_srv().peg_no();
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		sls_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		sls_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		sls_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		sls_upri_srv().peg_no(value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		sls_upri_srv().peg_no(value);
	}

	/**
	 * Group No. グループＮＯ.<p>
	 *
	 */
	public String grp_no() {
		return sls_upri_srv().grp_no();
	}

	/**
	 * Group No. グループＮＯ.<p>
	 *
	 */
	public void grp_no(String value) {
		sls_upri_srv().grp_no(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return sls_upri_srv().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		sls_upri_srv().wg_cd(value);
	}

	/**
	 * Sales unit price acquisition flg. 販売単価取得ＦＬＧ.<p>
	 *
	 */
	public boolean sls_upri_flg() {
		return sls_upri_srv().sls_upri_flg();
	}

	/**
	 * Sales unit price acquisition flg. 販売単価取得ＦＬＧ.<p>
	 *
	 */
	public void sls_upri_flg(boolean value) {
		sls_upri_srv().sls_upri_flg(value);
	}

	/**
	 * Standard sales unit price acquisition flg. 標準販売単価取得ＦＬＧ.<p>
	 *
	 */
	public boolean std_sls_upri_flg() {
		return sls_upri_srv().std_sls_upri_flg();
	}

	/**
	 * Standard sales unit price acquisition flg. 標準販売単価取得ＦＬＧ.<p>
	 *
	 */
	public void std_sls_upri_flg(boolean value) {
		sls_upri_srv().std_sls_upri_flg(value);
	}

	/**
	 * Standard unit cost acquisition flg. 標準単価取得ＦＬＧ.<p>
	 *
	 */
	public boolean std_upri_flg() {
		return sls_upri_srv().std_upri_flg();
	}

	/**
	 * Standard unit cost acquisition flg. 標準単価取得ＦＬＧ.<p>
	 *
	 */
	public void std_upri_flg(boolean value) {
		sls_upri_srv().std_upri_flg(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return sls_upri_srv().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		sls_upri_srv().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return sls_upri_srv().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		sls_upri_srv().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return sls_upri_srv().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		sls_upri_srv().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return sls_upri_srv().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		sls_upri_srv().itm_sub3(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sls_upri_srv().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sls_upri_srv().cst_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return sls_upri_srv().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		sls_upri_srv().dlv_cd(value);
	}

	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public String dest_cd1() {
		return sls_upri_srv().dest_cd1();
	}

	/**
	 * Distribution channel 1 cd. 仕向先１ＣＤ.<p>
	 *
	 */
	public void dest_cd1(String value) {
		sls_upri_srv().dest_cd1(value);
	}

	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public String dest_cd2() {
		return sls_upri_srv().dest_cd2();
	}

	/**
	 * Distribution channel 2 cd. 仕向先２ＣＤ.<p>
	 *
	 */
	public void dest_cd2(String value) {
		sls_upri_srv().dest_cd2(value);
	}

	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public String dest_cd3() {
		return sls_upri_srv().dest_cd3();
	}

	/**
	 * Distribution channel 3 cd. 仕向先３ＣＤ.<p>
	 *
	 */
	public void dest_cd3(String value) {
		sls_upri_srv().dest_cd3(value);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return sls_upri_srv().unit_cd();
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		sls_upri_srv().unit_cd(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return sls_upri_srv().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		sls_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		sls_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		sls_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		sls_upri_srv().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		sls_upri_srv().qty(value);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return sls_upri_srv().cur_cd();
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		sls_upri_srv().cur_cd(value);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate dt() {
		return sls_upri_srv().dt();
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void dt(MCDate value) {
		sls_upri_srv().dt(value);
	}

	/**
	 * Standard unit cost WG cd. 標準単価ワーキンググループＣＤ.<p>
	 *
	 */
	public String std_upri_wg_cd() {
		return sls_upri_srv().std_upri_wg_cd();
	}

	/**
	 * Standard unit cost WG cd. 標準単価ワーキンググループＣＤ.<p>
	 *
	 */
	public void std_upri_wg_cd(String value) {
		sls_upri_srv().std_upri_wg_cd(value);
	}

	/**
	 * Sales unit price 販売単価.<p>
	 *
	 */
	public MCNumber sls_upri() {
		return sls_upri_srv().sls_upri();
	}

	/**
	 * Sales unit price 販売単価.<p>
	 *
	 */
	public void sls_upri(MCNumber value) {
		sls_upri_srv().sls_upri(value);
	}

	/**
	 * Sales unit price 販売単価.<p>
	 *
	 */
	public void sls_upri(int value) {
		sls_upri_srv().sls_upri(value);
	}

	/**
	 * Sales unit price 販売単価.<p>
	 *
	 */
	public void sls_upri(long value) {
		sls_upri_srv().sls_upri(value);
	}

	/**
	 * Sales unit price 販売単価.<p>
	 *
	 */
	public void sls_upri(float value) {
		sls_upri_srv().sls_upri(value);
	}

	/**
	 * Sales unit price 販売単価.<p>
	 *
	 */
	public void sls_upri(double value) {
		sls_upri_srv().sls_upri(value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public MCNumber std_sls_upri() {
		return sls_upri_srv().std_sls_upri();
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri(MCNumber value) {
		sls_upri_srv().std_sls_upri(value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri(int value) {
		sls_upri_srv().std_sls_upri(value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri(long value) {
		sls_upri_srv().std_sls_upri(value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri(float value) {
		sls_upri_srv().std_sls_upri(value);
	}

	/**
	 * Standard sales unit price 標準販売単価.<p>
	 *
	 */
	public void std_sls_upri(double value) {
		sls_upri_srv().std_sls_upri(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return sls_upri_srv().std_upri();
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		sls_upri_srv().std_upri(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(int value) {
		sls_upri_srv().std_upri(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(long value) {
		sls_upri_srv().std_upri(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(float value) {
		sls_upri_srv().std_upri(value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(double value) {
		sls_upri_srv().std_upri(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return sls_upri_srv().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		sls_upri_srv().interim_flg(value);
	}

}

