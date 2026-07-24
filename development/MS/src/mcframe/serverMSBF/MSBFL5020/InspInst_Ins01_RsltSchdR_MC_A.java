package mcframe.serverMSBF.MSBFL5020;

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
 * ブロック"InspInst_Ins01_RsltSchd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspInst_Ins01_RsltSchdR_MC_A extends MCConstRow {

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public static final String $peg_no_hdr = "peg_no_hdr";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public static final String $insp_schd_no = "insp_schd_no";
	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public static final String $smpl_inst_qty = "smpl_inst_qty";


	public static final MCMeta peg_no_hdr_META = createCommonMeta($peg_no_hdr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta insp_schd_no_META = createCommonMeta($insp_schd_no, mcframe.commonMA.meta.MA_META.INSP_SCHD_NO);
	public static final MCMeta smpl_inst_qty_META = createCommonMeta($smpl_inst_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<InspInst_Ins01_RsltSchdR> constMetas = new ConstMetaList<InspInst_Ins01_RsltSchdR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_hdr_META,
			peg_no_META,
			insp_schd_no_META,
			smpl_inst_qty_META
		},
		new String[][]{
			{
			},
			{
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
	protected InspInst_Ins01_RsltSchdR_MC_A(ConstMetaList<? extends InspInst_Ins01_RsltSchdR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Ins01_RsltSchdR clone() {
		return (InspInst_Ins01_RsltSchdR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Ins01_RsltSchdR createInstance() {
		return (InspInst_Ins01_RsltSchdR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspInst_Ins01_RsltSchdR getValues(String... names) {
		return (InspInst_Ins01_RsltSchdR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public MCNumber peg_no_hdr() {
		return getConstNumber(offset + 0, $peg_no_hdr);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(MCNumber value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(int value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(long value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(float value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}

	/**
	 * Pegging No. (Header) 紐付けＮＯ(ヘッダ).<p>
	 *
	 */
	public void peg_no_hdr(double value) {
		setConstNumber(offset + 0, $peg_no_hdr, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 1, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 1, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 1, $peg_no, value);
	}


	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public String insp_schd_no() {
		return getConstString(offset + 2, $insp_schd_no);
	}

	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public void insp_schd_no(String value) {
		setConstString(offset + 2, $insp_schd_no, value);
	}


	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return getConstNumber(offset + 3, $smpl_inst_qty);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		setConstNumber(offset + 3, $smpl_inst_qty, value);
	}


	public String getString(String name) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			return peg_no_hdr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			return insp_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			return peg_no_hdr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_schd_no.equalsIgnoreCase(name)) {
			insp_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no_hdr.equalsIgnoreCase(name)) {
			peg_no_hdr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

