package mcframe.clientMSBH.MSBHP0160;

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
 * ブロック"Typ"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class TypR_MC_A extends MCConstRow {

	/**
	 * chk_bal, Collated balance transfer, 0; not_chk, Uncollated balance transfer, 1 chk_bal,照合済残高振替,0;not_chk,未照合残高振替,1.<p>
	 *
	 */
	public static final String $typ = "typ";


	public static final MCMeta typ_META = createStringMeta($typ);

	protected static final ConstMetaList<TypR> constMetas = new ConstMetaList<TypR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			typ_META
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected TypR_MC_A(ConstMetaList<? extends TypR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TypR clone() {
		return (TypR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TypR createInstance() {
		return (TypR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public TypR getValues(String... names) {
		return (TypR) super.getValues(names);
	}



	/**
	 * chk_bal, Collated balance transfer, 0; not_chk, Uncollated balance transfer, 1 chk_bal,照合済残高振替,0;not_chk,未照合残高振替,1.<p>
	 *
	 */
	public String typ() {
		return getConstString(offset + 0, $typ);
	}

	/**
	 * chk_bal, Collated balance transfer, 0; not_chk, Uncollated balance transfer, 1 chk_bal,照合済残高振替,0;not_chk,未照合残高振替,1.<p>
	 *
	 */
	public void typ(String value) {
		setConstString(offset + 0, $typ, value);
	}


	public String getString(String name) {
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

