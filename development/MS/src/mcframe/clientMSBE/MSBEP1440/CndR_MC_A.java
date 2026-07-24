package mcframe.clientMSBE.MSBEP1440;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $screen_ope = "screen_ope";
	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public static final String $srch_tgt_typ = "srch_tgt_typ";
	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public static final String $srch_tgt_typ_nm = "srch_tgt_typ_nm";
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public static final String $srch_tgt_no = "srch_tgt_no";
	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public static final String $ship_act_rev = "ship_act_rev";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta screen_ope_META = createStringMeta($screen_ope);
	public static final MCMeta srch_tgt_typ_META = createCommonMeta($srch_tgt_typ, mcframe.commonMS.meta.MS_META.STK_SRCH_TGT_TYP);
	public static final MCMeta srch_tgt_typ_nm_META = createCommonMeta($srch_tgt_typ_nm, mcframe.commonMS.meta.MS_META.STK_SRCH_TGT_TYP_NM);
	public static final MCMeta srch_tgt_no_META = createCommonMeta($srch_tgt_no, mcframe.commonMS.meta.MS_META.SRCH_TGT_NO);
	public static final MCMeta ship_act_rev_META = createCommonMeta($ship_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			screen_ope_META,
			srch_tgt_typ_META,
			srch_tgt_typ_nm_META,
			srch_tgt_no_META,
			ship_act_rev_META,
			ship_act_no_META,
			dlv_slip_no_META,
			ship_schd_no_META,
			latest_flg_META
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
				{$srch_tgt_typ_nm, "stk_srch_tgt_typ"}	// srch_tgt_typ_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String screen_ope() {
		return getConstString(offset + 1, $screen_ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void screen_ope(String value) {
		setConstString(offset + 1, $screen_ope, value);
	}


	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public String srch_tgt_typ() {
		return getConstString(offset + 2, $srch_tgt_typ);
	}

	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public void srch_tgt_typ(String value) {
		setConstString(offset + 2, $srch_tgt_typ, value);
	}


	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public String srch_tgt_typ_nm() {
		return getConstString(offset + 3, $srch_tgt_typ_nm);
	}

	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public void srch_tgt_typ_nm(String value) {
		setConstString(offset + 3, $srch_tgt_typ_nm, value);
	}


	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public String srch_tgt_no() {
		return getConstString(offset + 4, $srch_tgt_no);
	}

	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public void srch_tgt_no(String value) {
		setConstString(offset + 4, $srch_tgt_no, value);
	}


	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public MCNumber ship_act_rev() {
		return getConstNumber(offset + 5, $ship_act_rev);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(MCNumber value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(int value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(long value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(float value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(double value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 6, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 6, $ship_act_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 7, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 7, $dlv_slip_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 8, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 8, $ship_schd_no, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 9, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 9, $latest_flg, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($screen_ope.equalsIgnoreCase(name)) {
			return screen_ope();
		}
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			return srch_tgt_typ();
		}
		if ($srch_tgt_typ_nm.equalsIgnoreCase(name)) {
			return srch_tgt_typ_nm();
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($screen_ope.equalsIgnoreCase(name)) {
			return screen_ope();
		}
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			return srch_tgt_typ();
		}
		if ($srch_tgt_typ_nm.equalsIgnoreCase(name)) {
			return srch_tgt_typ_nm();
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($screen_ope.equalsIgnoreCase(name)) {
			screen_ope(value);
			return;
		}
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			srch_tgt_typ(value);
			return;
		}
		if ($srch_tgt_typ_nm.equalsIgnoreCase(name)) {
			srch_tgt_typ_nm(value);
			return;
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($screen_ope.equalsIgnoreCase(name)) {
			screen_ope(value);
			return;
		}
		if ($srch_tgt_typ.equalsIgnoreCase(name)) {
			srch_tgt_typ(value);
			return;
		}
		if ($srch_tgt_typ_nm.equalsIgnoreCase(name)) {
			srch_tgt_typ_nm(value);
			return;
		}
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

