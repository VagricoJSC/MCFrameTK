package mcframe.serverMSBD.MSBDL0140;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt_to = "purc_schd_dt_to";
	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public static final String $rcpt_iv_src_typ = "rcpt_iv_src_typ";
	/**
	 * Search only GR/GI 受払のみ検索する.<p>
	 *
	 */
	public static final String $io_srch_only_flg = "io_srch_only_flg";


	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta purc_schd_dt_to_META = createCommonMeta($purc_schd_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta rcpt_iv_src_typ_META = createCommonMeta($rcpt_iv_src_typ, mcframe.commonMS.meta.MS_META.RCPT_IV_SRC_TYP);
	public static final MCMeta io_srch_only_flg_META = createCommonMeta($io_srch_only_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			po_no_META,
			purc_schd_dt_to_META,
			purc_slip_each_lot_typ_META,
			purc_schd_no_META,
			arr_act_no_META,
			rcpt_iv_src_typ_META,
			io_srch_only_flg_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 0, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 0, $po_no, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt_to() {
		return getConstDate(offset + 1, $purc_schd_dt_to);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt_to(MCDate value) {
		setConstDate(offset + 1, $purc_schd_dt_to, value);
	}


	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 2, $purc_slip_each_lot_typ);
	}

	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 2, $purc_slip_each_lot_typ, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 3, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 3, $purc_schd_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 4, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 4, $arr_act_no, value);
	}


	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public String rcpt_iv_src_typ() {
		return getConstString(offset + 5, $rcpt_iv_src_typ);
	}

	/**
	 * Purchase invoice creating source type 受領インボイス作成元区分.<p>
	 *
	 */
	public void rcpt_iv_src_typ(String value) {
		setConstString(offset + 5, $rcpt_iv_src_typ, value);
	}


	/**
	 * Search only GR/GI 受払のみ検索する.<p>
	 *
	 */
	public boolean io_srch_only_flg() {
		return getConstBoolean(offset + 6, $io_srch_only_flg);
	}

	/**
	 * Search only GR/GI 受払のみ検索する.<p>
	 *
	 */
	public void io_srch_only_flg(boolean value) {
		setConstBoolean(offset + 6, $io_srch_only_flg, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			return purc_schd_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			return io_srch_only_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			return rcpt_iv_src_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			return purc_schd_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			return io_srch_only_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			purc_schd_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			io_srch_only_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($rcpt_iv_src_typ.equalsIgnoreCase(name)) {
			rcpt_iv_src_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_schd_dt_to.equalsIgnoreCase(name)) {
			purc_schd_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($io_srch_only_flg.equalsIgnoreCase(name)) {
			io_srch_only_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

