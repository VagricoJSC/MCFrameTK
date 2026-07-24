package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"PtaxCur"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PtaxCurR_MC_A extends MCConstRow {

	/**
	 * Tax currency 納税通貨.<p>
	 *
	 */
	public static final String $pc = "pc";

	public static final String $cur_cd = $pc + ".cur_cd";
	public static final String $cur_nm = $pc + ".cur_nm";
	public static final String $amt_dec_place = $pc + ".amt_dec_place";
	public static final String $upri_dec_place = $pc + ".upri_dec_place";

	public static final MCMeta pc_META = createInnerRowMeta($pc, mcframe.serverMA.dbc.MAM_CUR_R.class);

	protected static final ConstMetaList<PtaxCurR> constMetas = new ConstMetaList<PtaxCurR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pc_META
		},
		new String[][]{
			{
				"cur_cd",
				"cur_nm",
				"amt_dec_place",
				"upri_dec_place"
			},
			{
				$cur_cd,
				$cur_nm,
				$amt_dec_place,
				$upri_dec_place
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
	protected PtaxCurR_MC_A(ConstMetaList<? extends PtaxCurR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PtaxCurR clone() {
		return (PtaxCurR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PtaxCurR createInstance() {
		return (PtaxCurR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PtaxCurR getValues(String... names) {
		return (PtaxCurR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Tax currency 納税通貨.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_CUR_R pc(){
		return (mcframe.serverMA.dbc.MAM_CUR_R) getConstInnerRow(offset + 0, $pc);
	}
	
	/**
	 * Tax currency 納税通貨.<p>
	 *
	 */
	public void pc(mcframe.serverMA.dbc.MAM_CUR_R row){
		setConstInnerRow(offset + 0, $pc, row);
	}






	public MCRow getInnerRow(String name) {
		if ($pc.equalsIgnoreCase(name)) {
			return pc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($pc.equalsIgnoreCase(name)) {
			pc(
				((MCContainerMeta) pc_META).castInnerRow(mcframe.serverMA.dbc.MAM_CUR_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return pc().cur_cd();
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		pc().cur_cd(value);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return pc().cur_nm();
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		pc().cur_nm(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return pc().amt_dec_place();
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		pc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		pc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		pc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		pc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		pc().amt_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return pc().upri_dec_place();
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		pc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		pc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		pc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		pc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		pc().upri_dec_place(value);
	}

}

