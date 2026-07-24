package mcframe.clientMGBE.MGBEP0040;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	public static final String $qty_p = "qty_p";
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public static final String $the_upri = "the_upri";

	public static final String $base_qty = $qty_p + ".qty";

	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP0050.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta the_upri_META = createCommonMeta($the_upri, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			std_upri_META,
			the_upri_META
		},
		new String[][]{
			{
				"base_qty"
			},
			{
				$base_qty
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
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";
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
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
			new String[][]{
				{$std_upri, "STD"},	// std_upri
				{$the_upri, "STD"}	// the_upri
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	public mcframe.clientMAUB.MAUBP0050.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP0050.QtyR) getConstInnerRow(offset + 0, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP0050.QtyR row){
		setConstInnerRow(offset + 0, $qty_p, row);
	}


	public String base_unit_cd() {
		return getConstString(offset + 1, $base_unit_cd);
	}

	public void base_unit_cd(String value) {
		setConstString(offset + 1, $base_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 2, $base_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 2, $base_unit_nm, value);
	}


	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 3, $base_unit_dec_place);
	}

	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 3, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 3, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 3, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 3, $base_unit_dec_place, value);
	}

	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 3, $base_unit_dec_place, value);
	}


	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 4, $std_upri);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 4, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 4, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 4, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 4, $std_upri, value);
	}

	/**
	 * Standard unit cost 標準単価.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 4, $std_upri, value);
	}


	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public MCNumber the_upri() {
		return getConstNumber(offset + 5, $the_upri);
	}

	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public void the_upri(MCNumber value) {
		setConstNumber(offset + 5, $the_upri, value);
	}

	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public void the_upri(int value) {
		setConstNumber(offset + 5, $the_upri, value);
	}

	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public void the_upri(long value) {
		setConstNumber(offset + 5, $the_upri, value);
	}

	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public void the_upri(float value) {
		setConstNumber(offset + 5, $the_upri, value);
	}

	/**
	 * Ideal unit price 理論単価.<p>
	 *
	 */
	public void the_upri(double value) {
		setConstNumber(offset + 5, $the_upri, value);
	}


	public String getString(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			return the_upri();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			return the_upri();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($the_upri.equalsIgnoreCase(name)) {
			the_upri(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0050.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public MCNumber base_qty() {
		return qty_p().qty();
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		qty_p().qty(value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(int value) {
		qty_p().qty(value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(long value) {
		qty_p().qty(value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(float value) {
		qty_p().qty(value);
	}

	/**
	 * Base qty. 基準数量.<p>
	 *
	 */
	public void base_qty(double value) {
		qty_p().qty(value);
	}

}

