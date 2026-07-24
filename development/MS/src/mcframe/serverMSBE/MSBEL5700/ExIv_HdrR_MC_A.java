package mcframe.serverMSBE.MSBEL5700;

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
 * ブロック"ExIv_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ExIv_HdrR_MC_A extends MCConstRow {

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	public static final String $iv = "iv";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";

	public static final String $iv_mng_no = $iv + ".iv_mng_no";
	public static final String $iv_rev = $iv + ".iv_rev";
	public static final String $iv_no = $iv + ".iv_no";
	public static final String $iv_src_typ = $iv + ".iv_src_typ";
	public static final String $cmpl_schd_dt = $iv + ".cmpl_schd_dt";
	public static final String $cmpl_dt = $iv + ".cmpl_dt";
	public static final String $iv_dt = $iv + ".iv_dt";
	public static final String $trd_ptn_typ = $iv + ".trd_ptn_typ";
	public static final String $ship_rqst_id_typ = $iv + ".ship_rqst_id_typ";
	public static final String $ship_rqst_id_cd = $iv + ".ship_rqst_id_cd";
	public static final String $tdlv_cd = $iv + ".tdlv_cd";
	public static final String $tdlv_nm = $iv + ".tdlv_nm";
	public static final String $via_dlv_typ = $iv + ".via_dlv_typ";
	public static final String $tdlv_cntct_dpt = $iv + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $iv + ".tdlv_cntct_psn";
	public static final String $tdlv_zip_cd = $iv + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $iv + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $iv + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $iv + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $iv + ".tdlv_addr4";
	public static final String $tdlv_tel = $iv + ".tdlv_tel";
	public static final String $tdlv_fax = $iv + ".tdlv_fax";
	public static final String $dlv_id_typ = $iv + ".dlv_id_typ";
	public static final String $dlv_id_cd = $iv + ".dlv_id_cd";
	public static final String $dlv_id_nm = $iv + ".dlv_id_nm";
	public static final String $dlv_cntct_dpt = $iv + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $iv + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $iv + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $iv + ".dlv_addr1";
	public static final String $dlv_addr2 = $iv + ".dlv_addr2";
	public static final String $dlv_addr3 = $iv + ".dlv_addr3";
	public static final String $dlv_addr4 = $iv + ".dlv_addr4";
	public static final String $dlv_tel = $iv + ".dlv_tel";
	public static final String $dlv_fax = $iv + ".dlv_fax";
	public static final String $dlv_cntry_cd = $iv + ".dlv_cntry_cd";
	public static final String $dlv_sundry_flg = $iv + ".dlv_sundry_flg";
	public static final String $trnspt_cd = $iv + ".trnspt_cd";
	public static final String $vssl_flght = $iv + ".vssl_flght";
	public static final String $load_port_cd = $iv + ".load_port_cd";
	public static final String $etd_dt = $iv + ".etd_dt";
	public static final String $dschrg_port_cd = $iv + ".dschrg_port_cd";
	public static final String $eta_dt = $iv + ".eta_dt";
	public static final String $via_port_cd = $iv + ".via_port_cd";
	public static final String $via_schd_dt = $iv + ".via_schd_dt";
	public static final String $sls_basis_typ = $iv + ".sls_basis_typ";
	public static final String $tterm_cd1 = $iv + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $iv + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $iv + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $iv + ".tterm_rmrks2";
	public static final String $trd_cur_cd = $iv + ".trd_cur_cd";
	public static final String $ptax_cur_cd = $iv + ".ptax_cur_cd";
	public static final String $tterm_cd3 = $iv + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $iv + ".tterm_rmrks3";
	public static final String $bill_basis_dt = $iv + ".bill_basis_dt";
	public static final String $rcv_schd_dt = $iv + ".rcv_schd_dt";
	public static final String $ttl_trd_cur_amt = $iv + ".ttl_trd_cur_amt";
	public static final String $xrate_inpt_flg = $iv + ".xrate_inpt_flg";
	public static final String $xrate = $iv + ".xrate";
	public static final String $ptax_xrate_inpt_flg = $iv + ".ptax_xrate_inpt_flg";
	public static final String $ptax_xrate = $iv + ".ptax_xrate";
	public static final String $ttl_net_wt = $iv + ".ttl_net_wt";
	public static final String $ttl_grss_wt = $iv + ".ttl_grss_wt";
	public static final String $ttl_dim = $iv + ".ttl_dim";
	public static final String $iv_rmrks = $iv + ".iv_rmrks";
	public static final String $pl_rmrks = $iv + ".pl_rmrks";
	public static final String $case_mrk1 = $iv + ".case_mrk1";
	public static final String $case_mrk2 = $iv + ".case_mrk2";
	public static final String $case_mrk3 = $iv + ".case_mrk3";
	public static final String $case_mrk4 = $iv + ".case_mrk4";
	public static final String $case_mrk5 = $iv + ".case_mrk5";
	public static final String $case_mrk6 = $iv + ".case_mrk6";
	public static final String $lc_no = $iv + ".lc_no";
	public static final String $lc_dt = $iv + ".lc_dt";
	public static final String $lc_rmrks = $iv + ".lc_rmrks";
	public static final String $bl_no = $iv + ".bl_no";
	public static final String $bl_dt = $iv + ".bl_dt";
	public static final String $bl_rmrks = $iv + ".bl_rmrks";
	public static final String $pl_reg_flg = $iv + ".pl_reg_flg";
	public static final String $pl_skip_flg = $iv + ".pl_skip_flg";
	public static final String $cmpl_flg = $iv + ".cmpl_flg";
	public static final String $non_cmpl_flg = $iv + ".non_cmpl_flg";
	public static final String $iv_ship_flg = $iv + ".iv_ship_flg";
	public static final String $iv_prnt_flg = $iv + ".iv_prnt_flg";
	public static final String $pl_prnt_flg = $iv + ".pl_prnt_flg";
	public static final String $rcpt_iv_mng_no = $iv + ".rcpt_iv_mng_no";
	public static final String $rcpt_iv_no = $iv + ".rcpt_iv_no";
	public static final String $pre_rcpt_iv_flg = $iv + ".pre_rcpt_iv_flg";
	public static final String $intr_rmrks = $iv + ".intr_rmrks";
	public static final String $sub_char1 = $iv + ".sub_char1";
	public static final String $sub_char2 = $iv + ".sub_char2";
	public static final String $sub_char3 = $iv + ".sub_char3";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta iv_META = createInnerRowMeta($iv, mcframe.serverMS.dbc.MST_IV_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ExIv_HdrR> constMetas = new ConstMetaList<ExIv_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			iv_META,
			err_flg_META
		},
		new String[][]{
			{
				"iv_mng_no",
				"iv_rev",
				"iv_no",
				"iv_src_typ",
				"cmpl_schd_dt",
				"cmpl_dt",
				"iv_dt",
				"trd_ptn_typ",
				"ship_rqst_id_typ",
				"ship_rqst_id_cd",
				"tdlv_cd",
				"tdlv_nm",
				"via_dlv_typ",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"dlv_id_typ",
				"dlv_id_cd",
				"dlv_id_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_cntry_cd",
				"dlv_sundry_flg",
				"trnspt_cd",
				"vssl_flght",
				"load_port_cd",
				"etd_dt",
				"dschrg_port_cd",
				"eta_dt",
				"via_port_cd",
				"via_schd_dt",
				"sls_basis_typ",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"trd_cur_cd",
				"ptax_cur_cd",
				"tterm_cd3",
				"tterm_rmrks3",
				"bill_basis_dt",
				"rcv_schd_dt",
				"ttl_trd_cur_amt",
				"xrate_inpt_flg",
				"xrate",
				"ptax_xrate_inpt_flg",
				"ptax_xrate",
				"ttl_net_wt",
				"ttl_grss_wt",
				"ttl_dim",
				"iv_rmrks",
				"pl_rmrks",
				"case_mrk1",
				"case_mrk2",
				"case_mrk3",
				"case_mrk4",
				"case_mrk5",
				"case_mrk6",
				"lc_no",
				"lc_dt",
				"lc_rmrks",
				"bl_no",
				"bl_dt",
				"bl_rmrks",
				"pl_reg_flg",
				"pl_skip_flg",
				"cmpl_flg",
				"non_cmpl_flg",
				"iv_ship_flg",
				"iv_prnt_flg",
				"pl_prnt_flg",
				"rcpt_iv_mng_no",
				"rcpt_iv_no",
				"pre_rcpt_iv_flg",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3"
			},
			{
				$iv_mng_no,
				$iv_rev,
				$iv_no,
				$iv_src_typ,
				$cmpl_schd_dt,
				$cmpl_dt,
				$iv_dt,
				$trd_ptn_typ,
				$ship_rqst_id_typ,
				$ship_rqst_id_cd,
				$tdlv_cd,
				$tdlv_nm,
				$via_dlv_typ,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$dlv_id_typ,
				$dlv_id_cd,
				$dlv_id_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_cntry_cd,
				$dlv_sundry_flg,
				$trnspt_cd,
				$vssl_flght,
				$load_port_cd,
				$etd_dt,
				$dschrg_port_cd,
				$eta_dt,
				$via_port_cd,
				$via_schd_dt,
				$sls_basis_typ,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$trd_cur_cd,
				$ptax_cur_cd,
				$tterm_cd3,
				$tterm_rmrks3,
				$bill_basis_dt,
				$rcv_schd_dt,
				$ttl_trd_cur_amt,
				$xrate_inpt_flg,
				$xrate,
				$ptax_xrate_inpt_flg,
				$ptax_xrate,
				$ttl_net_wt,
				$ttl_grss_wt,
				$ttl_dim,
				$iv_rmrks,
				$pl_rmrks,
				$case_mrk1,
				$case_mrk2,
				$case_mrk3,
				$case_mrk4,
				$case_mrk5,
				$case_mrk6,
				$lc_no,
				$lc_dt,
				$lc_rmrks,
				$bl_no,
				$bl_dt,
				$bl_rmrks,
				$pl_reg_flg,
				$pl_skip_flg,
				$cmpl_flg,
				$non_cmpl_flg,
				$iv_ship_flg,
				$iv_prnt_flg,
				$pl_prnt_flg,
				$rcpt_iv_mng_no,
				$rcpt_iv_no,
				$pre_rcpt_iv_flg,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3
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
	protected ExIv_HdrR_MC_A(ConstMetaList<? extends ExIv_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExIv_HdrR clone() {
		return (ExIv_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExIv_HdrR createInstance() {
		return (ExIv_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ExIv_HdrR getValues(String... names) {
		return (ExIv_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	public mcframe.serverMS.dbc.MST_IV_R iv(){
		return (mcframe.serverMS.dbc.MST_IV_R) getConstInnerRow(offset + 1, $iv);
	}
	
	public void iv(mcframe.serverMS.dbc.MST_IV_R row){
		setConstInnerRow(offset + 1, $iv, row);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
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
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($iv.equalsIgnoreCase(name)) {
			return iv();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($iv.equalsIgnoreCase(name)) {
			iv(
				((MCContainerMeta) iv_META).castInnerRow(mcframe.serverMS.dbc.MST_IV_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return iv().iv_mng_no();
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		iv().iv_mng_no(value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return iv().iv_rev();
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		iv().iv_rev(value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(int value) {
		iv().iv_rev(value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(long value) {
		iv().iv_rev(value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(float value) {
		iv().iv_rev(value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(double value) {
		iv().iv_rev(value);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return iv().iv_no();
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		iv().iv_no(value);
	}

	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public String iv_src_typ() {
		return iv().iv_src_typ();
	}

	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public void iv_src_typ(String value) {
		iv().iv_src_typ(value);
	}

	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public MCDate cmpl_schd_dt() {
		return iv().cmpl_schd_dt();
	}

	/**
	 * Scheduled completion date 完了予定日.<p>
	 *
	 */
	public void cmpl_schd_dt(MCDate value) {
		iv().cmpl_schd_dt(value);
	}

	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public MCDate cmpl_dt() {
		return iv().cmpl_dt();
	}

	/**
	 * Completion date 完了日.<p>
	 *
	 */
	public void cmpl_dt(MCDate value) {
		iv().cmpl_dt(value);
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return iv().iv_dt();
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		iv().iv_dt(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return iv().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		iv().trd_ptn_typ(value);
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return iv().ship_rqst_id_typ();
	}

	/**
	 * Shipping requested identification type 出荷依頼先識別区分.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		iv().ship_rqst_id_typ(value);
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return iv().ship_rqst_id_cd();
	}

	/**
	 * Shipping requested alias cd. 出荷依頼先識別ＣＤ.<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		iv().ship_rqst_id_cd(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return iv().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		iv().tdlv_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return iv().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		iv().tdlv_nm(value);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return iv().via_dlv_typ();
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		iv().via_dlv_typ(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return iv().tdlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		iv().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return iv().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		iv().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return iv().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		iv().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return iv().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		iv().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return iv().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		iv().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return iv().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		iv().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return iv().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		iv().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return iv().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		iv().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return iv().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		iv().tdlv_fax(value);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return iv().dlv_id_typ();
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		iv().dlv_id_typ(value);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return iv().dlv_id_cd();
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		iv().dlv_id_cd(value);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return iv().dlv_id_nm();
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		iv().dlv_id_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return iv().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		iv().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return iv().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		iv().dlv_cntct_psn(value);
	}

	/**
	 * ZIP (Delivery destination) 納品先ＺＩＰ.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return iv().dlv_zip_cd();
	}

	/**
	 * ZIP (Delivery destination) 納品先ＺＩＰ.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		iv().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return iv().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		iv().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return iv().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		iv().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return iv().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		iv().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return iv().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		iv().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return iv().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		iv().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return iv().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		iv().dlv_fax(value);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return iv().dlv_cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		iv().dlv_cntry_cd(value);
	}

	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return iv().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous delivery destination flg. 納品先諸口ＦＬＧ.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		iv().dlv_sundry_flg(value);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return iv().trnspt_cd();
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		iv().trnspt_cd(value);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return iv().vssl_flght();
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		iv().vssl_flght(value);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return iv().load_port_cd();
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		iv().load_port_cd(value);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return iv().etd_dt();
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		iv().etd_dt(value);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return iv().dschrg_port_cd();
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		iv().dschrg_port_cd(value);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return iv().eta_dt();
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		iv().eta_dt(value);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return iv().via_port_cd();
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		iv().via_port_cd(value);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return iv().via_schd_dt();
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		iv().via_schd_dt(value);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return iv().sls_basis_typ();
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		iv().sls_basis_typ(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return iv().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		iv().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return iv().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		iv().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return iv().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		iv().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return iv().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		iv().tterm_rmrks2(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return iv().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		iv().trd_cur_cd(value);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return iv().ptax_cur_cd();
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		iv().ptax_cur_cd(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return iv().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		iv().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return iv().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		iv().tterm_rmrks3(value);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return iv().bill_basis_dt();
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		iv().bill_basis_dt(value);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return iv().rcv_schd_dt();
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		iv().rcv_schd_dt(value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_amt() {
		return iv().ttl_trd_cur_amt();
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(MCNumber value) {
		iv().ttl_trd_cur_amt(value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(int value) {
		iv().ttl_trd_cur_amt(value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(long value) {
		iv().ttl_trd_cur_amt(value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(float value) {
		iv().ttl_trd_cur_amt(value);
	}

	/**
	 * Amount total (Transaction currency) 取引通貨金額合計.<p>
	 *
	 */
	public void ttl_trd_cur_amt(double value) {
		iv().ttl_trd_cur_amt(value);
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return iv().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		iv().xrate_inpt_flg(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return iv().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		iv().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		iv().xrate(value);
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return iv().ptax_xrate_inpt_flg();
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		iv().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return iv().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		iv().ptax_xrate(value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public MCNumber ttl_net_wt() {
		return iv().ttl_net_wt();
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(MCNumber value) {
		iv().ttl_net_wt(value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(int value) {
		iv().ttl_net_wt(value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(long value) {
		iv().ttl_net_wt(value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(float value) {
		iv().ttl_net_wt(value);
	}

	/**
	 * Net weight total 純重量合計.<p>
	 *
	 */
	public void ttl_net_wt(double value) {
		iv().ttl_net_wt(value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public MCNumber ttl_grss_wt() {
		return iv().ttl_grss_wt();
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(MCNumber value) {
		iv().ttl_grss_wt(value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(int value) {
		iv().ttl_grss_wt(value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(long value) {
		iv().ttl_grss_wt(value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(float value) {
		iv().ttl_grss_wt(value);
	}

	/**
	 * Total gross weight 総重量合計.<p>
	 *
	 */
	public void ttl_grss_wt(double value) {
		iv().ttl_grss_wt(value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public MCNumber ttl_dim() {
		return iv().ttl_dim();
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(MCNumber value) {
		iv().ttl_dim(value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(int value) {
		iv().ttl_dim(value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(long value) {
		iv().ttl_dim(value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(float value) {
		iv().ttl_dim(value);
	}

	/**
	 * Total volume 容積合計.<p>
	 *
	 */
	public void ttl_dim(double value) {
		iv().ttl_dim(value);
	}

	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public String iv_rmrks() {
		return iv().iv_rmrks();
	}

	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		iv().iv_rmrks(value);
	}

	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public String pl_rmrks() {
		return iv().pl_rmrks();
	}

	/**
	 * Packing list remarks パッキングリスト備考.<p>
	 *
	 */
	public void pl_rmrks(String value) {
		iv().pl_rmrks(value);
	}

	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public String case_mrk1() {
		return iv().case_mrk1();
	}

	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public void case_mrk1(String value) {
		iv().case_mrk1(value);
	}

	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public String case_mrk2() {
		return iv().case_mrk2();
	}

	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public void case_mrk2(String value) {
		iv().case_mrk2(value);
	}

	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public String case_mrk3() {
		return iv().case_mrk3();
	}

	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public void case_mrk3(String value) {
		iv().case_mrk3(value);
	}

	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public String case_mrk4() {
		return iv().case_mrk4();
	}

	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public void case_mrk4(String value) {
		iv().case_mrk4(value);
	}

	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public String case_mrk5() {
		return iv().case_mrk5();
	}

	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public void case_mrk5(String value) {
		iv().case_mrk5(value);
	}

	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public String case_mrk6() {
		return iv().case_mrk6();
	}

	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public void case_mrk6(String value) {
		iv().case_mrk6(value);
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return iv().lc_no();
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		iv().lc_no(value);
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return iv().lc_dt();
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		iv().lc_dt(value);
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return iv().lc_rmrks();
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		iv().lc_rmrks(value);
	}

	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return iv().bl_no();
	}

	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		iv().bl_no(value);
	}

	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return iv().bl_dt();
	}

	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		iv().bl_dt(value);
	}

	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return iv().bl_rmrks();
	}

	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		iv().bl_rmrks(value);
	}

	/**
	 * Packing list entry flg. パッキングリスト登録ＦＬＧ.<p>
	 *
	 */
	public boolean pl_reg_flg() {
		return iv().pl_reg_flg();
	}

	/**
	 * Packing list entry flg. パッキングリスト登録ＦＬＧ.<p>
	 *
	 */
	public void pl_reg_flg(boolean value) {
		iv().pl_reg_flg(value);
	}

	/**
	 * Packing list omission flg. パッキングリスト省略ＦＬＧ.<p>
	 *
	 */
	public boolean pl_skip_flg() {
		return iv().pl_skip_flg();
	}

	/**
	 * Packing list omission flg. パッキングリスト省略ＦＬＧ.<p>
	 *
	 */
	public void pl_skip_flg(boolean value) {
		iv().pl_skip_flg(value);
	}

	/**
	 * Completed flg. 完了ＦＬＧ.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return iv().cmpl_flg();
	}

	/**
	 * Completed flg. 完了ＦＬＧ.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		iv().cmpl_flg(value);
	}

	/**
	 * Not to complete flg. 完了対象外ＦＬＧ.<p>
	 *
	 */
	public boolean non_cmpl_flg() {
		return iv().non_cmpl_flg();
	}

	/**
	 * Not to complete flg. 完了対象外ＦＬＧ.<p>
	 *
	 */
	public void non_cmpl_flg(boolean value) {
		iv().non_cmpl_flg(value);
	}

	/**
	 * Shipping invoice unit flg. インボイス単位出荷ＦＬＧ.<p>
	 *
	 */
	public boolean iv_ship_flg() {
		return iv().iv_ship_flg();
	}

	/**
	 * Shipping invoice unit flg. インボイス単位出荷ＦＬＧ.<p>
	 *
	 */
	public void iv_ship_flg(boolean value) {
		iv().iv_ship_flg(value);
	}

	/**
	 * Invoice issued flg. インボイス発行済ＦＬＧ.<p>
	 *
	 */
	public boolean iv_prnt_flg() {
		return iv().iv_prnt_flg();
	}

	/**
	 * Invoice issued flg. インボイス発行済ＦＬＧ.<p>
	 *
	 */
	public void iv_prnt_flg(boolean value) {
		iv().iv_prnt_flg(value);
	}

	/**
	 * Packing list issued flg. パッキングリスト発行済ＦＬＧ.<p>
	 *
	 */
	public boolean pl_prnt_flg() {
		return iv().pl_prnt_flg();
	}

	/**
	 * Packing list issued flg. パッキングリスト発行済ＦＬＧ.<p>
	 *
	 */
	public void pl_prnt_flg(boolean value) {
		iv().pl_prnt_flg(value);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return iv().rcpt_iv_mng_no();
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		iv().rcpt_iv_mng_no(value);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return iv().rcpt_iv_no();
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		iv().rcpt_iv_no(value);
	}

	/**
	 * Purchase invoice temporary entry flg. 受領インボイス仮登録ＦＬＧ.<p>
	 *
	 */
	public boolean pre_rcpt_iv_flg() {
		return iv().pre_rcpt_iv_flg();
	}

	/**
	 * Purchase invoice temporary entry flg. 受領インボイス仮登録ＦＬＧ.<p>
	 *
	 */
	public void pre_rcpt_iv_flg(boolean value) {
		iv().pre_rcpt_iv_flg(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return iv().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		iv().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return iv().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		iv().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return iv().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		iv().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return iv().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		iv().sub_char3(value);
	}

}

