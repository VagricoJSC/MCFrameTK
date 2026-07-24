package mcframe.clientMGBF.MGBFP0490;

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
 * ブロック"Qty"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class QtyR_MC_A extends MCConstRow {

	/**
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Quantity 数量.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $dim = "dim";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $dim_unit_cd = "dim_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $dim_unit_nm = "dim_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dim_dec_place = "dim_dec_place";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $wt = "wt";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $wt_unit_cd = "wt_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $wt_unit_nm = "wt_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $wt_dec_place = "wt_dec_place";
	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public static final String $conts = "conts";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $conts_unit_cd = "conts_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $conts_unit_nm = "conts_unit_nm";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $conts_dec_place = "conts_dec_place";


	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dim_unit_cd_META = createCommonMeta($dim_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dim_unit_nm_META = createCommonMeta($dim_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dim_dec_place_META = createCommonMeta($dim_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wt_unit_cd_META = createCommonMeta($wt_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta wt_unit_nm_META = createCommonMeta($wt_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta wt_dec_place_META = createCommonMeta($wt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta conts_META = createCommonMeta($conts, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta conts_unit_cd_META = createCommonMeta($conts_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta conts_unit_nm_META = createCommonMeta($conts_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta conts_dec_place_META = createCommonMeta($conts_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);

	protected static final ConstMetaList<QtyR> constMetas = new ConstMetaList<QtyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ym_META,
			qty_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			dim_META,
			dim_unit_cd_META,
			dim_unit_nm_META,
			dim_dec_place_META,
			wt_META,
			wt_unit_cd_META,
			wt_unit_nm_META,
			wt_dec_place_META,
			conts_META,
			conts_unit_cd_META,
			conts_unit_nm_META,
			conts_dec_place_META
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CLEAR]のキー定数 */
	public static final String $$CLEAR = "CLEAR";
	/** 項目属性情報のグループ[SHOW]のキー定数 */
	public static final String $$SHOW = "SHOW";
	/** 項目属性情報のグループ[HKEY]のキー定数 */
	public static final String $$HKEY = "HKEY";
	/** 項目属性情報のグループ[OTHER]のキー定数 */
	public static final String $$OTHER = "OTHER";
	/** 項目属性情報のグループ[HVAL]のキー定数 */
	public static final String $$HVAL = "HVAL";
	/** 項目属性情報のグループ[ELM]のキー定数 */
	public static final String $$ELM = "ELM";
	/** 項目属性情報のグループ[VIEW_SCALE]のキー定数 */
	public static final String $$VIEW_SCALE = "VIEW_SCALE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
			}
		)),
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
		new MCExtMap.Entry($$CLEAR, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SHOW, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HKEY, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$OTHER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$HVAL, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ELM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$VIEW_SCALE, new MCExtList(
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
	protected QtyR_MC_A(ConstMetaList<? extends QtyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtyR clone() {
		return (QtyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtyR createInstance() {
		return (QtyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtyR getValues(String... names) {
		return (QtyR) super.getValues(names);
	}



	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}


	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 1, $qty);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 1, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 1, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 1, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 1, $qty, value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 1, $qty, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 2, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 2, $unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 3, $unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 3, $unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 4, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 4, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 4, $dec_place, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 5, $dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 5, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 5, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 5, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 5, $dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 5, $dim, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String dim_unit_cd() {
		return getConstString(offset + 6, $dim_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void dim_unit_cd(String value) {
		setConstString(offset + 6, $dim_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String dim_unit_nm() {
		return getConstString(offset + 7, $dim_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void dim_unit_nm(String value) {
		setConstString(offset + 7, $dim_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dim_dec_place() {
		return getConstNumber(offset + 8, $dim_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(MCNumber value) {
		setConstNumber(offset + 8, $dim_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(int value) {
		setConstNumber(offset + 8, $dim_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(long value) {
		setConstNumber(offset + 8, $dim_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(float value) {
		setConstNumber(offset + 8, $dim_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dim_dec_place(double value) {
		setConstNumber(offset + 8, $dim_dec_place, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 9, $wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 9, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 9, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 9, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 9, $wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 9, $wt, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String wt_unit_cd() {
		return getConstString(offset + 10, $wt_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void wt_unit_cd(String value) {
		setConstString(offset + 10, $wt_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String wt_unit_nm() {
		return getConstString(offset + 11, $wt_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void wt_unit_nm(String value) {
		setConstString(offset + 11, $wt_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber wt_dec_place() {
		return getConstNumber(offset + 12, $wt_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(MCNumber value) {
		setConstNumber(offset + 12, $wt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(int value) {
		setConstNumber(offset + 12, $wt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(long value) {
		setConstNumber(offset + 12, $wt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(float value) {
		setConstNumber(offset + 12, $wt_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void wt_dec_place(double value) {
		setConstNumber(offset + 12, $wt_dec_place, value);
	}


	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public MCNumber conts() {
		return getConstNumber(offset + 13, $conts);
	}

	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public void conts(MCNumber value) {
		setConstNumber(offset + 13, $conts, value);
	}

	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public void conts(int value) {
		setConstNumber(offset + 13, $conts, value);
	}

	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public void conts(long value) {
		setConstNumber(offset + 13, $conts, value);
	}

	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public void conts(float value) {
		setConstNumber(offset + 13, $conts, value);
	}

	/**
	 * Conversion 入り目.<p>
	 *
	 */
	public void conts(double value) {
		setConstNumber(offset + 13, $conts, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String conts_unit_cd() {
		return getConstString(offset + 14, $conts_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void conts_unit_cd(String value) {
		setConstString(offset + 14, $conts_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String conts_unit_nm() {
		return getConstString(offset + 15, $conts_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void conts_unit_nm(String value) {
		setConstString(offset + 15, $conts_unit_nm, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber conts_dec_place() {
		return getConstNumber(offset + 16, $conts_dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void conts_dec_place(MCNumber value) {
		setConstNumber(offset + 16, $conts_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void conts_dec_place(int value) {
		setConstNumber(offset + 16, $conts_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void conts_dec_place(long value) {
		setConstNumber(offset + 16, $conts_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void conts_dec_place(float value) {
		setConstNumber(offset + 16, $conts_dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void conts_dec_place(double value) {
		setConstNumber(offset + 16, $conts_dec_place, value);
	}


	public String getString(String name) {
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			return conts_unit_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			return dim_dec_place();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			return wt_dec_place();
		}
		if ($conts.equalsIgnoreCase(name)) {
			return conts();
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			return conts_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			return dim_unit_nm();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			return wt_unit_nm();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			return conts_unit_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			return dim_dec_place();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			return wt_dec_place();
		}
		if ($conts.equalsIgnoreCase(name)) {
			return conts();
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			return conts_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			conts_unit_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($dim_unit_nm.equalsIgnoreCase(name)) {
			dim_unit_nm(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($wt_unit_nm.equalsIgnoreCase(name)) {
			wt_unit_nm(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($conts_unit_nm.equalsIgnoreCase(name)) {
			conts_unit_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($dim_dec_place.equalsIgnoreCase(name)) {
			dim_dec_place(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($wt_dec_place.equalsIgnoreCase(name)) {
			wt_dec_place(value);
			return;
		}
		if ($conts.equalsIgnoreCase(name)) {
			conts(value);
			return;
		}
		if ($conts_dec_place.equalsIgnoreCase(name)) {
			conts_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

