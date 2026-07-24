package mcframe.clientMBBE.MBBEP0040;

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
 * ブロック"RsltLbl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltLblR_MC_A extends MCConstRow {

	public static final String $disp_str001_lbl = "disp_str001_lbl";


	public static final MCMeta disp_str001_lbl_META = createCommonMeta($disp_str001_lbl, mcframe.commonMA.meta.MA_META.DISP_LBL);

	protected static final ConstMetaList<RsltLblR> constMetas = new ConstMetaList<RsltLblR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_str001_lbl_META
		},
		new String[][]{
			{
			},
			{
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
	protected RsltLblR_MC_A(ConstMetaList<? extends RsltLblR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltLblR clone() {
		return (RsltLblR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltLblR createInstance() {
		return (RsltLblR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltLblR getValues(String... names) {
		return (RsltLblR) super.getValues(names);
	}



	public String disp_str001_lbl() {
		return getConstString(offset + 0, $disp_str001_lbl);
	}

	public void disp_str001_lbl(String value) {
		setConstString(offset + 0, $disp_str001_lbl, value);
	}


	public String getString(String name) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			return disp_str001_lbl();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			return disp_str001_lbl();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			disp_str001_lbl(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($disp_str001_lbl.equalsIgnoreCase(name)) {
			disp_str001_lbl(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

