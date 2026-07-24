package mcframe.serverMSBC.MSBCL0170;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MSBCL_SimIoTrnsSrch"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCL_SimIoTrnsSrch_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBCL0170";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBCL_SimIoTrnsSrch.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBCL0170_Srch01_INFO;
		this.aSrch01 = ((MSBCL_SimIoTrnsSrch)this).new Srch01();
	}

	public static MSBCL_SimIoTrnsSrch.Srch01 crtSrch01() {
		MSBCL_SimIoTrnsSrch lgc = new MSBCL_SimIoTrnsSrch();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addDownBlock(aSrch01.down0());
		p.addDownBlock(aSrch01.down1());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0170.CndR createCndR(){
		return mcframe.serverMSBC.MSBCL0170.CndR.create();
	}

	/**
	 * RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBC.MSBCL0170.RsltR createRsltR(){
		return mcframe.serverMSBC.MSBCL0170.RsltR.create();
	}

	/**
	 * RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> createRsltL(){
		return MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);
	}
	protected MSBCL_SimIoTrnsSrch.Srch02 aSrch02;

	protected void initSrch02() {
		this.info = PDef.MS_MSBCL0170_Srch02_INFO;
		this.aSrch02 = ((MSBCL_SimIoTrnsSrch)this).new Srch02();
	}

	public static MSBCL_SimIoTrnsSrch.Srch02 crtSrch02() {
		MSBCL_SimIoTrnsSrch lgc = new MSBCL_SimIoTrnsSrch();
		lgc.initSrch02();
		return lgc.aSrch02;
	}

	protected void paramSrch02(MCParam p) {
		if (this.aSrch02 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch02.up0());
		p.addDownBlock(aSrch02.down0());
		p.addDownBlock(aSrch02.down1());
	}

	protected void doSrch02() {
		aSrch02.call();
	};
	protected MSBCL_SimIoTrnsSrch.Srch03 aSrch03;

	protected void initSrch03() {
		this.info = PDef.MS_MSBCL0170_Srch03_INFO;
		this.aSrch03 = ((MSBCL_SimIoTrnsSrch)this).new Srch03();
	}

	public static MSBCL_SimIoTrnsSrch.Srch03 crtSrch03() {
		MSBCL_SimIoTrnsSrch lgc = new MSBCL_SimIoTrnsSrch();
		lgc.initSrch03();
		return lgc.aSrch03;
	}

	protected void paramSrch03(MCParam p) {
		if (this.aSrch03 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch03.up0());
		p.addDownBlock(aSrch03.down0());
		p.addDownBlock(aSrch03.down1());
	}

	protected void doSrch03() {
		aSrch03.call();
	};

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * シミュレーションオーダを加味した在庫推移を在庫発生基準の観点で照会をする<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0170.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0170.CndR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0170.RsltR> down1;
		
		/**
		 * 連携情報 IT<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch04 （{@link #so01}）<br>
		 */
		public final String IT = "IT";

		/**
		 * 連携オペレーション so01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch04}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL5060.CndR （{@link #so01_up0}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL5060.CndR （{@link #so01_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5060.RsltR&gt; （{@link #so01_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch04 so01;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL5060.CndR so01_up0;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL5060.CndR so01_down0;
		public final MCList<mcframe.serverMSBE.MSBEL5060.RsltR> so01_down1;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0170.CndR.create();
			down0 = mcframe.serverMSBC.MSBCL0170.CndR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);

			// 連携オペレーションの初期化
			so01 = mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.crtInvTrans_Srch04();
			
			// 連携オペレーションのコンテナ取得
			so01_up0 = (mcframe.serverMSBE.MSBEL5060.CndR)so01.up(0);
			so01_down0 = (mcframe.serverMSBE.MSBEL5060.CndR)so01.down(0);
			so01_down1 = (MCList<mcframe.serverMSBE.MSBEL5060.RsltR>)so01.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(IT, so01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * IT<br>
		 * up0() => mcframe.serverMSBE.MSBEL5060.CndR （{@link #so01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(IT)) {
				up_IT(so01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * IT<br>
		 * mcframe.serverMSBE.MSBEL5060.CndR（{@link #so01_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5060.RsltR&gt;（{@link #so01_down1}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(IT)) {
				down_IT(down0(), down1(), so01_down0, so01_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_SimIoTrnsSrch)MSBCL_SimIoTrnsSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR createCndR(){
			return mcframe.serverMSBC.MSBCL0170.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0170.RsltR createRsltR(){
			return mcframe.serverMSBC.MSBCL0170.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gr_prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_opn_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ordsav_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_fix_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_schd_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ord_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_opn_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ordsav_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_fix_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_schd_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ord_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_act_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>missing_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_to</td></tr>
		 * 	<tr><td><br></td><td>tgt_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sum_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0170.CndR
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0170.CndR
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_act_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_amt</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_SimIoTrnsSrch)MSBCL_SimIoTrnsSrch_MC_A.this).info;
		}

		//-----------------------IT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループITの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_IT(mcframe.serverMSBE.MSBEL5060.CndR dest0_0, mcframe.serverMSBC.MSBCL0170.CndR src_Cnd){
			up_IT_so01_0(dest0_0, src_Cnd);
		}
		
		/**
		 * 連携処理IT_so01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_IT_so01_0() {
			MCRowMapper map = new Map_up_IT_so01_0();
			return map;
		}

		/**
		 * 連携処理IT_so01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_IT_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("gr_prcd_flg", "gr_prcd_flg");
				addColumnPathMap("gr_sts_opn_grp_flg", "gr_sts_opn_grp_flg");
				addColumnPathMap("gr_sts_ordsav_grp_flg", "gr_sts_ordsav_grp_flg");
				addColumnPathMap("gr_sts_fix_grp_flg", "gr_sts_fix_grp_flg");
				addColumnPathMap("gr_sts_schd_grp_flg", "gr_sts_schd_grp_flg");
				addColumnPathMap("gr_sts_ord_grp_flg", "gr_sts_ord_grp_flg");
				addColumnPathMap("gr_act_flg", "gr_act_flg");
				addColumnPathMap("gi_prcd_flg", "gi_prcd_flg");
				addColumnPathMap("gi_sts_opn_grp_flg", "gi_sts_opn_grp_flg");
				addColumnPathMap("gi_sts_ordsav_grp_flg", "gi_sts_ordsav_grp_flg");
				addColumnPathMap("gi_sts_fix_grp_flg", "gi_sts_fix_grp_flg");
				addColumnPathMap("gi_sts_schd_grp_flg", "gi_sts_schd_grp_flg");
				addColumnPathMap("gi_sts_ord_grp_flg", "gi_sts_ord_grp_flg");
				addColumnPathMap("gi_act_flg", "gi_act_flg");
				addColumnPathMap("dt_fr", "dt_fr");
				addColumnPathMap("dt_to", "dt_to");
				addColumnPathMap("missing_flg", "missing_flg");
				addColumnPathMap("sim_mrp_no", "sim_mrp_no");
				addColumnPathMap("sim_flg", "sim_flg");
				addColumnPathMap("purc_dt_fr", "purc_dt_fr");
				addColumnPathMap("purc_dt_to", "purc_dt_to");
				addColumnPathMap("tgt_ver_flg", "tgt_ver_flg");
				addColumnPathMap("non_ver_flg", "non_ver_flg");
				addColumnPathMap("non_cmpl_ver_flg", "non_cmpl_ver_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("master_dt", "master_dt");
				addColumnPathMap("alloc_gi_flg", "alloc_gi_flg");
				addColumnPathMap("itm_grp_flg1", "itm_grp_flg1");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_flg2", "itm_grp_flg2");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_flg3", "itm_grp_flg3");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_flg4", "itm_grp_flg4");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_flg5", "itm_grp_flg5");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_flg6", "itm_grp_flg6");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_flg7", "itm_grp_flg7");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_flg8", "itm_grp_flg8");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_flg9", "itm_grp_flg9");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_flg10", "itm_grp_flg10");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
				addColumnPathMap("sum_unit_typ", "sum_unit_typ");
				addColumnPathMap("sno1_flg", "sno1_flg");
				addColumnPathMap("sno2_flg", "sno2_flg");
				addColumnPathMap("sno3_flg", "sno3_flg");
				addColumnPathMap("sno4_flg", "sno4_flg");
				addColumnPathMap("dtl_flg", "dtl_flg");
				addColumnPathMap("srch_flg", "srch_flg");
				addColumnPathMap("amt_flg", "amt_flg");
			}
		}

		/**
		 * 連携処理IT_so01の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_IT_so01_0(mcframe.serverMSBE.MSBEL5060.CndR dest, mcframe.serverMSBC.MSBCL0170.CndR src) {
			createMap_up_IT_so01_0().copy(dest, src);
		}

		//-----------------------IT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループITの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_IT(mcframe.serverMSBC.MSBCL0170.CndR dest_Cnd, MCList<mcframe.serverMSBC.MSBCL0170.RsltR> dest_Rslt, mcframe.serverMSBE.MSBEL5060.CndR src0_0, MCList<mcframe.serverMSBE.MSBEL5060.RsltR> src0_1){
			down_IT_so01_0(dest_Cnd, src0_0);
			down_IT_so01_1(dest_Rslt, src0_1);
		}

		/**
		 * 連携処理IT_so01の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_IT_so01_0() {
			MCRowMapper map = new Map_down_IT_so01_0();
			return map;
		}

		/**
		 * 連携処理IT_so01の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_IT_so01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_dt", "ac_dt");
			}
		}

		/**
		 * 連携処理IT_so01の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_IT_so01_0(mcframe.serverMSBC.MSBCL0170.CndR r_dest, mcframe.serverMSBE.MSBEL5060.CndR r_src) {
			createMap_down_IT_so01_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理IT_so01の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_IT_so01_1() {
			MCRowMapper map = new Map_down_IT_so01_1();
			return map;
		}

		/**
		 * 連携処理IT_so01の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_IT_so01_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("dt", "dt");
				addColumnPathMap("gr_schd_qty", "gr_schd_qty");
				addColumnPathMap("gi_schd_qty", "gi_schd_qty");
				addColumnPathMap("gr_act_qty", "gr_act_qty");
				addColumnPathMap("gi_act_qty", "gi_act_qty");
				addColumnPathMap("stk_qty", "stk_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("stk_amt", "stk_amt");
				addColumnPathMap("sim_flg", "sim_flg");
			}
		}

		/**
		 * 連携処理IT_so01の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_IT_so01_1(mcframe.serverMSBC.MSBCL0170.RsltR r_dest, mcframe.serverMSBE.MSBEL5060.RsltR r_src) {
		}

		/**
		 * 連携処理IT_so01の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_IT_so01_1(MCList<mcframe.serverMSBC.MSBCL0170.RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5060.RsltR> src) {
			MCRowMapper _rm = createMap_down_IT_so01_1();
			for(mcframe.serverMSBE.MSBEL5060.RsltR r_src : src){
				mcframe.serverMSBC.MSBCL0170.RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_IT_so01_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch02オペレーション.<p>
	 *
	 * シミュレーションオーダを加味した在庫推移を資産発生基準の観点で照会をする<br>
	 */
	abstract public class Srch02 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch02";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0170.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0170.CndR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0170.RsltR> down1;
		
		/**
		 * 連携情報 IT<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch05 （{@link #so02}）<br>
		 */
		public final String IT = "IT";

		/**
		 * 連携オペレーション so02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch05}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL5060.CndR （{@link #so02_up0}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL5060.CndR （{@link #so02_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5060.RsltR&gt; （{@link #so02_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch05 so02;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL5060.CndR so02_up0;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL5060.CndR so02_down0;
		public final MCList<mcframe.serverMSBE.MSBEL5060.RsltR> so02_down1;
		
		// コンストラクタ
		protected Srch02() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0170.CndR.create();
			down0 = mcframe.serverMSBC.MSBCL0170.CndR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);

			// 連携オペレーションの初期化
			so02 = mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.crtInvTrans_Srch05();
			
			// 連携オペレーションのコンテナ取得
			so02_up0 = (mcframe.serverMSBE.MSBEL5060.CndR)so02.up(0);
			so02_down0 = (mcframe.serverMSBE.MSBEL5060.CndR)so02.down(0);
			so02_down1 = (MCList<mcframe.serverMSBE.MSBEL5060.RsltR>)so02.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(IT, so02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * IT<br>
		 * up0() => mcframe.serverMSBE.MSBEL5060.CndR （{@link #so02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(IT)) {
				up_IT(so02_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * IT<br>
		 * mcframe.serverMSBE.MSBEL5060.CndR（{@link #so02_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5060.RsltR&gt;（{@link #so02_down1}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(IT)) {
				down_IT(down0(), down1(), so02_down0, so02_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_SimIoTrnsSrch)MSBCL_SimIoTrnsSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR createCndR(){
			return mcframe.serverMSBC.MSBCL0170.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0170.RsltR createRsltR(){
			return mcframe.serverMSBC.MSBCL0170.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gr_prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_opn_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ordsav_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_fix_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_schd_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ord_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_opn_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ordsav_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_fix_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_schd_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ord_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_act_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>missing_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_to</td></tr>
		 * 	<tr><td><br></td><td>tgt_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sum_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0170.CndR
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0170.CndR
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_act_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_amt</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_SimIoTrnsSrch)MSBCL_SimIoTrnsSrch_MC_A.this).info;
		}

		//-----------------------IT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループITの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_IT(mcframe.serverMSBE.MSBEL5060.CndR dest0_0, mcframe.serverMSBC.MSBCL0170.CndR src_Cnd){
			up_IT_so02_0(dest0_0, src_Cnd);
		}
		
		/**
		 * 連携処理IT_so02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_IT_so02_0() {
			MCRowMapper map = new Map_up_IT_so02_0();
			return map;
		}

		/**
		 * 連携処理IT_so02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_IT_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("gr_prcd_flg", "gr_prcd_flg");
				addColumnPathMap("gr_sts_opn_grp_flg", "gr_sts_opn_grp_flg");
				addColumnPathMap("gr_sts_ordsav_grp_flg", "gr_sts_ordsav_grp_flg");
				addColumnPathMap("gr_sts_fix_grp_flg", "gr_sts_fix_grp_flg");
				addColumnPathMap("gr_sts_schd_grp_flg", "gr_sts_schd_grp_flg");
				addColumnPathMap("gr_sts_ord_grp_flg", "gr_sts_ord_grp_flg");
				addColumnPathMap("gr_act_flg", "gr_act_flg");
				addColumnPathMap("gi_prcd_flg", "gi_prcd_flg");
				addColumnPathMap("gi_sts_opn_grp_flg", "gi_sts_opn_grp_flg");
				addColumnPathMap("gi_sts_ordsav_grp_flg", "gi_sts_ordsav_grp_flg");
				addColumnPathMap("gi_sts_fix_grp_flg", "gi_sts_fix_grp_flg");
				addColumnPathMap("gi_sts_schd_grp_flg", "gi_sts_schd_grp_flg");
				addColumnPathMap("gi_sts_ord_grp_flg", "gi_sts_ord_grp_flg");
				addColumnPathMap("gi_act_flg", "gi_act_flg");
				addColumnPathMap("dt_fr", "dt_fr");
				addColumnPathMap("dt_to", "dt_to");
				addColumnPathMap("missing_flg", "missing_flg");
				addColumnPathMap("sim_mrp_no", "sim_mrp_no");
				addColumnPathMap("sim_flg", "sim_flg");
				addColumnPathMap("purc_dt_fr", "purc_dt_fr");
				addColumnPathMap("purc_dt_to", "purc_dt_to");
				addColumnPathMap("tgt_ver_flg", "tgt_ver_flg");
				addColumnPathMap("non_ver_flg", "non_ver_flg");
				addColumnPathMap("non_cmpl_ver_flg", "non_cmpl_ver_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("master_dt", "master_dt");
				addColumnPathMap("alloc_gi_flg", "alloc_gi_flg");
				addColumnPathMap("itm_grp_flg1", "itm_grp_flg1");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_flg2", "itm_grp_flg2");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_flg3", "itm_grp_flg3");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_flg4", "itm_grp_flg4");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_flg5", "itm_grp_flg5");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_flg6", "itm_grp_flg6");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_flg7", "itm_grp_flg7");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_flg8", "itm_grp_flg8");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_flg9", "itm_grp_flg9");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_flg10", "itm_grp_flg10");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
				addColumnPathMap("sum_unit_typ", "sum_unit_typ");
				addColumnPathMap("sno1_flg", "sno1_flg");
				addColumnPathMap("sno2_flg", "sno2_flg");
				addColumnPathMap("sno3_flg", "sno3_flg");
				addColumnPathMap("sno4_flg", "sno4_flg");
				addColumnPathMap("dtl_flg", "dtl_flg");
				addColumnPathMap("srch_flg", "srch_flg");
				addColumnPathMap("amt_flg", "amt_flg");
			}
		}

		/**
		 * 連携処理IT_so02の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_IT_so02_0(mcframe.serverMSBE.MSBEL5060.CndR dest, mcframe.serverMSBC.MSBCL0170.CndR src) {
			createMap_up_IT_so02_0().copy(dest, src);
		}

		//-----------------------IT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループITの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_IT(mcframe.serverMSBC.MSBCL0170.CndR dest_Cnd, MCList<mcframe.serverMSBC.MSBCL0170.RsltR> dest_Rslt, mcframe.serverMSBE.MSBEL5060.CndR src0_0, MCList<mcframe.serverMSBE.MSBEL5060.RsltR> src0_1){
			down_IT_so02_0(dest_Cnd, src0_0);
			down_IT_so02_1(dest_Rslt, src0_1);
		}

		/**
		 * 連携処理IT_so02の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_IT_so02_0() {
			MCRowMapper map = new Map_down_IT_so02_0();
			return map;
		}

		/**
		 * 連携処理IT_so02の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_IT_so02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_dt", "ac_dt");
			}
		}

		/**
		 * 連携処理IT_so02の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_IT_so02_0(mcframe.serverMSBC.MSBCL0170.CndR r_dest, mcframe.serverMSBE.MSBEL5060.CndR r_src) {
			createMap_down_IT_so02_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理IT_so02の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_IT_so02_1() {
			MCRowMapper map = new Map_down_IT_so02_1();
			return map;
		}

		/**
		 * 連携処理IT_so02の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_IT_so02_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("dt", "dt");
				addColumnPathMap("gr_schd_qty", "gr_schd_qty");
				addColumnPathMap("gi_schd_qty", "gi_schd_qty");
				addColumnPathMap("gr_act_qty", "gr_act_qty");
				addColumnPathMap("gi_act_qty", "gi_act_qty");
				addColumnPathMap("stk_qty", "stk_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("stk_amt", "stk_amt");
				addColumnPathMap("sim_flg", "sim_flg");
			}
		}

		/**
		 * 連携処理IT_so02の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_IT_so02_1(mcframe.serverMSBC.MSBCL0170.RsltR r_dest, mcframe.serverMSBE.MSBEL5060.RsltR r_src) {
		}

		/**
		 * 連携処理IT_so02の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_IT_so02_1(MCList<mcframe.serverMSBC.MSBCL0170.RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5060.RsltR> src) {
			MCRowMapper _rm = createMap_down_IT_so02_1();
			for(mcframe.serverMSBE.MSBEL5060.RsltR r_src : src){
				mcframe.serverMSBC.MSBCL0170.RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_IT_so02_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Srch03オペレーション.<p>
	 *
	 * シミュレーションオーダを加味した在庫推移を使用可能日基準の観点で照会をする<br>
	 */
	abstract public class Srch03 extends mcframe.serverMAUD.MAUDL5010.MAUDL_Searcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Srch03";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0170.CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMSBC.MSBCL0170.CndR down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBC.MSBCL0170.RsltR> down1;
		
		/**
		 * 連携情報 IT<p>
		 *
		 * 連携先 mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch06 （{@link #so03}）<br>
		 */
		public final String IT = "IT";

		/**
		 * 連携オペレーション so03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch06}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBE.MSBEL5060.CndR （{@link #so03_up0}）<br>
		 * 第1 下りブロッククラス mcframe.serverMSBE.MSBEL5060.CndR （{@link #so03_down0}）<br>
		 * 第2 下りブロッククラス MCList&lt;mcframe.serverMSBE.MSBEL5060.RsltR&gt; （{@link #so03_down1}）<br>
		 */
		public final mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.InvTrans_Srch06 so03;
		// 連携ロジック上り
		public final mcframe.serverMSBE.MSBEL5060.CndR so03_up0;
		// 連携ロジック下り
		public final mcframe.serverMSBE.MSBEL5060.CndR so03_down0;
		public final MCList<mcframe.serverMSBE.MSBEL5060.RsltR> so03_down1;
		
		// コンストラクタ
		protected Srch03() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBC.MSBCL0170.CndR.create();
			down0 = mcframe.serverMSBC.MSBCL0170.CndR.create();
			down1 = MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);

			// 連携オペレーションの初期化
			so03 = mcframe.serverMSBE.MSBEL5060.MSBEL_InvTransService.crtInvTrans_Srch06();
			
			// 連携オペレーションのコンテナ取得
			so03_up0 = (mcframe.serverMSBE.MSBEL5060.CndR)so03.up(0);
			so03_down0 = (mcframe.serverMSBE.MSBEL5060.CndR)so03.down(0);
			so03_down1 = (MCList<mcframe.serverMSBE.MSBEL5060.RsltR>)so03.down(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(IT, so03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * IT<br>
		 * up0() => mcframe.serverMSBE.MSBEL5060.CndR （{@link #so03_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(IT)) {
				up_IT(so03_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * IT<br>
		 * mcframe.serverMSBE.MSBEL5060.CndR（{@link #so03_down0}）=> down0()<br>
		 * MCList&lt;mcframe.serverMSBE.MSBEL5060.RsltR&gt;（{@link #so03_down1}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(IT)) {
				down_IT(down0(), down1(), so03_down0, so03_down1);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBCL_SimIoTrnsSrch)MSBCL_SimIoTrnsSrch_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR createCndR(){
			return mcframe.serverMSBC.MSBCL0170.CndR.create();
		}

		/**
		 * RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBC.MSBCL0170.RsltR createRsltR(){
			return mcframe.serverMSBC.MSBCL0170.RsltR.create();
		}

		/**
		 * RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> createRsltL(){
			return MCList.create(mcframe.serverMSBC.MSBCL0170.RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>gr_prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_opn_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ordsav_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_fix_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_schd_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_sts_ord_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gr_act_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_prcd_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_opn_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ordsav_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_fix_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_schd_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_sts_ord_grp_flg</td></tr>
		 * 	<tr><td><br></td><td>gi_act_flg</td></tr>
		 * 	<tr><td><br></td><td>dt_fr</td></tr>
		 * 	<tr><td><br></td><td>dt_to</td></tr>
		 * 	<tr><td><br></td><td>missing_flg</td></tr>
		 * 	<tr><td><br></td><td>sim_mrp_no</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>purc_dt_to</td></tr>
		 * 	<tr><td><br></td><td>tgt_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>non_cmpl_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>quality_typ</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>master_dt</td></tr>
		 * 	<tr><td><br></td><td>alloc_gi_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sum_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>sno4_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0170.CndR
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMSBC.MSBCL0170.CndR
		 */
		public mcframe.serverMSBC.MSBCL0170.CndR down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>loc_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_nm</td></tr>
		 * 	<tr><td><br></td><td>site_cd</td></tr>
		 * 	<tr><td><br></td><td>site_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alloc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>loc_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>dt</td></tr>
		 * 	<tr><td><br></td><td>gr_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_schd_qty</td></tr>
		 * 	<tr><td><br></td><td>gr_act_qty</td></tr>
		 * 	<tr><td><br></td><td>gi_act_qty</td></tr>
		 * 	<tr><td><br></td><td>stk_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>stk_amt</td></tr>
		 * 	<tr><td><br></td><td>sim_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBC.MSBCL0170.RsltR> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBCL_SimIoTrnsSrch)MSBCL_SimIoTrnsSrch_MC_A.this).info;
		}

		//-----------------------IT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループITの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_IT(mcframe.serverMSBE.MSBEL5060.CndR dest0_0, mcframe.serverMSBC.MSBCL0170.CndR src_Cnd){
			up_IT_so03_0(dest0_0, src_Cnd);
		}
		
		/**
		 * 連携処理IT_so03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_IT_so03_0() {
			MCRowMapper map = new Map_up_IT_so03_0();
			return map;
		}

		/**
		 * 連携処理IT_so03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_IT_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("gr_prcd_flg", "gr_prcd_flg");
				addColumnPathMap("gr_sts_opn_grp_flg", "gr_sts_opn_grp_flg");
				addColumnPathMap("gr_sts_ordsav_grp_flg", "gr_sts_ordsav_grp_flg");
				addColumnPathMap("gr_sts_fix_grp_flg", "gr_sts_fix_grp_flg");
				addColumnPathMap("gr_sts_schd_grp_flg", "gr_sts_schd_grp_flg");
				addColumnPathMap("gr_sts_ord_grp_flg", "gr_sts_ord_grp_flg");
				addColumnPathMap("gr_act_flg", "gr_act_flg");
				addColumnPathMap("gi_prcd_flg", "gi_prcd_flg");
				addColumnPathMap("gi_sts_opn_grp_flg", "gi_sts_opn_grp_flg");
				addColumnPathMap("gi_sts_ordsav_grp_flg", "gi_sts_ordsav_grp_flg");
				addColumnPathMap("gi_sts_fix_grp_flg", "gi_sts_fix_grp_flg");
				addColumnPathMap("gi_sts_schd_grp_flg", "gi_sts_schd_grp_flg");
				addColumnPathMap("gi_sts_ord_grp_flg", "gi_sts_ord_grp_flg");
				addColumnPathMap("gi_act_flg", "gi_act_flg");
				addColumnPathMap("dt_fr", "dt_fr");
				addColumnPathMap("dt_to", "dt_to");
				addColumnPathMap("missing_flg", "missing_flg");
				addColumnPathMap("sim_mrp_no", "sim_mrp_no");
				addColumnPathMap("sim_flg", "sim_flg");
				addColumnPathMap("purc_dt_fr", "purc_dt_fr");
				addColumnPathMap("purc_dt_to", "purc_dt_to");
				addColumnPathMap("tgt_ver_flg", "tgt_ver_flg");
				addColumnPathMap("non_ver_flg", "non_ver_flg");
				addColumnPathMap("non_cmpl_ver_flg", "non_cmpl_ver_flg");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("quality_typ", "quality_typ");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("master_dt", "master_dt");
				addColumnPathMap("alloc_gi_flg", "alloc_gi_flg");
				addColumnPathMap("itm_grp_flg1", "itm_grp_flg1");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_flg2", "itm_grp_flg2");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_flg3", "itm_grp_flg3");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_flg4", "itm_grp_flg4");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_flg5", "itm_grp_flg5");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_flg6", "itm_grp_flg6");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_flg7", "itm_grp_flg7");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_flg8", "itm_grp_flg8");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_flg9", "itm_grp_flg9");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_flg10", "itm_grp_flg10");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
				addColumnPathMap("sum_unit_typ", "sum_unit_typ");
				addColumnPathMap("sno1_flg", "sno1_flg");
				addColumnPathMap("sno2_flg", "sno2_flg");
				addColumnPathMap("sno3_flg", "sno3_flg");
				addColumnPathMap("sno4_flg", "sno4_flg");
				addColumnPathMap("dtl_flg", "dtl_flg");
				addColumnPathMap("srch_flg", "srch_flg");
				addColumnPathMap("amt_flg", "amt_flg");
			}
		}

		/**
		 * 連携処理IT_so03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_IT_so03_0(mcframe.serverMSBE.MSBEL5060.CndR dest, mcframe.serverMSBC.MSBCL0170.CndR src) {
			createMap_up_IT_so03_0().copy(dest, src);
		}

		//-----------------------IT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループITの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_IT(mcframe.serverMSBC.MSBCL0170.CndR dest_Cnd, MCList<mcframe.serverMSBC.MSBCL0170.RsltR> dest_Rslt, mcframe.serverMSBE.MSBEL5060.CndR src0_0, MCList<mcframe.serverMSBE.MSBEL5060.RsltR> src0_1){
			down_IT_so03_0(dest_Cnd, src0_0);
			down_IT_so03_1(dest_Rslt, src0_1);
		}

		/**
		 * 連携処理IT_so03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_IT_so03_0() {
			MCRowMapper map = new Map_down_IT_so03_0();
			return map;
		}

		/**
		 * 連携処理IT_so03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_IT_so03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ac_dt", "ac_dt");
			}
		}

		/**
		 * 連携処理IT_so03の下りブロック0のRowをコピーする。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_IT_so03_0(mcframe.serverMSBC.MSBCL0170.CndR r_dest, mcframe.serverMSBE.MSBEL5060.CndR r_src) {
			createMap_down_IT_so03_0().copy(r_dest, r_src);
		}

		/**
		 * 連携処理IT_so03の下りブロック1のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_IT_so03_1() {
			MCRowMapper map = new Map_down_IT_so03_1();
			return map;
		}

		/**
		 * 連携処理IT_so03の下りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_down_IT_so03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("loc_cd", "loc_cd");
				addColumnPathMap("loc_nm", "loc_nm");
				addColumnPathMap("site_cd", "site_cd");
				addColumnPathMap("site_nm", "site_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("alloc_grp_cd", "alloc_grp_cd");
				addColumnPathMap("alloc_grp_nm", "alloc_grp_nm");
				addColumnPathMap("loc_grp_cd", "loc_grp_cd");
				addColumnPathMap("loc_grp_nm", "loc_grp_nm");
				addColumnPathMap("dt", "dt");
				addColumnPathMap("gr_schd_qty", "gr_schd_qty");
				addColumnPathMap("gi_schd_qty", "gi_schd_qty");
				addColumnPathMap("gr_act_qty", "gr_act_qty");
				addColumnPathMap("gi_act_qty", "gi_act_qty");
				addColumnPathMap("stk_qty", "stk_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("stk_amt", "stk_amt");
				addColumnPathMap("sim_flg", "sim_flg");
			}
		}

		/**
		 * 連携処理IT_so03の下りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_IT_so03_1(mcframe.serverMSBC.MSBCL0170.RsltR r_dest, mcframe.serverMSBE.MSBEL5060.RsltR r_src) {
		}

		/**
		 * 連携処理IT_so03の下りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_IT_so03_1(MCList<mcframe.serverMSBC.MSBCL0170.RsltR> dest, MCList<mcframe.serverMSBE.MSBEL5060.RsltR> src) {
			MCRowMapper _rm = createMap_down_IT_so03_1();
			for(mcframe.serverMSBE.MSBEL5060.RsltR r_src : src){
				mcframe.serverMSBC.MSBCL0170.RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_IT_so03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}