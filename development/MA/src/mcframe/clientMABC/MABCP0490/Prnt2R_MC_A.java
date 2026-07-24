package mcframe.clientMABC.MABCP0490;

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
 * ブロック"Prnt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt2R_MC_A extends MCConstRow {

	/**
	 * Text (Correct: without temporary unit price) テキスト（訂正：仮単価なし）.<p>
	 *
	 */
	public static final String $txt_mod_off = "txt_mod_off";
	/**
	 * Text (Correct: with temporary unit price) テキスト（訂正：仮単価あり）.<p>
	 *
	 */
	public static final String $txt_mod_on = "txt_mod_on";


	public static final MCMeta txt_mod_off_META = createCommonMeta($txt_mod_off, mcframe.commonMA.meta.MA_META.PO_PRINT_TXT);
	public static final MCMeta txt_mod_on_META = createCommonMeta($txt_mod_on, mcframe.commonMA.meta.MA_META.PO_PRINT_TXT);

	protected static final ConstMetaList<Prnt2R> constMetas = new ConstMetaList<Prnt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			txt_mod_off_META,
			txt_mod_on_META
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
	protected Prnt2R_MC_A(ConstMetaList<? extends Prnt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt2R clone() {
		return (Prnt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt2R createInstance() {
		return (Prnt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt2R getValues(String... names) {
		return (Prnt2R) super.getValues(names);
	}



	/**
	 * Text (Correct: without temporary unit price) テキスト（訂正：仮単価なし）.<p>
	 *
	 */
	public String txt_mod_off() {
		return getConstString(offset + 0, $txt_mod_off);
	}

	/**
	 * Text (Correct: without temporary unit price) テキスト（訂正：仮単価なし）.<p>
	 *
	 */
	public void txt_mod_off(String value) {
		setConstString(offset + 0, $txt_mod_off, value);
	}


	/**
	 * Text (Correct: with temporary unit price) テキスト（訂正：仮単価あり）.<p>
	 *
	 */
	public String txt_mod_on() {
		return getConstString(offset + 1, $txt_mod_on);
	}

	/**
	 * Text (Correct: with temporary unit price) テキスト（訂正：仮単価あり）.<p>
	 *
	 */
	public void txt_mod_on(String value) {
		setConstString(offset + 1, $txt_mod_on, value);
	}


	public String getString(String name) {
		if ($txt_mod_off.equalsIgnoreCase(name)) {
			return txt_mod_off();
		}
		if ($txt_mod_on.equalsIgnoreCase(name)) {
			return txt_mod_on();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($txt_mod_off.equalsIgnoreCase(name)) {
			return txt_mod_off();
		}
		if ($txt_mod_on.equalsIgnoreCase(name)) {
			return txt_mod_on();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($txt_mod_off.equalsIgnoreCase(name)) {
			txt_mod_off(value);
			return;
		}
		if ($txt_mod_on.equalsIgnoreCase(name)) {
			txt_mod_on(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($txt_mod_off.equalsIgnoreCase(name)) {
			txt_mod_off(value);
			return;
		}
		if ($txt_mod_on.equalsIgnoreCase(name)) {
			txt_mod_on(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

