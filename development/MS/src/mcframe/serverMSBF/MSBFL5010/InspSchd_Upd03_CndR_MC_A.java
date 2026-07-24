package mcframe.serverMSBF.MSBFL5010;

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
 * ブロック"InspSchd_Upd03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class InspSchd_Upd03_CndR_MC_A extends MCConstRow {

	public static final String $insp_schd = "insp_schd";
	public static final String $pre_insp_inst = "pre_insp_inst";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";

	public static final String $src_no4 = $insp_schd + ".src_no4";
	public static final String $insp_typ = $insp_schd + ".insp_typ";

	public static final MCMeta insp_schd_META = createInnerRowMeta($insp_schd, mcframe.serverMS.dbc.MST_INSP_SCHD_R.class);
	public static final MCMeta pre_insp_inst_META = createInnerRowMeta($pre_insp_inst, mcframe.serverMS.dbc.MST_INSP_INST_R.class);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<InspSchd_Upd03_CndR> constMetas = new ConstMetaList<InspSchd_Upd03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			insp_schd_META,
			pre_insp_inst_META,
			quality_typ_META,
			insp_judg_rslt_typ_META,
			peg_no_META
		},
		new String[][]{
			{
				"src_no4",
				"insp_typ"
			},
			{
				$src_no4,
				$insp_typ
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
	protected InspSchd_Upd03_CndR_MC_A(ConstMetaList<? extends InspSchd_Upd03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Upd03_CndR clone() {
		return (InspSchd_Upd03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Upd03_CndR createInstance() {
		return (InspSchd_Upd03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public InspSchd_Upd03_CndR getValues(String... names) {
		return (InspSchd_Upd03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_INSP_SCHD_R insp_schd(){
		return (mcframe.serverMS.dbc.MST_INSP_SCHD_R) getConstInnerRow(offset + 0, $insp_schd);
	}
	
	public void insp_schd(mcframe.serverMS.dbc.MST_INSP_SCHD_R row){
		setConstInnerRow(offset + 0, $insp_schd, row);
	}


	public mcframe.serverMS.dbc.MST_INSP_INST_R pre_insp_inst(){
		return (mcframe.serverMS.dbc.MST_INSP_INST_R) getConstInnerRow(offset + 1, $pre_insp_inst);
	}
	
	public void pre_insp_inst(mcframe.serverMS.dbc.MST_INSP_INST_R row){
		setConstInnerRow(offset + 1, $pre_insp_inst, row);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 2, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 2, $quality_typ, value);
	}


	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 3, $insp_judg_rslt_typ);
	}

	/**
	 * Inspection decision result type 検査判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 3, $insp_judg_rslt_typ, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 4, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 4, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 4, $peg_no, value);
	}


	public String getString(String name) {
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($insp_schd.equalsIgnoreCase(name)) {
			return insp_schd();
		}
		if ($pre_insp_inst.equalsIgnoreCase(name)) {
			return pre_insp_inst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($insp_schd.equalsIgnoreCase(name)) {
			insp_schd(
				((MCContainerMeta) insp_schd_META).castInnerRow(mcframe.serverMS.dbc.MST_INSP_SCHD_R.class, value)
			);
			return;
		}
		if ($pre_insp_inst.equalsIgnoreCase(name)) {
			pre_insp_inst(
				((MCContainerMeta) pre_insp_inst_META).castInnerRow(mcframe.serverMS.dbc.MST_INSP_INST_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public String src_no4() {
		return insp_schd().src_no4();
	}

	/**
	 * Source No. 4 作成元ＮＯ４.<p>
	 *
	 */
	public void src_no4(String value) {
		insp_schd().src_no4(value);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return insp_schd().insp_typ();
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		insp_schd().insp_typ(value);
	}

}

