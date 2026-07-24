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
 * ブロック"BaseCur"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BaseCurR_MC_A extends MCConstRow {

	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public static final String $bc = "bc";

	public static final String $cur_cd = $bc + ".cur_cd";
	public static final String $cur_nm = $bc + ".cur_nm";
	public static final String $amt_dec_place = $bc + ".amt_dec_place";
	public static final String $upri_dec_place = $bc + ".upri_dec_place";

	public static final MCMeta bc_META = createInnerRowMeta($bc, mcframe.serverMA.dbc.MAM_CUR_R.class);

	protected static final ConstMetaList<BaseCurR> constMetas = new ConstMetaList<BaseCurR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			bc_META
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
	protected BaseCurR_MC_A(ConstMetaList<? extends BaseCurR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BaseCurR clone() {
		return (BaseCurR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BaseCurR createInstance() {
		return (BaseCurR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BaseCurR getValues(String... names) {
		return (BaseCurR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_CUR_R bc(){
		return (mcframe.serverMA.dbc.MAM_CUR_R) getConstInnerRow(offset + 0, $bc);
	}
	
	/**
	 * Base currency 基準通貨.<p>
	 *
	 */
	public void bc(mcframe.serverMA.dbc.MAM_CUR_R row){
		setConstInnerRow(offset + 0, $bc, row);
	}






	public MCRow getInnerRow(String name) {
		if ($bc.equalsIgnoreCase(name)) {
			return bc();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($bc.equalsIgnoreCase(name)) {
			bc(
				((MCContainerMeta) bc_META).castInnerRow(mcframe.serverMA.dbc.MAM_CUR_R.class, value)
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
		return bc().cur_cd();
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		bc().cur_cd(value);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return bc().cur_nm();
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		bc().cur_nm(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return bc().amt_dec_place();
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		bc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		bc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		bc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		bc().amt_dec_place(value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		bc().amt_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return bc().upri_dec_place();
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		bc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		bc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		bc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		bc().upri_dec_place(value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		bc().upri_dec_place(value);
	}

}

