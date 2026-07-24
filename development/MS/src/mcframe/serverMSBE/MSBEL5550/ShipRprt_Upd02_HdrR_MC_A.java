package mcframe.serverMSBE.MSBEL5550;

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
 * ブロック"ShipRprt_Upd02_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipRprt_Upd02_HdrR_MC_A extends MCConstRow {

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public static final String $trn_typ = "trn_typ";
	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_inst_no = "dlv_slip_inst_no";
	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_act_no = "dlv_slip_act_no";
	/**
	 * Update delivery voucher result No. 納品伝票実績ＮＯ更新.<p>
	 *
	 */
	public static final String $dlv_slip_act_no_upd_flg = "dlv_slip_act_no_upd_flg";
	/**
	 * Slip issued 伝票発行済.<p>
	 *
	 */
	public static final String $slip_prnt_flg = "slip_prnt_flg";
	/**
	 * Update slip issued 伝票発行済更新.<p>
	 *
	 */
	public static final String $slip_prnt_upd_flg = "slip_prnt_upd_flg";
	/**
	 * Sales slip issued 売上伝票発行済.<p>
	 *
	 */
	public static final String $sls_prnt_flg = "sls_prnt_flg";
	/**
	 * Update sales slip issued 売上伝票発行済更新.<p>
	 *
	 */
	public static final String $sls_prnt_upd_flg = "sls_prnt_upd_flg";


	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta trn_typ_META = createCommonMeta($trn_typ, mcframe.commonMS.meta.MS_META.TRN_TYP);
	public static final MCMeta dlv_slip_inst_no_META = createCommonMeta($dlv_slip_inst_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_INST_NO);
	public static final MCMeta dlv_slip_act_no_META = createCommonMeta($dlv_slip_act_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_ACT_NO);
	public static final MCMeta dlv_slip_act_no_upd_flg_META = createCommonMeta($dlv_slip_act_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_prnt_flg_META = createCommonMeta($slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_prnt_upd_flg_META = createCommonMeta($slip_prnt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_prnt_flg_META = createCommonMeta($sls_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_prnt_upd_flg_META = createCommonMeta($sls_prnt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipRprt_Upd02_HdrR> constMetas = new ConstMetaList<ShipRprt_Upd02_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_slip_no_META,
			dlv_slip_seq_META,
			trn_typ_META,
			dlv_slip_inst_no_META,
			dlv_slip_act_no_META,
			dlv_slip_act_no_upd_flg_META,
			slip_prnt_flg_META,
			slip_prnt_upd_flg_META,
			sls_prnt_flg_META,
			sls_prnt_upd_flg_META
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
	protected ShipRprt_Upd02_HdrR_MC_A(ConstMetaList<? extends ShipRprt_Upd02_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipRprt_Upd02_HdrR clone() {
		return (ShipRprt_Upd02_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipRprt_Upd02_HdrR createInstance() {
		return (ShipRprt_Upd02_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipRprt_Upd02_HdrR getValues(String... names) {
		return (ShipRprt_Upd02_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 0, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 0, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 1, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 1, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 1, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 1, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 1, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 1, $dlv_slip_seq, value);
	}


	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public String trn_typ() {
		return getConstString(offset + 2, $trn_typ);
	}

	/**
	 * Transaction type トランザクション区分.<p>
	 *
	 */
	public void trn_typ(String value) {
		setConstString(offset + 2, $trn_typ, value);
	}


	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public String dlv_slip_inst_no() {
		return getConstString(offset + 3, $dlv_slip_inst_no);
	}

	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public void dlv_slip_inst_no(String value) {
		setConstString(offset + 3, $dlv_slip_inst_no, value);
	}


	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public String dlv_slip_act_no() {
		return getConstString(offset + 4, $dlv_slip_act_no);
	}

	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public void dlv_slip_act_no(String value) {
		setConstString(offset + 4, $dlv_slip_act_no, value);
	}


	/**
	 * Update delivery voucher result No. 納品伝票実績ＮＯ更新.<p>
	 *
	 */
	public boolean dlv_slip_act_no_upd_flg() {
		return getConstBoolean(offset + 5, $dlv_slip_act_no_upd_flg);
	}

	/**
	 * Update delivery voucher result No. 納品伝票実績ＮＯ更新.<p>
	 *
	 */
	public void dlv_slip_act_no_upd_flg(boolean value) {
		setConstBoolean(offset + 5, $dlv_slip_act_no_upd_flg, value);
	}


	/**
	 * Slip issued 伝票発行済.<p>
	 *
	 */
	public boolean slip_prnt_flg() {
		return getConstBoolean(offset + 6, $slip_prnt_flg);
	}

	/**
	 * Slip issued 伝票発行済.<p>
	 *
	 */
	public void slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 6, $slip_prnt_flg, value);
	}


	/**
	 * Update slip issued 伝票発行済更新.<p>
	 *
	 */
	public boolean slip_prnt_upd_flg() {
		return getConstBoolean(offset + 7, $slip_prnt_upd_flg);
	}

	/**
	 * Update slip issued 伝票発行済更新.<p>
	 *
	 */
	public void slip_prnt_upd_flg(boolean value) {
		setConstBoolean(offset + 7, $slip_prnt_upd_flg, value);
	}


	/**
	 * Sales slip issued 売上伝票発行済.<p>
	 *
	 */
	public boolean sls_prnt_flg() {
		return getConstBoolean(offset + 8, $sls_prnt_flg);
	}

	/**
	 * Sales slip issued 売上伝票発行済.<p>
	 *
	 */
	public void sls_prnt_flg(boolean value) {
		setConstBoolean(offset + 8, $sls_prnt_flg, value);
	}


	/**
	 * Update sales slip issued 売上伝票発行済更新.<p>
	 *
	 */
	public boolean sls_prnt_upd_flg() {
		return getConstBoolean(offset + 9, $sls_prnt_upd_flg);
	}

	/**
	 * Update sales slip issued 売上伝票発行済更新.<p>
	 *
	 */
	public void sls_prnt_upd_flg(boolean value) {
		setConstBoolean(offset + 9, $sls_prnt_upd_flg, value);
	}


	public String getString(String name) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			return dlv_slip_inst_no();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($dlv_slip_act_no_upd_flg.equalsIgnoreCase(name)) {
			return dlv_slip_act_no_upd_flg();
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			return slip_prnt_flg();
		}
		if ($slip_prnt_upd_flg.equalsIgnoreCase(name)) {
			return slip_prnt_upd_flg();
		}
		if ($sls_prnt_flg.equalsIgnoreCase(name)) {
			return sls_prnt_flg();
		}
		if ($sls_prnt_upd_flg.equalsIgnoreCase(name)) {
			return sls_prnt_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			return trn_typ();
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			return dlv_slip_inst_no();
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			return dlv_slip_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dlv_slip_act_no_upd_flg.equalsIgnoreCase(name)) {
			return dlv_slip_act_no_upd_flg();
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			return slip_prnt_flg();
		}
		if ($slip_prnt_upd_flg.equalsIgnoreCase(name)) {
			return slip_prnt_upd_flg();
		}
		if ($sls_prnt_flg.equalsIgnoreCase(name)) {
			return sls_prnt_flg();
		}
		if ($sls_prnt_upd_flg.equalsIgnoreCase(name)) {
			return sls_prnt_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			dlv_slip_inst_no(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dlv_slip_act_no_upd_flg.equalsIgnoreCase(name)) {
			dlv_slip_act_no_upd_flg(value);
			return;
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			slip_prnt_flg(value);
			return;
		}
		if ($slip_prnt_upd_flg.equalsIgnoreCase(name)) {
			slip_prnt_upd_flg(value);
			return;
		}
		if ($sls_prnt_flg.equalsIgnoreCase(name)) {
			sls_prnt_flg(value);
			return;
		}
		if ($sls_prnt_upd_flg.equalsIgnoreCase(name)) {
			sls_prnt_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($trn_typ.equalsIgnoreCase(name)) {
			trn_typ(value);
			return;
		}
		if ($dlv_slip_inst_no.equalsIgnoreCase(name)) {
			dlv_slip_inst_no(value);
			return;
		}
		if ($dlv_slip_act_no.equalsIgnoreCase(name)) {
			dlv_slip_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dlv_slip_act_no_upd_flg.equalsIgnoreCase(name)) {
			dlv_slip_act_no_upd_flg(value);
			return;
		}
		if ($slip_prnt_flg.equalsIgnoreCase(name)) {
			slip_prnt_flg(value);
			return;
		}
		if ($slip_prnt_upd_flg.equalsIgnoreCase(name)) {
			slip_prnt_upd_flg(value);
			return;
		}
		if ($sls_prnt_flg.equalsIgnoreCase(name)) {
			sls_prnt_flg(value);
			return;
		}
		if ($sls_prnt_upd_flg.equalsIgnoreCase(name)) {
			sls_prnt_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

