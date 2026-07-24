package mcframe.serverMSBD.MSBDL0240;

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
 * ブロック"Prnt01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Prnt01_DtlR_MC_A extends MCConstRow {

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
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public static final String $prms_rcpt_grp_no = "prms_rcpt_grp_no";
	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public static final String $prms_rcpt_dlv_slip_flg = "prms_rcpt_dlv_slip_flg";
	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_mng_no = "dlv_slip_mng_no";
	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public static final String $dlv_slip_mng_seq = "dlv_slip_mng_seq";
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_no = "purc_ddlv_dlv_slip_no";
	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_seq = "purc_ddlv_dlv_slip_seq";
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_print_flg = "dlv_slip_print_flg";
	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_print_flg = "purc_ddlv_dlv_slip_print_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta prms_rcpt_grp_no_META = createCommonMeta($prms_rcpt_grp_no, mcframe.commonMS.meta.MS_META.PRMS_RCPT_GRP_NO);
	public static final MCMeta prms_rcpt_dlv_slip_flg_META = createCommonMeta($prms_rcpt_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_ddlv_dlv_slip_no_META = createCommonMeta($purc_ddlv_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta purc_ddlv_dlv_slip_seq_META = createCommonMeta($purc_ddlv_dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_print_flg_META = createCommonMeta($dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_dlv_slip_print_flg_META = createCommonMeta($purc_ddlv_dlv_slip_print_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Prnt01_DtlR> constMetas = new ConstMetaList<Prnt01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			po_no_META,
			po_rev_META,
			po_d_no_META,
			prms_rcpt_grp_no_META,
			prms_rcpt_dlv_slip_flg_META,
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			purc_ddlv_dlv_slip_no_META,
			purc_ddlv_dlv_slip_seq_META,
			dlv_slip_print_flg_META,
			purc_ddlv_dlv_slip_print_flg_META
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
	protected Prnt01_DtlR_MC_A(ConstMetaList<? extends Prnt01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_DtlR clone() {
		return (Prnt01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_DtlR createInstance() {
		return (Prnt01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Prnt01_DtlR getValues(String... names) {
		return (Prnt01_DtlR) super.getValues(names);
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
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 3, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 3, $po_d_no, value);
	}


	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public String prms_rcpt_grp_no() {
		return getConstString(offset + 4, $prms_rcpt_grp_no);
	}

	/**
	 * Order promising result received G No. 納期回答受領ＧＮＯ.<p>
	 *
	 */
	public void prms_rcpt_grp_no(String value) {
		setConstString(offset + 4, $prms_rcpt_grp_no, value);
	}


	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public boolean prms_rcpt_dlv_slip_flg() {
		return getConstBoolean(offset + 5, $prms_rcpt_dlv_slip_flg);
	}

	/**
	 * Delivery note at order promising result receipt 納期回答受領時納品書.<p>
	 *
	 */
	public void prms_rcpt_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 5, $prms_rcpt_dlv_slip_flg, value);
	}


	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 6, $dlv_slip_mng_no);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 6, $dlv_slip_mng_no, value);
	}


	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 7, $dlv_slip_mng_seq);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 7, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 7, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 7, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 7, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 7, $dlv_slip_mng_seq, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 8, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 8, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public MCNumber purc_ddlv_dlv_slip_seq() {
		return getConstNumber(offset + 9, $purc_ddlv_dlv_slip_seq);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 9, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(int value) {
		setConstNumber(offset + 9, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(long value) {
		setConstNumber(offset + 9, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(float value) {
		setConstNumber(offset + 9, $purc_ddlv_dlv_slip_seq, value);
	}

	/**
	 * Direct delivery delivery note sequence number 仕入直送納品書連番.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_seq(double value) {
		setConstNumber(offset + 9, $purc_ddlv_dlv_slip_seq, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_print_flg() {
		return getConstBoolean(offset + 10, $dlv_slip_print_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 10, $dlv_slip_print_flg, value);
	}


	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public boolean purc_ddlv_dlv_slip_print_flg() {
		return getConstBoolean(offset + 11, $purc_ddlv_dlv_slip_print_flg);
	}

	/**
	 * Issue direct delivery delivery note 仕入直送納品書発行.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_print_flg(boolean value) {
		setConstBoolean(offset + 11, $purc_ddlv_dlv_slip_print_flg, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			return prms_rcpt_grp_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			return prms_rcpt_dlv_slip_flg();
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return dlv_slip_print_flg();
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_print_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($prms_rcpt_grp_no.equalsIgnoreCase(name)) {
			prms_rcpt_grp_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
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
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_seq.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($prms_rcpt_dlv_slip_flg.equalsIgnoreCase(name)) {
			prms_rcpt_dlv_slip_flg(value);
			return;
		}
		if ($dlv_slip_print_flg.equalsIgnoreCase(name)) {
			dlv_slip_print_flg(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_print_flg.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_print_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

