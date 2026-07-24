package mcframe.serverMSBD.MSBDL0080;

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
 * ブロック"Prnt01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt01_HdrR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public static final String $po_rev = "po_rev";
	/**
	 * Issue PO sheet 注文書発行.<p>
	 *
	 */
	public static final String $prnt_po_flg = "prnt_po_flg";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $prnt_dlv_flg = "prnt_dlv_flg";
	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public static final String $prnt_purc_ddlv_dlv_flg = "prnt_purc_ddlv_dlv_flg";
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public static final String $indiv_prnt_flg = "indiv_prnt_flg";
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta prnt_po_flg_META = createCommonMeta($prnt_po_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_dlv_flg_META = createCommonMeta($prnt_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_purc_ddlv_dlv_flg_META = createCommonMeta($prnt_purc_ddlv_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta indiv_prnt_flg_META = createCommonMeta($indiv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);

	protected static final ConstMetaList<Prnt01_HdrR> constMetas = new ConstMetaList<Prnt01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			po_no_META,
			po_rev_META,
			prnt_po_flg_META,
			prnt_dlv_flg_META,
			prnt_purc_ddlv_dlv_flg_META,
			indiv_prnt_flg_META,
			sppl_ship_form_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	protected Prnt01_HdrR_MC_A(ConstMetaList<? extends Prnt01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_HdrR clone() {
		return (Prnt01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_HdrR createInstance() {
		return (Prnt01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_HdrR getValues(String... names) {
		return (Prnt01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 1, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 1, $po_no, value);
	}


	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 2, $po_rev);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 2, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 2, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 2, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 2, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 2, $po_rev, value);
	}


	/**
	 * Issue PO sheet 注文書発行.<p>
	 *
	 */
	public boolean prnt_po_flg() {
		return getConstBoolean(offset + 3, $prnt_po_flg);
	}

	/**
	 * Issue PO sheet 注文書発行.<p>
	 *
	 */
	public void prnt_po_flg(boolean value) {
		setConstBoolean(offset + 3, $prnt_po_flg, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean prnt_dlv_flg() {
		return getConstBoolean(offset + 4, $prnt_dlv_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void prnt_dlv_flg(boolean value) {
		setConstBoolean(offset + 4, $prnt_dlv_flg, value);
	}


	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public boolean prnt_purc_ddlv_dlv_flg() {
		return getConstBoolean(offset + 5, $prnt_purc_ddlv_dlv_flg);
	}

	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public void prnt_purc_ddlv_dlv_flg(boolean value) {
		setConstBoolean(offset + 5, $prnt_purc_ddlv_dlv_flg, value);
	}


	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public boolean indiv_prnt_flg() {
		return getConstBoolean(offset + 6, $indiv_prnt_flg);
	}

	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public void indiv_prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $indiv_prnt_flg, value);
	}


	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 7, $sppl_ship_form_cd);
	}

	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 7, $sppl_ship_form_cd, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			return prnt_po_flg();
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_dlv_flg();
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_purc_ddlv_dlv_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			return prnt_po_flg();
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_dlv_flg();
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			return prnt_purc_ddlv_dlv_flg();
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			return indiv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			prnt_po_flg(value);
			return;
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			prnt_dlv_flg(value);
			return;
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			prnt_purc_ddlv_dlv_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prnt_po_flg.equalsIgnoreCase(name)) {
			prnt_po_flg(value);
			return;
		}
		if ($prnt_dlv_flg.equalsIgnoreCase(name)) {
			prnt_dlv_flg(value);
			return;
		}
		if ($prnt_purc_ddlv_dlv_flg.equalsIgnoreCase(name)) {
			prnt_purc_ddlv_dlv_flg(value);
			return;
		}
		if ($indiv_prnt_flg.equalsIgnoreCase(name)) {
			indiv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

