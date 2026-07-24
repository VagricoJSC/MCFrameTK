package mcframe.serverMSBE.MSBEL5520;

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
 * ブロック"ShipLot_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipLot_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Shipping lot 出荷ロット.<p>
	 *
	 */
	public static final String $sl = "sl";
	/**
	 * Shipping lot exclusive lot flg. 出荷ロット排他ロットＦＬＧ.<p>
	 *
	 */
	public static final String $lock_flg = "lock_flg";
	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public static final String $ship_valid_grp_cd = "ship_valid_grp_cd";
	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public static final String $valid_dt_fr = "valid_dt_fr";
	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public static final String $valid_dt_fr_grp = "valid_dt_fr_grp";
	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
	/**
	 * Original shipping allocation status No. 元出荷引当状況ＮＯ.<p>
	 *
	 */
	public static final String $org_ship_alloc_sts_no = "org_ship_alloc_sts_no";
	/**
	 * Original shipping result details No. 元出荷実績明細ＮＯ.<p>
	 *
	 */
	public static final String $org_ship_act_d_no = "org_ship_act_d_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	public static final String $slo_d_no = "slo_d_no";
	public static final String $ship_schd_no = "ship_schd_no";
	public static final String $dlv_inst_rcpt_no = "dlv_inst_rcpt_no";
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	public static final String $ship_act_no = "ship_act_no";

	public static final String $cst_cd = $sl + ".cst_cd";
	public static final String $dlv_cd = $sl + ".dlv_cd";
	public static final String $itm_cd = $sl + ".itm_cd";
	public static final String $itm_sub1 = $sl + ".itm_sub1";
	public static final String $itm_sub2 = $sl + ".itm_sub2";
	public static final String $itm_sub3 = $sl + ".itm_sub3";
	public static final String $base_dt = $sl + ".base_dt";
	public static final String $lot_no = $sl + ".lot_no";
	public static final String $sublot_no = $sl + ".sublot_no";
	public static final String $valid_dt = $sl + ".valid_dt";
	public static final String $ship_alloc_sts_no = $sl + ".ship_alloc_sts_no";
	public static final String $ship_act_d_no = $sl + ".ship_act_d_no";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sl_META = createInnerRowMeta($sl, mcframe.serverMS.dbc.MST_SHIP_LOT_R.class);
	public static final MCMeta lock_flg_META = createCommonMeta($lock_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_valid_grp_cd_META = createCommonMeta($ship_valid_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_VALID_GRP_CD);
	public static final MCMeta valid_dt_fr_META = createCommonMeta($valid_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_fr_grp_META = createCommonMeta($valid_dt_fr_grp, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta org_ship_alloc_sts_no_META = createCommonMeta($org_ship_alloc_sts_no, mcframe.commonMA.meta.MA_META.SHIP_ALLOC_STS_NO);
	public static final MCMeta org_ship_act_d_no_META = createCommonMeta($org_ship_act_d_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_D_NO);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta dlv_inst_rcpt_no_META = createCommonMeta($dlv_inst_rcpt_no, mcframe.commonMA.meta.MA_META.DLV_INST_RCPT_NO);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);

	protected static final ConstMetaList<ShipLot_DtlR> constMetas = new ConstMetaList<ShipLot_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			sl_META,
			lock_flg_META,
			ship_valid_grp_cd_META,
			valid_dt_fr_META,
			valid_dt_fr_grp_META,
			valid_dt_to_META,
			org_ship_alloc_sts_no_META,
			org_ship_act_d_no_META,
			err_flg_META,
			slo_d_no_META,
			ship_schd_no_META,
			dlv_inst_rcpt_no_META,
			ship_inst_d_no_META,
			ship_act_no_META
		},
		new String[][]{
			{
				"cst_cd",
				"dlv_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"base_dt",
				"lot_no",
				"sublot_no",
				"valid_dt",
				"ship_alloc_sts_no",
				"ship_act_d_no"
			},
			{
				$cst_cd,
				$dlv_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$base_dt,
				$lot_no,
				$sublot_no,
				$valid_dt,
				$ship_alloc_sts_no,
				$ship_act_d_no
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
	protected ShipLot_DtlR_MC_A(ConstMetaList<? extends ShipLot_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipLot_DtlR clone() {
		return (ShipLot_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipLot_DtlR createInstance() {
		return (ShipLot_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipLot_DtlR getValues(String... names) {
		return (ShipLot_DtlR) super.getValues(names);
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
	 * Shipping lot 出荷ロット.<p>
	 *
	 */
	public mcframe.serverMS.dbc.MST_SHIP_LOT_R sl(){
		return (mcframe.serverMS.dbc.MST_SHIP_LOT_R) getConstInnerRow(offset + 1, $sl);
	}
	
	/**
	 * Shipping lot 出荷ロット.<p>
	 *
	 */
	public void sl(mcframe.serverMS.dbc.MST_SHIP_LOT_R row){
		setConstInnerRow(offset + 1, $sl, row);
	}


	/**
	 * Shipping lot exclusive lot flg. 出荷ロット排他ロットＦＬＧ.<p>
	 *
	 */
	public boolean lock_flg() {
		return getConstBoolean(offset + 2, $lock_flg);
	}

	/**
	 * Shipping lot exclusive lot flg. 出荷ロット排他ロットＦＬＧ.<p>
	 *
	 */
	public void lock_flg(boolean value) {
		setConstBoolean(offset + 2, $lock_flg, value);
	}


	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public String ship_valid_grp_cd() {
		return getConstString(offset + 3, $ship_valid_grp_cd);
	}

	/**
	 * Shipping expiration date group cd. 出荷有効期限グループＣＤ.<p>
	 *
	 */
	public void ship_valid_grp_cd(String value) {
		setConstString(offset + 3, $ship_valid_grp_cd, value);
	}


	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public MCDate valid_dt_fr() {
		return getConstDate(offset + 4, $valid_dt_fr);
	}

	/**
	 * Expiration date (Lower limit) 有効期限（下限）.<p>
	 *
	 */
	public void valid_dt_fr(MCDate value) {
		setConstDate(offset + 4, $valid_dt_fr, value);
	}


	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public MCNumber valid_dt_fr_grp() {
		return getConstNumber(offset + 5, $valid_dt_fr_grp);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(MCNumber value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(int value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(long value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(float value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}

	/**
	 * Expiration date (Lower limit) copy G 有効期限（下限）継承Ｇ.<p>
	 *
	 */
	public void valid_dt_fr_grp(double value) {
		setConstNumber(offset + 5, $valid_dt_fr_grp, value);
	}


	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 6, $valid_dt_to);
	}

	/**
	 * Expiration date (Upper limit) 有効期限（上限）.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 6, $valid_dt_to, value);
	}


	/**
	 * Original shipping allocation status No. 元出荷引当状況ＮＯ.<p>
	 *
	 */
	public String org_ship_alloc_sts_no() {
		return getConstString(offset + 7, $org_ship_alloc_sts_no);
	}

	/**
	 * Original shipping allocation status No. 元出荷引当状況ＮＯ.<p>
	 *
	 */
	public void org_ship_alloc_sts_no(String value) {
		setConstString(offset + 7, $org_ship_alloc_sts_no, value);
	}


	/**
	 * Original shipping result details No. 元出荷実績明細ＮＯ.<p>
	 *
	 */
	public String org_ship_act_d_no() {
		return getConstString(offset + 8, $org_ship_act_d_no);
	}

	/**
	 * Original shipping result details No. 元出荷実績明細ＮＯ.<p>
	 *
	 */
	public void org_ship_act_d_no(String value) {
		setConstString(offset + 8, $org_ship_act_d_no, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 9, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 9, $err_flg, value);
	}


	public String slo_d_no() {
		return getConstString(offset + 10, $slo_d_no);
	}

	public void slo_d_no(String value) {
		setConstString(offset + 10, $slo_d_no, value);
	}


	public String ship_schd_no() {
		return getConstString(offset + 11, $ship_schd_no);
	}

	public void ship_schd_no(String value) {
		setConstString(offset + 11, $ship_schd_no, value);
	}


	public String dlv_inst_rcpt_no() {
		return getConstString(offset + 12, $dlv_inst_rcpt_no);
	}

	public void dlv_inst_rcpt_no(String value) {
		setConstString(offset + 12, $dlv_inst_rcpt_no, value);
	}


	public String ship_inst_d_no() {
		return getConstString(offset + 13, $ship_inst_d_no);
	}

	public void ship_inst_d_no(String value) {
		setConstString(offset + 13, $ship_inst_d_no, value);
	}


	public String ship_act_no() {
		return getConstString(offset + 14, $ship_act_no);
	}

	public void ship_act_no(String value) {
		setConstString(offset + 14, $ship_act_no, value);
	}


	public String getString(String name) {
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($org_ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return org_ship_alloc_sts_no();
		}
		if ($org_ship_act_d_no.equalsIgnoreCase(name)) {
			return org_ship_act_d_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($lock_flg.equalsIgnoreCase(name)) {
			return lock_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			return ship_valid_grp_cd();
		}
		if ($org_ship_alloc_sts_no.equalsIgnoreCase(name)) {
			return org_ship_alloc_sts_no();
		}
		if ($org_ship_act_d_no.equalsIgnoreCase(name)) {
			return org_ship_act_d_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			return valid_dt_fr_grp();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lock_flg.equalsIgnoreCase(name)) {
			return lock_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($org_ship_alloc_sts_no.equalsIgnoreCase(name)) {
			org_ship_alloc_sts_no(value);
			return;
		}
		if ($org_ship_act_d_no.equalsIgnoreCase(name)) {
			org_ship_act_d_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lock_flg.equalsIgnoreCase(name)) {
			lock_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_valid_grp_cd.equalsIgnoreCase(name)) {
			ship_valid_grp_cd(value);
			return;
		}
		if ($org_ship_alloc_sts_no.equalsIgnoreCase(name)) {
			org_ship_alloc_sts_no(value);
			return;
		}
		if ($org_ship_act_d_no.equalsIgnoreCase(name)) {
			org_ship_act_d_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($valid_dt_fr_grp.equalsIgnoreCase(name)) {
			valid_dt_fr_grp(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lock_flg.equalsIgnoreCase(name)) {
			lock_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sl.equalsIgnoreCase(name)) {
			return sl();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sl.equalsIgnoreCase(name)) {
			sl(
				((MCContainerMeta) sl_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_LOT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return sl().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		sl().cst_cd(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return sl().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		sl().dlv_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return sl().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		sl().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return sl().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		sl().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return sl().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		sl().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return sl().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		sl().itm_sub3(value);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return sl().base_dt();
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		sl().base_dt(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return sl().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		sl().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return sl().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		sl().sublot_no(value);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate valid_dt() {
		return sl().valid_dt();
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void valid_dt(MCDate value) {
		sl().valid_dt(value);
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return sl().ship_alloc_sts_no();
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		sl().ship_alloc_sts_no(value);
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public String ship_act_d_no() {
		return sl().ship_act_d_no();
	}

	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public void ship_act_d_no(String value) {
		sl().ship_act_d_no(value);
	}

}

