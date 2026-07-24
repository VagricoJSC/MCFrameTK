package mcframe.clientMAUB.MAUBP5330;

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
 * ブロック"PurcContFctr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcContFctrR_MC_A extends MCConstRow {

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public static final String $purc_cont_fctr = "purc_cont_fctr";


	public static final MCMeta purc_cont_fctr_META = createCommonMeta($purc_cont_fctr, mcframe.commonMA.meta.MA_META.PURC_CONT_FCTR);

	protected static final ConstMetaList<PurcContFctrR> constMetas = new ConstMetaList<PurcContFctrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			purc_cont_fctr_META
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
	protected PurcContFctrR_MC_A(ConstMetaList<? extends PurcContFctrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcContFctrR clone() {
		return (PurcContFctrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcContFctrR createInstance() {
		return (PurcContFctrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcContFctrR getValues(String... names) {
		return (PurcContFctrR) super.getValues(names);
	}



	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public MCNumber purc_cont_fctr() {
		return getConstNumber(offset + 0, $purc_cont_fctr);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(MCNumber value) {
		setConstNumber(offset + 0, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(int value) {
		setConstNumber(offset + 0, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(long value) {
		setConstNumber(offset + 0, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(float value) {
		setConstNumber(offset + 0, $purc_cont_fctr, value);
	}

	/**
	 * Purchase active ingredient coefficient 仕入有効成分係数.<p>
	 *
	 */
	public void purc_cont_fctr(double value) {
		setConstNumber(offset + 0, $purc_cont_fctr, value);
	}


	public MCNumber getNumber(String name) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			return purc_cont_fctr();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_cont_fctr.equalsIgnoreCase(name)) {
			purc_cont_fctr(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

