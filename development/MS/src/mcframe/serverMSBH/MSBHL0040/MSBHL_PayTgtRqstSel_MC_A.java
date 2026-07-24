package mcframe.serverMSBH.MSBHL0040;

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
 * "MSBHL_PayTgtRqstSel"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBHL_PayTgtRqstSel_MC_A extends mcframe.serverMSUD.MSUDL5010.MSUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MSBH";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MSBHL0040";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MSBHL_PayTgtRqstSel.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MS_MSBHL0040_Srch01_INFO;
		this.aSrch01 = ((MSBHL_PayTgtRqstSel)this).new Srch01();
	}

	public static MSBHL_PayTgtRqstSel.Srch01 crtSrch01() {
		MSBHL_PayTgtRqstSel lgc = new MSBHL_PayTgtRqstSel();
		lgc.initSrch01();
		return lgc.aSrch01;
	}

	protected void paramSrch01(MCParam p) {
		if (this.aSrch01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSrch01.up0());
		p.addUpBlock(aSrch01.up1());
		p.addDownBlock(aSrch01.down0());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0040.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMSBH.MSBHL0040.Srch01_CndR.create();
	}

	/**
	 * Srch01_RqstNoCndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR createSrch01_RqstNoCndR(){
		return mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR.create();
	}

	/**
	 * Srch01_RqstNoCndブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR> createSrch01_RqstNoCndL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR.class);
	}

	/**
	 * Srch01_RsltブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMSBH.MSBHL0040.Srch01_RsltR createSrch01_RsltR(){
		return mcframe.serverMSBH.MSBHL0040.Srch01_RsltR.create();
	}

	/**
	 * Srch01_RsltブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RsltR> createSrch01_RsltL(){
		return MCList.create(mcframe.serverMSBH.MSBHL0040.Srch01_RsltR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Srch01オペレーション.<p>
	 *
	 * 支払対象の買掛明細を検索する。<br>
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
		private final mcframe.serverMSBH.MSBHL0040.Srch01_CndR up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR> up1;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RsltR> down0;
		
		/**
		 * 連携情報 MSBHL5030<p>
		 *
		 * 連携先 mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03 （{@link #Srch03}）<br>
		 */
		public final String MSBHL5030 = "MSBHL5030";

		/**
		 * 連携オペレーション Srch03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03}<br>
		 * 第1 上りブロッククラス mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR （{@link #Srch03_up0}）<br>
		 * 第2 上りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR&gt; （{@link #Srch03_up1}）<br>
		 * 第1 下りブロッククラス MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR&gt; （{@link #Srch03_down0}）<br>
		 */
		public final mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.PaySchd_Srch03 Srch03;
		// 連携ロジック上り
		public final mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR Srch03_up0;
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> Srch03_up1;
		// 連携ロジック下り
		public final MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> Srch03_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMSBH.MSBHL0040.Srch01_CndR.create();
			up1 = MCList.create(mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR.class);
			down0 = MCList.create(mcframe.serverMSBH.MSBHL0040.Srch01_RsltR.class);

			// 連携オペレーションの初期化
			Srch03 = mcframe.serverMSBH.MSBHL5030.MSBHL_PaySchdRegService.crtPaySchd_Srch03();
			
			// 連携オペレーションのコンテナ取得
			Srch03_up0 = (mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR)Srch03.up(0);
			Srch03_up1 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR>)Srch03.up(1);
			Srch03_down0 = (MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR>)Srch03.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(MSBHL5030, Srch03);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * MSBHL5030<br>
		 * up0() => mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR （{@link #Srch03_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR&gt; （{@link #Srch03_up1}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(MSBHL5030)) {
				up_MSBHL5030(Srch03_up0, Srch03_up1, up0(), up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * MSBHL5030<br>
		 * MCList&lt;mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR&gt;（{@link #Srch03_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(MSBHL5030)) {
				down_MSBHL5030(down0(), Srch03_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MSBHL_PayTgtRqstSel)MSBHL_PayTgtRqstSel_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0040.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMSBH.MSBHL0040.Srch01_CndR.create();
		}

		/**
		 * Srch01_RqstNoCndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR createSrch01_RqstNoCndR(){
			return mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR.create();
		}

		/**
		 * Srch01_RqstNoCndブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR> createSrch01_RqstNoCndL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR.class);
		}

		/**
		 * Srch01_RsltブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMSBH.MSBHL0040.Srch01_RsltR createSrch01_RsltR(){
			return mcframe.serverMSBH.MSBHL0040.Srch01_RsltR.create();
		}

		/**
		 * Srch01_RsltブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RsltR> createSrch01_RsltL(){
			return MCList.create(mcframe.serverMSBH.MSBHL0040.Srch01_RsltR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>upd_mode_flg</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt_to</td></tr>
		 * 	<tr><td><br></td><td>act_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>act_dt_to</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>ac_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>max_amt</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>inc_interim_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_flg10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
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
		 * </table>
		 *
		 * @see mcframe.serverMSBH.MSBHL0040.Srch01_CndR
		 */
		public mcframe.serverMSBH.MSBHL0040.Srch01_CndR up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR> up1() {
			return up1;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_interim_cl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_dt</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_typ</td></tr>
		 * 	<tr><td><br></td><td>ap_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>act_dt</td></tr>
		 * 	<tr><td><br></td><td>ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_basis_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_dt</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cl_day</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_sts_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_ptn_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>wrk_no</td></tr>
		 * 	<tr><td><br></td><td>wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>interim_flg</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>inc_tax_flg</td></tr>
		 * 	<tr><td><br></td><td>tax_cd</td></tr>
		 * 	<tr><td><br></td><td>tax_nm</td></tr>
		 * 	<tr><td><br></td><td>tax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_rate</td></tr>
		 * 	<tr><td><br></td><td>wtax_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>xrate</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_dscnt_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_inc_tax_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_cd</td></tr>
		 * 	<tr><td><br></td><td>base_cur_nm</td></tr>
		 * 	<tr><td><br></td><td>base_cur_upri_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_cur_amt_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>trd_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>base_unit_cd</td></tr>
		 * 	<tr><td><br></td><td>base_unit_nm</td></tr>
		 * 	<tr><td><br></td><td>base_unit_dec_place</td></tr>
		 * 	<tr><td><br></td><td>base_unit_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>base_unit_qty</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_mtd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>po_wrk_no</td></tr>
		 * 	<tr><td><br></td><td>po_wrk_nm</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_no</td></tr>
		 * 	<tr><td><br></td><td>bp_dlv_slip_d_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_no</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_mng_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>po_no</td></tr>
		 * 	<tr><td><br></td><td>po_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_no</td></tr>
		 * 	<tr><td><br></td><td>purc_act_d_seq</td></tr>
		 * 	<tr><td><br></td><td>purc_act_rev</td></tr>
		 * 	<tr><td><br></td><td>org_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>crryovr_src_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_pay_schd_no</td></tr>
		 * 	<tr><td><br></td><td>sw_src_rcv_bill_no</td></tr>
		 * 	<tr><td><br></td><td>base_purc_ac_dt</td></tr>
		 * 	<tr><td><br></td><td>pay_ntc_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>pay_schd_d_print_rmrks</td></tr>
		 * 	<tr><td><br></td><td>intr_rmrks</td></tr>
		 * 	<tr><td><br></td><td>sub_char1</td></tr>
		 * 	<tr><td><br></td><td>sub_char2</td></tr>
		 * 	<tr><td><br></td><td>sub_char3</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>trd_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_proc_amt</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_upri</td></tr>
		 * 	<tr><td><br></td><td>base_cur_onr_prov_amt</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_flg</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>asppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>sppl_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm1</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm2</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm3</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm4</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm5</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm6</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm7</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm8</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm9</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_cd10</td></tr>
		 * 	<tr><td><br></td><td>itm_grp_nm10</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>ap_d_upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>ref_ap_d_no</td></tr>
		 * 	<tr><td><br></td><td>amt_disp_pm</td></tr>
		 * 	<tr><td><br></td><td>row_num</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RsltR> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MSBHL_PayTgtRqstSel)MSBHL_PayTgtRqstSel_MC_A.this).info;
		}

		//-----------------------MSBHL5030専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMSBHL5030の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MSBHL5030(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR dest0_0, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> dest0_1, mcframe.serverMSBH.MSBHL0040.Srch01_CndR src_Srch01_Cnd, MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR> src_Srch01_RqstNoCnd){
			up_MSBHL5030_Srch03_0(dest0_0, src_Srch01_Cnd);
			up_MSBHL5030_Srch03_1(dest0_1, src_Srch01_RqstNoCnd);
		}
		
		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch03_0() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch03_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("upd_mode_flg", "upd_mode_flg");
				addColumnPathMap("pay_schd_dt_fr", "pay_schd_dt_fr");
				addColumnPathMap("pay_schd_dt_to", "pay_schd_dt_to");
				addColumnPathMap("bsppl_cl_dt_fr", "bsppl_cl_dt_fr");
				addColumnPathMap("bsppl_cl_dt_to", "bsppl_cl_dt_to");
				addColumnPathMap("act_dt_fr", "act_dt_fr");
				addColumnPathMap("act_dt_to", "act_dt_to");
				addColumnPathMap("ac_dt_fr", "ac_dt_fr");
				addColumnPathMap("ac_dt_to", "ac_dt_to");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sppl_nm", "sppl_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("trd_cur_nm", "trd_cur_nm");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("inc_interim_flg", "inc_interim_flg");
				addColumnPathMap("asppl_grp_flg1", "asppl_grp_flg1");
				addColumnPathMap("asppl_grp_cd1", "asppl_grp_cd1");
				addColumnPathMap("asppl_grp_nm1", "asppl_grp_nm1");
				addColumnPathMap("asppl_grp_flg2", "asppl_grp_flg2");
				addColumnPathMap("asppl_grp_cd2", "asppl_grp_cd2");
				addColumnPathMap("asppl_grp_nm2", "asppl_grp_nm2");
				addColumnPathMap("asppl_grp_flg3", "asppl_grp_flg3");
				addColumnPathMap("asppl_grp_cd3", "asppl_grp_cd3");
				addColumnPathMap("asppl_grp_nm3", "asppl_grp_nm3");
				addColumnPathMap("asppl_grp_flg4", "asppl_grp_flg4");
				addColumnPathMap("asppl_grp_cd4", "asppl_grp_cd4");
				addColumnPathMap("asppl_grp_nm4", "asppl_grp_nm4");
				addColumnPathMap("asppl_grp_flg5", "asppl_grp_flg5");
				addColumnPathMap("asppl_grp_cd5", "asppl_grp_cd5");
				addColumnPathMap("asppl_grp_nm5", "asppl_grp_nm5");
				addColumnPathMap("asppl_grp_flg6", "asppl_grp_flg6");
				addColumnPathMap("asppl_grp_cd6", "asppl_grp_cd6");
				addColumnPathMap("asppl_grp_nm6", "asppl_grp_nm6");
				addColumnPathMap("asppl_grp_flg7", "asppl_grp_flg7");
				addColumnPathMap("asppl_grp_cd7", "asppl_grp_cd7");
				addColumnPathMap("asppl_grp_nm7", "asppl_grp_nm7");
				addColumnPathMap("asppl_grp_flg8", "asppl_grp_flg8");
				addColumnPathMap("asppl_grp_cd8", "asppl_grp_cd8");
				addColumnPathMap("asppl_grp_nm8", "asppl_grp_nm8");
				addColumnPathMap("asppl_grp_flg9", "asppl_grp_flg9");
				addColumnPathMap("asppl_grp_cd9", "asppl_grp_cd9");
				addColumnPathMap("asppl_grp_nm9", "asppl_grp_nm9");
				addColumnPathMap("asppl_grp_flg10", "asppl_grp_flg10");
				addColumnPathMap("asppl_grp_cd10", "asppl_grp_cd10");
				addColumnPathMap("asppl_grp_nm10", "asppl_grp_nm10");
				addColumnPathMap("sppl_grp_flg1", "sppl_grp_flg1");
				addColumnPathMap("sppl_grp_cd1", "sppl_grp_cd1");
				addColumnPathMap("sppl_grp_nm1", "sppl_grp_nm1");
				addColumnPathMap("sppl_grp_flg2", "sppl_grp_flg2");
				addColumnPathMap("sppl_grp_cd2", "sppl_grp_cd2");
				addColumnPathMap("sppl_grp_nm2", "sppl_grp_nm2");
				addColumnPathMap("sppl_grp_flg3", "sppl_grp_flg3");
				addColumnPathMap("sppl_grp_cd3", "sppl_grp_cd3");
				addColumnPathMap("sppl_grp_nm3", "sppl_grp_nm3");
				addColumnPathMap("sppl_grp_flg4", "sppl_grp_flg4");
				addColumnPathMap("sppl_grp_cd4", "sppl_grp_cd4");
				addColumnPathMap("sppl_grp_nm4", "sppl_grp_nm4");
				addColumnPathMap("sppl_grp_flg5", "sppl_grp_flg5");
				addColumnPathMap("sppl_grp_cd5", "sppl_grp_cd5");
				addColumnPathMap("sppl_grp_nm5", "sppl_grp_nm5");
				addColumnPathMap("sppl_grp_flg6", "sppl_grp_flg6");
				addColumnPathMap("sppl_grp_cd6", "sppl_grp_cd6");
				addColumnPathMap("sppl_grp_nm6", "sppl_grp_nm6");
				addColumnPathMap("sppl_grp_flg7", "sppl_grp_flg7");
				addColumnPathMap("sppl_grp_cd7", "sppl_grp_cd7");
				addColumnPathMap("sppl_grp_nm7", "sppl_grp_nm7");
				addColumnPathMap("sppl_grp_flg8", "sppl_grp_flg8");
				addColumnPathMap("sppl_grp_cd8", "sppl_grp_cd8");
				addColumnPathMap("sppl_grp_nm8", "sppl_grp_nm8");
				addColumnPathMap("sppl_grp_flg9", "sppl_grp_flg9");
				addColumnPathMap("sppl_grp_cd9", "sppl_grp_cd9");
				addColumnPathMap("sppl_grp_nm9", "sppl_grp_nm9");
				addColumnPathMap("sppl_grp_flg10", "sppl_grp_flg10");
				addColumnPathMap("sppl_grp_cd10", "sppl_grp_cd10");
				addColumnPathMap("sppl_grp_nm10", "sppl_grp_nm10");
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
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch03_0(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_CndR dest, mcframe.serverMSBH.MSBHL0040.Srch01_CndR src) {
			createMap_up_MSBHL5030_Srch03_0().copy(dest, src);
		}
		
		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック1のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MSBHL5030_Srch03_1() {
			MCRowMapper map = new Map_up_MSBHL5030_Srch03_1();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック1のためのRowMapperクラス。<p>
		 */
		public class Map_up_MSBHL5030_Srch03_1 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("ap_d_no", "ap_d_no");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック1のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MSBHL5030_Srch03_1(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR r_dest, mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch03の上りブロック1のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MSBHL5030_Srch03_1(MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR> dest, MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR> src) {
			MCRowMapper _rm = createMap_up_MSBHL5030_Srch03_1();
			for(mcframe.serverMSBH.MSBHL0040.Srch01_RqstNoCndR r_src : src){
				mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RqstNoCndR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MSBHL5030_Srch03_1(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------MSBHL5030専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMSBHL5030の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MSBHL5030(MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RsltR> dest_Srch01_Rslt, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> src0_0){
			down_MSBHL5030_Srch03_0(dest_Srch01_Rslt, src0_0);
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_MSBHL5030_Srch03_0() {
			MCRowMapper map = new Map_down_MSBHL5030_Srch03_0();
			return map;
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_MSBHL5030_Srch03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("bsppl_nm", "bsppl_nm");
				addColumnPathMap("purc_interim_cl_flg", "purc_interim_cl_flg");
				addColumnPathMap("bsppl_dpt_cd", "bsppl_dpt_cd");
				addColumnPathMap("bsppl_dpt_nm", "bsppl_dpt_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("pay_schd_dt", "pay_schd_dt");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("sppl_nm", "sppl_nm");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("ap_typ", "ap_typ");
				addColumnPathMap("ap_typ_nm", "ap_typ_nm");
				addColumnPathMap("act_dt", "act_dt");
				addColumnPathMap("ac_dt", "ac_dt");
				addColumnPathMap("pay_basis_dt", "pay_basis_dt");
				addColumnPathMap("bsppl_cl_dt", "bsppl_cl_dt");
				addColumnPathMap("bsppl_cl_day", "bsppl_cl_day");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("slip_sts_typ", "slip_sts_typ");
				addColumnPathMap("slip_sts_typ_nm", "slip_sts_typ_nm");
				addColumnPathMap("trd_cd", "trd_cd");
				addColumnPathMap("trd_nm", "trd_nm");
				addColumnPathMap("trd_ptn_typ", "trd_ptn_typ");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_nm", "itm_typ_nm");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("wrk_no", "wrk_no");
				addColumnPathMap("wrk_nm", "wrk_nm");
				addColumnPathMap("trd_cur_upri", "trd_cur_upri");
				addColumnPathMap("interim_flg", "interim_flg");
				addColumnPathMap("trd_cur_amt", "trd_cur_amt");
				addColumnPathMap("trd_cur_tax_amt", "trd_cur_tax_amt");
				addColumnPathMap("trd_cur_dscnt_amt", "trd_cur_dscnt_amt");
				addColumnPathMap("trd_cur_inc_tax_amt", "trd_cur_inc_tax_amt");
				addColumnPathMap("inc_tax_flg", "inc_tax_flg");
				addColumnPathMap("tax_cd", "tax_cd");
				addColumnPathMap("tax_nm", "tax_nm");
				addColumnPathMap("tax_rate", "tax_rate");
				addColumnPathMap("wtax_rate", "wtax_rate");
				addColumnPathMap("wtax_amt", "wtax_amt");
				addColumnPathMap("trd_cur_cd", "trd_cur_cd");
				addColumnPathMap("trd_cur_nm", "trd_cur_nm");
				addColumnPathMap("trd_cur_upri_dec_place", "trd_cur_upri_dec_place");
				addColumnPathMap("trd_cur_amt_dec_place", "trd_cur_amt_dec_place");
				addColumnPathMap("xrate", "xrate");
				addColumnPathMap("base_cur_upri", "base_cur_upri");
				addColumnPathMap("base_cur_amt", "base_cur_amt");
				addColumnPathMap("base_cur_tax_amt", "base_cur_tax_amt");
				addColumnPathMap("base_cur_dscnt_amt", "base_cur_dscnt_amt");
				addColumnPathMap("base_cur_inc_tax_amt", "base_cur_inc_tax_amt");
				addColumnPathMap("base_cur_cd", "base_cur_cd");
				addColumnPathMap("base_cur_nm", "base_cur_nm");
				addColumnPathMap("base_cur_upri_dec_place", "base_cur_upri_dec_place");
				addColumnPathMap("base_cur_amt_dec_place", "base_cur_amt_dec_place");
				addColumnPathMap("trd_unit_cd", "trd_unit_cd");
				addColumnPathMap("trd_unit_nm", "trd_unit_nm");
				addColumnPathMap("trd_unit_dec_place", "trd_unit_dec_place");
				addColumnPathMap("trd_unit_rnd_typ", "trd_unit_rnd_typ");
				addColumnPathMap("trd_unit_qty", "trd_unit_qty");
				addColumnPathMap("base_unit_cd", "base_unit_cd");
				addColumnPathMap("base_unit_nm", "base_unit_nm");
				addColumnPathMap("base_unit_dec_place", "base_unit_dec_place");
				addColumnPathMap("base_unit_rnd_typ", "base_unit_rnd_typ");
				addColumnPathMap("base_unit_qty", "base_unit_qty");
				addColumnPathMap("pay_mtd_typ", "pay_mtd_typ");
				addColumnPathMap("pay_mtd_typ_nm", "pay_mtd_typ_nm");
				addColumnPathMap("po_wrk_no", "po_wrk_no");
				addColumnPathMap("po_wrk_nm", "po_wrk_nm");
				addColumnPathMap("bp_dlv_slip_no", "bp_dlv_slip_no");
				addColumnPathMap("bp_dlv_slip_d_no", "bp_dlv_slip_d_no");
				addColumnPathMap("rcpt_iv_no", "rcpt_iv_no");
				addColumnPathMap("rcpt_iv_mng_no", "rcpt_iv_mng_no");
				addColumnPathMap("crryovr_flg", "crryovr_flg");
				addColumnPathMap("sppl_itm_cd", "sppl_itm_cd");
				addColumnPathMap("sppl_itm_nm", "sppl_itm_nm");
				addColumnPathMap("ap_d_no", "ap_d_no");
				addColumnPathMap("po_no", "po_no");
				addColumnPathMap("po_d_no", "po_d_no");
				addColumnPathMap("purc_act_no", "purc_act_no");
				addColumnPathMap("purc_act_seq", "purc_act_seq");
				addColumnPathMap("purc_act_d_no", "purc_act_d_no");
				addColumnPathMap("purc_act_d_seq", "purc_act_d_seq");
				addColumnPathMap("purc_act_rev", "purc_act_rev");
				addColumnPathMap("org_ap_d_no", "org_ap_d_no");
				addColumnPathMap("crryovr_ap_d_no", "crryovr_ap_d_no");
				addColumnPathMap("crryovr_src_ap_d_no", "crryovr_src_ap_d_no");
				addColumnPathMap("sw_src_pay_schd_no", "sw_src_pay_schd_no");
				addColumnPathMap("sw_src_rcv_bill_no", "sw_src_rcv_bill_no");
				addColumnPathMap("base_purc_ac_dt", "base_purc_ac_dt");
				addColumnPathMap("pay_ntc_d_print_rmrks", "pay_ntc_d_print_rmrks");
				addColumnPathMap("pay_schd_d_print_rmrks", "pay_schd_d_print_rmrks");
				addColumnPathMap("intr_rmrks", "intr_rmrks");
				addColumnPathMap("sub_char1", "sub_char1");
				addColumnPathMap("sub_char2", "sub_char2");
				addColumnPathMap("sub_char3", "sub_char3");
				addColumnPathMap("trd_cur_proc_upri", "trd_cur_proc_upri");
				addColumnPathMap("trd_cur_proc_amt", "trd_cur_proc_amt");
				addColumnPathMap("trd_cur_onr_prov_upri", "trd_cur_onr_prov_upri");
				addColumnPathMap("trd_cur_onr_prov_amt", "trd_cur_onr_prov_amt");
				addColumnPathMap("base_cur_proc_upri", "base_cur_proc_upri");
				addColumnPathMap("base_cur_proc_amt", "base_cur_proc_amt");
				addColumnPathMap("base_cur_onr_prov_upri", "base_cur_onr_prov_upri");
				addColumnPathMap("base_cur_onr_prov_amt", "base_cur_onr_prov_amt");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_flg", "outsrc_flg");
				addColumnPathMap("asppl_grp_cd1", "asppl_grp_cd1");
				addColumnPathMap("asppl_grp_nm1", "asppl_grp_nm1");
				addColumnPathMap("asppl_grp_cd2", "asppl_grp_cd2");
				addColumnPathMap("asppl_grp_nm2", "asppl_grp_nm2");
				addColumnPathMap("asppl_grp_cd3", "asppl_grp_cd3");
				addColumnPathMap("asppl_grp_nm3", "asppl_grp_nm3");
				addColumnPathMap("asppl_grp_cd4", "asppl_grp_cd4");
				addColumnPathMap("asppl_grp_nm4", "asppl_grp_nm4");
				addColumnPathMap("asppl_grp_cd5", "asppl_grp_cd5");
				addColumnPathMap("asppl_grp_nm5", "asppl_grp_nm5");
				addColumnPathMap("asppl_grp_cd6", "asppl_grp_cd6");
				addColumnPathMap("asppl_grp_nm6", "asppl_grp_nm6");
				addColumnPathMap("asppl_grp_cd7", "asppl_grp_cd7");
				addColumnPathMap("asppl_grp_nm7", "asppl_grp_nm7");
				addColumnPathMap("asppl_grp_cd8", "asppl_grp_cd8");
				addColumnPathMap("asppl_grp_nm8", "asppl_grp_nm8");
				addColumnPathMap("asppl_grp_cd9", "asppl_grp_cd9");
				addColumnPathMap("asppl_grp_nm9", "asppl_grp_nm9");
				addColumnPathMap("asppl_grp_cd10", "asppl_grp_cd10");
				addColumnPathMap("asppl_grp_nm10", "asppl_grp_nm10");
				addColumnPathMap("sppl_grp_cd1", "sppl_grp_cd1");
				addColumnPathMap("sppl_grp_nm1", "sppl_grp_nm1");
				addColumnPathMap("sppl_grp_cd2", "sppl_grp_cd2");
				addColumnPathMap("sppl_grp_nm2", "sppl_grp_nm2");
				addColumnPathMap("sppl_grp_cd3", "sppl_grp_cd3");
				addColumnPathMap("sppl_grp_nm3", "sppl_grp_nm3");
				addColumnPathMap("sppl_grp_cd4", "sppl_grp_cd4");
				addColumnPathMap("sppl_grp_nm4", "sppl_grp_nm4");
				addColumnPathMap("sppl_grp_cd5", "sppl_grp_cd5");
				addColumnPathMap("sppl_grp_nm5", "sppl_grp_nm5");
				addColumnPathMap("sppl_grp_cd6", "sppl_grp_cd6");
				addColumnPathMap("sppl_grp_nm6", "sppl_grp_nm6");
				addColumnPathMap("sppl_grp_cd7", "sppl_grp_cd7");
				addColumnPathMap("sppl_grp_nm7", "sppl_grp_nm7");
				addColumnPathMap("sppl_grp_cd8", "sppl_grp_cd8");
				addColumnPathMap("sppl_grp_nm8", "sppl_grp_nm8");
				addColumnPathMap("sppl_grp_cd9", "sppl_grp_cd9");
				addColumnPathMap("sppl_grp_nm9", "sppl_grp_nm9");
				addColumnPathMap("sppl_grp_cd10", "sppl_grp_cd10");
				addColumnPathMap("sppl_grp_nm10", "sppl_grp_nm10");
				addColumnPathMap("itm_grp_cd1", "itm_grp_cd1");
				addColumnPathMap("itm_grp_nm1", "itm_grp_nm1");
				addColumnPathMap("itm_grp_cd2", "itm_grp_cd2");
				addColumnPathMap("itm_grp_nm2", "itm_grp_nm2");
				addColumnPathMap("itm_grp_cd3", "itm_grp_cd3");
				addColumnPathMap("itm_grp_nm3", "itm_grp_nm3");
				addColumnPathMap("itm_grp_cd4", "itm_grp_cd4");
				addColumnPathMap("itm_grp_nm4", "itm_grp_nm4");
				addColumnPathMap("itm_grp_cd5", "itm_grp_cd5");
				addColumnPathMap("itm_grp_nm5", "itm_grp_nm5");
				addColumnPathMap("itm_grp_cd6", "itm_grp_cd6");
				addColumnPathMap("itm_grp_nm6", "itm_grp_nm6");
				addColumnPathMap("itm_grp_cd7", "itm_grp_cd7");
				addColumnPathMap("itm_grp_nm7", "itm_grp_nm7");
				addColumnPathMap("itm_grp_cd8", "itm_grp_cd8");
				addColumnPathMap("itm_grp_nm8", "itm_grp_nm8");
				addColumnPathMap("itm_grp_cd9", "itm_grp_cd9");
				addColumnPathMap("itm_grp_nm9", "itm_grp_nm9");
				addColumnPathMap("itm_grp_cd10", "itm_grp_cd10");
				addColumnPathMap("itm_grp_nm10", "itm_grp_nm10");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("ins_func_nm", "ins_func_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_func_nm", "upd_func_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("ap_d_upd_cntr", "ap_d_upd_cntr");
				addColumnPathMap("ref_ap_d_no", "ref_ap_d_no");
				addColumnPathMap("amt_disp_pm", "amt_disp_pm");
			}
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_MSBHL5030_Srch03_0(mcframe.serverMSBH.MSBHL0040.Srch01_RsltR r_dest, mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR r_src) {
		}

		/**
		 * 連携処理MSBHL5030_Srch03の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_MSBHL5030_Srch03_0(MCList<mcframe.serverMSBH.MSBHL0040.Srch01_RsltR> dest, MCList<mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR> src) {
			MCRowMapper _rm = createMap_down_MSBHL5030_Srch03_0();
			for(mcframe.serverMSBH.MSBHL5030.PaySchd_Srch03_RsltR r_src : src){
				mcframe.serverMSBH.MSBHL0040.Srch01_RsltR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_MSBHL5030_Srch03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}