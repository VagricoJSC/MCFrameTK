package mcframe.serverMABC.MABCL0570;

import java.util.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.param.*;
import mcframe.serverCore.logic.*;
import mcframe.commonCore.annotation.Rev;
import mcframe.commonCore.annotation.Rev.Pj;
import mcframe.commonCore.annotation.Rev.Cl;
//FMCB IMPORT START
import mcframe.serverMA.dbc.*;
//FMCB IMPORT END
import static mcframe.serverCore.logic.MCLogicUtil.*;

/**
 * "MABCL_SpplReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_SpplReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
	/** 
	 * モジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABC";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABCL0570";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_SpplReg.Bp_UpdChk01 aBp_UpdChk01;

	protected void initBp_UpdChk01() {
		this.info = PDef.MA_MABCL0570_Bp_UpdChk01_INFO;
		this.aBp_UpdChk01 = ((MABCL_SpplReg)this).new Bp_UpdChk01();
	}

	public static MABCL_SpplReg.Bp_UpdChk01 crtBp_UpdChk01() {
		MABCL_SpplReg lgc = new MABCL_SpplReg();
		lgc.initBp_UpdChk01();
		return lgc.aBp_UpdChk01;
	}

	protected void paramBp_UpdChk01(MCParam p) {
		if (this.aBp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBp_UpdChk01.up0());
	}

	protected void doBp_UpdChk01() {
		aBp_UpdChk01.call();
	};

	/**
	 * Bp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR createBp_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.create();
	}

	/**
	 * Bp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> createBp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
	}
	protected MABCL_SpplReg.Bp_Upd01 aBp_Upd01;

	protected void initBp_Upd01() {
		this.info = PDef.MA_MABCL0570_Bp_Upd01_INFO;
		this.aBp_Upd01 = ((MABCL_SpplReg)this).new Bp_Upd01();
	}

	public static MABCL_SpplReg.Bp_Upd01 crtBp_Upd01() {
		MABCL_SpplReg lgc = new MABCL_SpplReg();
		lgc.initBp_Upd01();
		return lgc.aBp_Upd01;
	}

	protected void paramBp_Upd01(MCParam p) {
		if (this.aBp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBp_Upd01.up0());
	}

	protected void doBp_Upd01() {
		aBp_Upd01.call();
	};

	/**
	 * Bp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR createBp_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.create();
	}

	/**
	 * Bp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> createBp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
	}
	protected MABCL_SpplReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0570_Srch01_INFO;
		this.aSrch01 = ((MABCL_SpplReg)this).new Srch01();
	}

	public static MABCL_SpplReg.Srch01 crtSrch01() {
		MABCL_SpplReg lgc = new MABCL_SpplReg();
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
		p.addDownBlock(aSrch01.down2());
		p.addDownBlock(aSrch01.down3());
		p.addDownBlock(aSrch01.down4());
		p.addDownBlock(aSrch01.down5());
		p.addDownBlock(aSrch01.down6());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0570.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt5R.class);
	}

	/**
	 * Srch01_Rslt6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt6R createSrch01_Rslt6R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt6R.create();
	}

	/**
	 * Srch01_Rslt6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt6R> createSrch01_Rslt6L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt6R.class);
	}

	/**
	 * Srch01_Rslt7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Srch01_Rslt7R createSrch01_Rslt7R(){
		return mcframe.serverMABC.MABCL0570.Srch01_Rslt7R.create();
	}

	/**
	 * Srch01_Rslt7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt7R> createSrch01_Rslt7L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt7R.class);
	}
	protected MABCL_SpplReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0570_Upd01_INFO;
		this.aUpd01 = ((MABCL_SpplReg)this).new Upd01();
	}

	public static MABCL_SpplReg.Upd01 crtUpd01() {
		MABCL_SpplReg lgc = new MABCL_SpplReg();
		lgc.initUpd01();
		return lgc.aUpd01;
	}

	protected void paramUpd01(MCParam p) {
		if (this.aUpd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aUpd01.up0());
		p.addUpBlock(aUpd01.up1());
		p.addUpBlock(aUpd01.up2());
		p.addUpBlock(aUpd01.up3());
		p.addUpBlock(aUpd01.up4());
		p.addUpBlock(aUpd01.up5());
		p.addUpBlock(aUpd01.up6());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl6R(){
		return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl6L(){
		return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR createUpd01_Dtl7R(){
		return mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> createUpd01_Dtl7L(){
		return MCList.create(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * Bp_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタを登録する前のチェックを行う<br>
	 */
	abstract public class Bp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected Bp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			
			// 連携オペレーションのコンテナ取得

			// オペレーション、オペレーショングループの登録
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_SpplReg)MABCL_SpplReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR createBp_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.create();
		}

		/**
		 * Bp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> createBp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpplReg)MABCL_SpplReg_MC_A.this).info;
		}


	}
	/**
	 * Bp_Upd01オペレーション.<p>
	 *
	 * 取引先マスタを登録する<br>
	 */
	abstract public class Bp_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Bp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_BP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Bp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_BP_R.create("T1"));
			chkMaster = MCController.create(MAM_BP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_BP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_BP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_BP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
			}
			if (key.equals(MAIN)) {
				up_MAIN(chkMaster_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 * MAIN<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
			}
			if (key.equals(MAIN)) {
				down_MAIN();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_SpplReg)MABCL_SpplReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Bp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR createBp_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.create();
		}

		/**
		 * Bp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> createBp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpplReg)MABCL_SpplReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src_Bp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_Bp_Upd01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src_Bp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_Bp_Upd01_Dtl);
		}
		
		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_MAIN_chkMaster_0() {
			MCRowMapper map = new Map_up_MAIN_chkMaster_0();
			return map;
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_MAIN_chkMaster_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src : src){
				MAM_BP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_MAIN_chkMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
		//-----------------------MAIN専用down関連メソッド--------------------------

		/**
		 * オペレーショングループMAINの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_MAIN(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
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
		private final mcframe.serverMABC.MABCL0570.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt5R> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt6R> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt7R> down6;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BP_R> c0_down0;
		/**
		 * 連携情報 SELECT_SUB1<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_DTL__R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_DTL__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_DTL__R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_DTL__R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_DTL__R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_INSP_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_INSP_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_INSP_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_INSP_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_INSP_R> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_PURC_DDLV_LT_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_PURC_DDLV_LT_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_PURC_DDLV_LT_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_PURC_DDLV_LT_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_PURC_DDLV_LT_R> c3_down0;
		/**
		 * 連携情報 SELECT_SUB4<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EDI_IF_CTL_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_SUB4 = "SELECT_SUB4";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EDI_IF_CTL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_EDI_IF_CTL_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_EDI_IF_CTL_R> c4;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_EDI_IF_CTL_R> c4_down0;
		/**
		 * 連携情報 SELECT_SUB5<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_ITM_R&gt; （{@link #c5}）<br>
		 */
		public final String SELECT_SUB5 = "SELECT_SUB5";

		/**
		 * DBC連携 c5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_ITM_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_ITM_R&gt; （{@link #c5_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_ITM_R> c5;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BP_ITM_R> c5_down0;
		/**
		 * 連携情報 SELECT_SUB6<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SPPL_USR_R&gt; （{@link #c6}）<br>
		 */
		public final String SELECT_SUB6 = "SELECT_SUB6";

		/**
		 * DBC連携 c6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SPPL_USR_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SPPL_USR_R&gt; （{@link #c6_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SPPL_USR_R> c6;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_SPPL_USR_R> c6_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0570.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt5R.class);
			down5 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt6R.class);
			down6 = MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt7R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_BP_R.create("T1"));
			c1 = MCController.create(MAM_ITM_DTL__R.create("T1"));
			c2 = MCController.create(MAM_ITM_INSP_R.create("T1"));
			c3 = MCController.create(MAM_PURC_DDLV_LT_R.create("T1"));
			c4 = MCController.create(MAM_EDI_IF_CTL_R.create("T1"));
			c5 = MCController.create(MAM_BP_ITM_R.create("T1"));
			c6 = MCController.create(MAM_SPPL_USR_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_BP_R>)c0.down(0);
			c1_down0 = (MCList<MAM_ITM_DTL__R>)c1.down(0);
			c2_down0 = (MCList<MAM_ITM_INSP_R>)c2.down(0);
			c3_down0 = (MCList<MAM_PURC_DDLV_LT_R>)c3.down(0);
			c4_down0 = (MCList<MAM_EDI_IF_CTL_R>)c4.down(0);
			c5_down0 = (MCList<MAM_BP_ITM_R>)c5.down(0);
			c6_down0 = (MCList<MAM_SPPL_USR_R>)c6.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
			appendOpe(SELECT_SUB4, c4);
			appendOpe(SELECT_SUB5, c5);
			appendOpe(SELECT_SUB6, c6);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB1<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB2<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB3<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB4<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB5<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SUB6<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_SUB1)) {
				up_SELECT_SUB1();
			}
			if (key.equals(SELECT_SUB2)) {
				up_SELECT_SUB2();
			}
			if (key.equals(SELECT_SUB3)) {
				up_SELECT_SUB3();
			}
			if (key.equals(SELECT_SUB4)) {
				up_SELECT_SUB4();
			}
			if (key.equals(SELECT_SUB5)) {
				up_SELECT_SUB5();
			}
			if (key.equals(SELECT_SUB6)) {
				up_SELECT_SUB6();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_BP_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;MAM_ITM_DTL__R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;MAM_ITM_INSP_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;MAM_PURC_DDLV_LT_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_SUB4<br>
		 * MCList&lt;MAM_EDI_IF_CTL_R&gt;（{@link #c4_down0}）=> down4()<br>
		 * SELECT_SUB5<br>
		 * MCList&lt;MAM_BP_ITM_R&gt;（{@link #c5_down0}）=> down5()<br>
		 * SELECT_SUB6<br>
		 * MCList&lt;MAM_SPPL_USR_R&gt;（{@link #c6_down0}）=> down6()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SUB1)) {
				down_SELECT_SUB1(down1(), c1_down0);
			}
			if (key.equals(SELECT_SUB2)) {
				down_SELECT_SUB2(down2(), c2_down0);
			}
			if (key.equals(SELECT_SUB3)) {
				down_SELECT_SUB3(down3(), c3_down0);
			}
			if (key.equals(SELECT_SUB4)) {
				down_SELECT_SUB4(down4(), c4_down0);
			}
			if (key.equals(SELECT_SUB5)) {
				down_SELECT_SUB5(down5(), c5_down0);
			}
			if (key.equals(SELECT_SUB6)) {
				down_SELECT_SUB6(down6(), c6_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			if (i == 1) return down1();
			if (i == 2) return down2();
			if (i == 3) return down3();
			if (i == 4) return down4();
			if (i == 5) return down5();
			if (i == 6) return down6();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_SpplReg)MABCL_SpplReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0570.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt5R.class);
		}

		/**
		 * Srch01_Rslt6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt6R createSrch01_Rslt6R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt6R.create();
		}

		/**
		 * Srch01_Rslt6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt6R> createSrch01_Rslt6L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt6R.class);
		}

		/**
		 * Srch01_Rslt7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_Rslt7R createSrch01_Rslt7R(){
			return mcframe.serverMABC.MABCL0570.Srch01_Rslt7R.create();
		}

		/**
		 * Srch01_Rslt7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt7R> createSrch01_Rslt7L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Srch01_Rslt7R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0570.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0570.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_flg</td></tr>
		 * 	<tr><td><br></td><td>cntry_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_nm</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_nm</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_nm</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>bsppl_nm</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_nm</td></tr>
		 * 	<tr><td><br></td><td>po_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_ratio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>maker_nm</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>no_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>no_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>no_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>no_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>vld_pd</td></tr>
		 * 	<tr><td><br></td><td>lmt_pd</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_vld_pd</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_lmt_dt_frm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>inst_rslt_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_insp_valid_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>not_onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt5R> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>sundry_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>def_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>pf_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt6R> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>outsrc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_id</td></tr>
		 * 	<tr><td><br></td><td>ins_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>ins_ts</td></tr>
		 * 	<tr><td><br></td><td>ins_func_id</td></tr>
		 * 	<tr><td><br></td><td>ins_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_id</td></tr>
		 * 	<tr><td><br></td><td>upd_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_ts</td></tr>
		 * 	<tr><td><br></td><td>upd_func_id</td></tr>
		 * 	<tr><td><br></td><td>upd_func_nm</td></tr>
		 * 	<tr><td><br></td><td>upd_srv_req_no</td></tr>
		 * 	<tr><td><br></td><td>del_usr_id</td></tr>
		 * 	<tr><td><br></td><td>del_usr_nm</td></tr>
		 * 	<tr><td><br></td><td>del_ts</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt7R> down6() {
			return down6;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpplReg)MABCL_SpplReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_SUB1専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB1の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB1(){
		}
		//-----------------------SELECT_SUB2専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB2の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB2(){
		}
		//-----------------------SELECT_SUB3専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB3の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB3(){
		}
		//-----------------------SELECT_SUB4専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB4の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB4(){
		}
		//-----------------------SELECT_SUB5専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB5の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB5(){
		}
		//-----------------------SELECT_SUB6専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB6の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB6(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_BP_R> src0_0){
			down_SELECT_c0_0(dest_Srch01_Rslt1, src0_0);
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_c0_0() {
			MCRowMapper map = new Map_down_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("asppl_flg", "asppl_flg");
				addColumnPathMap("cntry_cd", "cntry_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("asppl_nm", "asppl_nm");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("vmi_purc_dpt_nm", "vmi_purc_dpt_nm");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("sppl_cal_nm", "sppl_cal_nm");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("po_print_nm", "po_print_nm");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("sppl_ship_form_nm", "sppl_ship_form_nm");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_nm", "purc_tax_nm");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_nm1", "sppl_tterm_nm1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_nm2", "sppl_tterm_nm2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("sppl_tterm_nm3", "sppl_tterm_nm3");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_nm", "prov_tax_nm");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("bsppl_nm", "bsppl_nm");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("ap_dpt_nm", "ap_dpt_nm");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt1R r_dest, MAM_BP_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt1R> dest, MCList<MAM_BP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_BP_R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_ITM_DTL__R> src0_0){
			down_SELECT_SUB1_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB1_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SUB1_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB1_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("stk_mng_typ", "stk_mng_typ");
				addColumnPathMap("sno1_mng_typ", "sno1_mng_typ");
				addColumnPathMap("sno2_mng_typ", "sno2_mng_typ");
				addColumnPathMap("sno3_mng_typ", "sno3_mng_typ");
				addColumnPathMap("sno4_mng_typ", "sno4_mng_typ");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("maker_nm", "maker_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("purc_basis_typ_nm", "purc_basis_typ_nm");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("rqst_wg_nm", "rqst_wg_nm");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt2R r_dest, MAM_ITM_DTL__R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt2R> dest, MCList<MAM_ITM_DTL__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(MAM_ITM_DTL__R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_ITM_INSP_R> src0_0){
			down_SELECT_SUB2_c2_0(dest_Srch01_Rslt3, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB2_c2_0() {
			MCRowMapper map = new Map_down_SELECT_SUB2_c2_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB2_c2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("lmt_ctl_flg", "lmt_ctl_flg");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("maker_nm", "maker_nm");
				addColumnPathMap("to_site_cd", "to_site_cd");
				addColumnPathMap("to_site_nm", "to_site_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("no_insp_flg", "no_insp_flg");
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("insp_ptn_nm", "insp_ptn_nm");
				addColumnPathMap("no_mrkt_judg_flg", "no_mrkt_judg_flg");
				addColumnPathMap("no_plnt_aprv_flg", "no_plnt_aprv_flg");
				addColumnPathMap("no_insp_aprv_flg", "no_insp_aprv_flg");
				addColumnPathMap("lmt_dt_frm_typ", "lmt_dt_frm_typ");
				addColumnPathMap("vld_pd", "vld_pd");
				addColumnPathMap("lmt_pd", "lmt_pd");
				addColumnPathMap("lot_insp_vld_pd", "lot_insp_vld_pd");
				addColumnPathMap("calc_pd_typ", "calc_pd_typ");
				addColumnPathMap("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ");
				addColumnPathMap("insp_inst_issue_typ", "insp_inst_issue_typ");
				addColumnPathMap("insp_offst", "insp_offst");
				addColumnPathMap("inst_rslt_issue_flg", "inst_rslt_issue_flg");
				addColumnPathMap("pre_insp_valid_flg", "pre_insp_valid_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt3R r_dest, MAM_ITM_INSP_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt3R> dest, MCList<MAM_ITM_INSP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(MAM_ITM_INSP_R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_PURC_DDLV_LT_R> src0_0){
			down_SELECT_SUB3_c3_0(dest_Srch01_Rslt4, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB3_c3_0() {
			MCRowMapper map = new Map_down_SELECT_SUB3_c3_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB3_c3_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("lg_grp_nm", "lg_grp_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt4R r_dest, MAM_PURC_DDLV_LT_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt4R> dest, MCList<MAM_PURC_DDLV_LT_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(MAM_PURC_DDLV_LT_R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB4(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_EDI_IF_CTL_R> src0_0){
			down_SELECT_SUB4_c4_0(dest_Srch01_Rslt5, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB4_c4_0() {
			MCRowMapper map = new Map_down_SELECT_SUB4_c4_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB4_c4_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("not_onr_prov_flg", "not_onr_prov_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("ext_sys_nm", "ext_sys_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB4_c4_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt5R r_dest, MAM_EDI_IF_CTL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB4_c4_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt5R> dest, MCList<MAM_EDI_IF_CTL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB4_c4_0();
			for(MAM_EDI_IF_CTL_R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB4_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB5専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB5の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB5(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt6R> dest_Srch01_Rslt6, MCList<MAM_BP_ITM_R> src0_0){
			down_SELECT_SUB5_c5_0(dest_Srch01_Rslt6, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB5_c5_0() {
			MCRowMapper map = new Map_down_SELECT_SUB5_c5_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB5_c5_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("itm_nm", "itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("sundry_itm_flg", "sundry_itm_flg");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_grp_nm", "pf_grp_nm");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB5_c5_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt6R r_dest, MAM_BP_ITM_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB5_c5_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt6R> dest, MCList<MAM_BP_ITM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB5_c5_0();
			for(MAM_BP_ITM_R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt6R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB5_c5_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB6専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB6の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB6(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt7R> dest_Srch01_Rslt7, MCList<MAM_SPPL_USR_R> src0_0){
			down_SELECT_SUB6_c6_0(dest_Srch01_Rslt7, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB6_c6_0() {
			MCRowMapper map = new Map_down_SELECT_SUB6_c6_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB6_c6_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_usr_cd", "purc_usr_cd");
				addColumnPathMap("purc_usr_nm", "purc_usr_nm");
				addColumnPathMap("purc_dpt_cd", "purc_dpt_cd");
				addColumnPathMap("purc_dpt_nm", "purc_dpt_nm");
				addColumnPathMap("outsrc_usr_cd", "outsrc_usr_cd");
				addColumnPathMap("outsrc_usr_nm", "outsrc_usr_nm");
				addColumnPathMap("outsrc_dpt_cd", "outsrc_dpt_cd");
				addColumnPathMap("outsrc_dpt_nm", "outsrc_dpt_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("ins_usr_id", "ins_usr_id");
				addColumnPathMap("ins_usr_nm", "ins_usr_nm");
				addColumnPathMap("ins_ts", "ins_ts");
				addColumnPathMap("ins_func_id", "ins_func_id");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("upd_usr_id", "upd_usr_id");
				addColumnPathMap("upd_usr_nm", "upd_usr_nm");
				addColumnPathMap("upd_ts", "upd_ts");
				addColumnPathMap("upd_func_id", "upd_func_id");
				addColumnPathMap("upd_srv_req_no", "upd_srv_req_no");
				addColumnPathMap("del_usr_id", "del_usr_id");
				addColumnPathMap("del_usr_nm", "del_usr_nm");
				addColumnPathMap("del_ts", "del_ts");
			}
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB6_c6_0(mcframe.serverMABC.MABCL0570.Srch01_Rslt7R r_dest, MAM_SPPL_USR_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB6_c6_0(MCList<mcframe.serverMABC.MABCL0570.Srch01_Rslt7R> dest, MCList<MAM_SPPL_USR_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB6_c6_0();
			for(MAM_SPPL_USR_R r_src : src){
				mcframe.serverMABC.MABCL0570.Srch01_Rslt7R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB6_c6_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> up6;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0570.MABCL_SpplReg.Bp_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0570.MABCL_SpplReg.Bp_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0570.MABCL_SpplReg.Bp_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0570.MABCL_SpplReg.Bp_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0570.MABCL_SpplReg.Bp_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0570.MABCL_SpplReg.Bp_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.ItmDtl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.ItmInsp_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.ItmInsp_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.ItmInsp_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.ItmInsp_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.ItmInsp_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.ItmInsp_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.PurcDdlvLt_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.PurcDdlvLt_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.PurcDdlvLt_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.PurcDdlvLt_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.PurcDdlvLt_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.PurcDdlvLt_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE05<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01 （{@link #chk05}）<br>
		 * 連携先 mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01 （{@link #upd05}）<br>
		 */
		public final String CALL_OPE05 = "CALL_OPE05";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01 chk05;
		/**
		 * 連携オペレーション upd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01 upd05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> chk05_up0;
		public final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> upd05_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE06<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 （{@link #chk06}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 （{@link #upd06}）<br>
		 */
		public final String CALL_OPE06 = "CALL_OPE06";

		/**
		 * 連携オペレーション chk06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 chk06;
		/**
		 * 連携オペレーション upd06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 upd06;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> chk06_up0;
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> upd06_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE07<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.SpplUsr_UpdChk01 （{@link #chk07}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.SpplUsr_Upd01 （{@link #upd07}）<br>
		 */
		public final String CALL_OPE07 = "CALL_OPE07";

		/**
		 * 連携オペレーション chk07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.SpplUsr_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR&gt; （{@link #chk07_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.SpplUsr_UpdChk01 chk07;
		/**
		 * 連携オペレーション upd07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.SpplUsr_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR&gt; （{@link #upd07_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.SpplUsr_Upd01 upd07;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> chk07_up0;
		public final MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> upd07_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
			up5 = MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
			up6 = MCList.create(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0570.MABCL_SpplReg.crtBp_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0570.MABCL_SpplReg.crtBp_Upd01();
			chk02 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtItmDtl_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0010.MABSL_ItmDtlReg.crtItmDtl_Upd01();
			chk03 = mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.crtItmInsp_UpdChk01();
			upd03 = mcframe.serverMABS.MABSL0190.MABSL_ItmInspReg.crtItmInsp_Upd01();
			chk04 = mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.crtPurcDdlvLt_UpdChk01();
			upd04 = mcframe.serverMABS.MABSL0530.MABCL_PurcDdlvLtReg.crtPurcDdlvLt_Upd01();
			chk05 = mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.crtEdiIfCtl_UpdChk01();
			upd05 = mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.crtEdiIfCtl_Upd01();
			chk06 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_UpdChk01();
			upd06 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_Upd01();
			chk07 = mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.crtSpplUsr_UpdChk01();
			upd07 = mcframe.serverMABS.MABSL0670.MABSL_SpplUsrReg.crtSpplUsr_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR>)upd04.up(0);
			chk05_up0 = (MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR>)chk05.up(0);
			upd05_up0 = (MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR>)upd05.up(0);
			chk06_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)chk06.up(0);
			upd06_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)upd06.up(0);
			chk07_up0 = (MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR>)chk07.up(0);
			upd07_up0 = (MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR>)upd07.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
			appendOpe(CALL_OPE03, chk03);
			appendOpe(CALL_OPE03, upd03);
			appendOpe(CALL_OPE04, chk04);
			appendOpe(CALL_OPE04, upd04);
			appendOpe(CALL_OPE05, chk05);
			appendOpe(CALL_OPE05, upd05);
			appendOpe(CALL_OPE06, chk06);
			appendOpe(CALL_OPE06, upd06);
			appendOpe(CALL_OPE07, chk07);
			appendOpe(CALL_OPE07, upd07);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 * CALL_OPE05<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 * CALL_OPE06<br>
		 * up5() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 * up5() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 * CALL_OPE07<br>
		 * up6() => MCList&lt;mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR&gt; （{@link #chk07_up0}）<br>
		 * up6() => MCList&lt;mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR&gt; （{@link #upd07_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
			if (key.equals(CALL_OPE03)) {
				up_CALL_OPE03(chk03_up0, upd03_up0, up2());
			}
			if (key.equals(CALL_OPE04)) {
				up_CALL_OPE04(chk04_up0, upd04_up0, up3());
			}
			if (key.equals(CALL_OPE05)) {
				up_CALL_OPE05(chk05_up0, upd05_up0, up4());
			}
			if (key.equals(CALL_OPE06)) {
				up_CALL_OPE06(chk06_up0, upd06_up0, up5());
			}
			if (key.equals(CALL_OPE07)) {
				up_CALL_OPE07(chk07_up0, upd07_up0, up6());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE03<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE04<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE05<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE06<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE07<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
			}
			if (key.equals(CALL_OPE02)) {
				down_CALL_OPE02();
			}
			if (key.equals(CALL_OPE03)) {
				down_CALL_OPE03();
			}
			if (key.equals(CALL_OPE04)) {
				down_CALL_OPE04();
			}
			if (key.equals(CALL_OPE05)) {
				down_CALL_OPE05();
			}
			if (key.equals(CALL_OPE06)) {
				down_CALL_OPE06();
			}
			if (key.equals(CALL_OPE07)) {
				down_CALL_OPE07();
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			if (i == 2) return up2();
			if (i == 3) return up3();
			if (i == 4) return up4();
			if (i == 5) return up5();
			if (i == 6) return up6();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_SpplReg)MABCL_SpplReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl6R(){
			return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl6L(){
			return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR createUpd01_Dtl7R(){
			return mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> createUpd01_Dtl7L(){
			return MCList.create(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>asppl_cd</td></tr>
		 * 	<tr><td><br></td><td>vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_vmi_purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>sppl_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>subcon_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>pay_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>sppl_cal_cd</td></tr>
		 * 	<tr><td><br></td><td>po_print_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>po_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>dlv_inst_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_rcpt_dlv_slip_flg</td></tr>
		 * 	<tr><td><br></td><td>prms_recv_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>rcpt_iv_dup_flg</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>sppl_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>wrk_po_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ap_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_rcv_typ</td></tr>
		 * 	<tr><td><br></td><td>onr_prsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>repurc_obli_flg</td></tr>
		 * 	<tr><td><br></td><td>outsrc_upri_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>prov_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>prov_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>bsppl_flg</td></tr>
		 * 	<tr><td><br></td><td>bsppl_cd</td></tr>
		 * 	<tr><td><br></td><td>ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ap_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>sppl_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_id_typ</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>purc_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>accpt_insp_lt</td></tr>
		 * 	<tr><td><br></td><td>buf_lt</td></tr>
		 * 	<tr><td><br></td><td>ord_fix_pd</td></tr>
		 * 	<tr><td><br></td><td>sz_day_week_typ</td></tr>
		 * 	<tr><td><br></td><td>sz_week</td></tr>
		 * 	<tr><td><br></td><td>lot_sz_pd</td></tr>
		 * 	<tr><td><br></td><td>min_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>batch_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_lot_qty</td></tr>
		 * 	<tr><td><br></td><td>max_order</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>order_ratio</td></tr>
		 * 	<tr><td><br></td><td>pre_po_tgt_flg</td></tr>
		 * 	<tr><td><br></td><td>rqst_wg_cd</td></tr>
		 * 	<tr><td><br></td><td>po_batch_flg</td></tr>
		 * 	<tr><td><br></td><td>sno1</td></tr>
		 * 	<tr><td><br></td><td>sno2</td></tr>
		 * 	<tr><td><br></td><td>sno3</td></tr>
		 * 	<tr><td><br></td><td>sno4</td></tr>
		 * 	<tr><td><br></td><td>not_mrp_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_ratio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>maker_cd</td></tr>
		 * 	<tr><td><br></td><td>to_site_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>no_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>insp_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>no_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>no_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>no_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>vld_pd</td></tr>
		 * 	<tr><td><br></td><td>lmt_pd</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_vld_pd</td></tr>
		 * 	<tr><td><br></td><td>calc_pd_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_insp_lmt_dt_frm_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_inst_issue_typ</td></tr>
		 * 	<tr><td><br></td><td>insp_offst</td></tr>
		 * 	<tr><td><br></td><td>inst_rslt_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>pre_insp_valid_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>lg_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt</td></tr>
		 * 	<tr><td><br></td><td>purc_lt_add_qty</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>if_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>not_onr_prov_flg</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>ext_sys_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>bp_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>def_flg</td></tr>
		 * 	<tr><td><br></td><td>pf_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>pf_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>purc_commit_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>sppl_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>purc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>purc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_usr_cd</td></tr>
		 * 	<tr><td><br></td><td>outsrc_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> up6() {
			return up6;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_SpplReg)MABCL_SpplReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("check_vmi_purc_dpt_cd", "check_vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("bsppl_flg", "bsppl_flg");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("check_ap_dpt_cd", "check_ap_dpt_cd");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_upd01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_upd01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_upd01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("asppl_cd", "asppl_cd");
				addColumnPathMap("vmi_purc_dpt_cd", "vmi_purc_dpt_cd");
				addColumnPathMap("sppl_cntct_dpt", "sppl_cntct_dpt");
				addColumnPathMap("sppl_cntct_psn", "sppl_cntct_psn");
				addColumnPathMap("sppl_cntct_psn_title", "sppl_cntct_psn_title");
				addColumnPathMap("subcon_flg", "subcon_flg");
				addColumnPathMap("purc_upri_req_typ", "purc_upri_req_typ");
				addColumnPathMap("purc_upri_cng_flg", "purc_upri_cng_flg");
				addColumnPathMap("purc_amt_rnd_typ", "purc_amt_rnd_typ");
				addColumnPathMap("purc_tax_calc_typ", "purc_tax_calc_typ");
				addColumnPathMap("purc_tax_rnd_typ", "purc_tax_rnd_typ");
				addColumnPathMap("pay_crryovr_times", "pay_crryovr_times");
				addColumnPathMap("sppl_cal_cd", "sppl_cal_cd");
				addColumnPathMap("po_print_cd", "po_print_cd");
				addColumnPathMap("sppl_ship_form_cd", "sppl_ship_form_cd");
				addColumnPathMap("po_dlv_slip_flg", "po_dlv_slip_flg");
				addColumnPathMap("dlv_inst_dlv_slip_flg", "dlv_inst_dlv_slip_flg");
				addColumnPathMap("prms_rcpt_dlv_slip_flg", "prms_rcpt_dlv_slip_flg");
				addColumnPathMap("prms_recv_flg", "prms_recv_flg");
				addColumnPathMap("purc_tax_cd", "purc_tax_cd");
				addColumnPathMap("purc_tax_cd_prio_flg", "purc_tax_cd_prio_flg");
				addColumnPathMap("sppl_iv_flg", "sppl_iv_flg");
				addColumnPathMap("rcpt_iv_dup_flg", "rcpt_iv_dup_flg");
				addColumnPathMap("sppl_tterm_cd1", "sppl_tterm_cd1");
				addColumnPathMap("sppl_tterm_cd2", "sppl_tterm_cd2");
				addColumnPathMap("sppl_tterm_cd3", "sppl_tterm_cd3");
				addColumnPathMap("wrk_po_flg", "wrk_po_flg");
				addColumnPathMap("wrk_ap_flg", "wrk_ap_flg");
				addColumnPathMap("purc_slip_each_lot_typ", "purc_slip_each_lot_typ");
				addColumnPathMap("prov_rcv_typ", "prov_rcv_typ");
				addColumnPathMap("onr_prsppl_flg", "onr_prsppl_flg");
				addColumnPathMap("repurc_obli_flg", "repurc_obli_flg");
				addColumnPathMap("outsrc_upri_typ", "outsrc_upri_typ");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("prov_basis_typ", "prov_basis_typ");
				addColumnPathMap("prov_upri_cng_flg", "prov_upri_cng_flg");
				addColumnPathMap("prov_tax_cd", "prov_tax_cd");
				addColumnPathMap("prov_tax_cd_prio_flg", "prov_tax_cd_prio_flg");
				addColumnPathMap("prov_amt_rnd_typ", "prov_amt_rnd_typ");
				addColumnPathMap("prov_tax_calc_typ", "prov_tax_calc_typ");
				addColumnPathMap("prov_tax_rnd_typ", "prov_tax_rnd_typ");
				addColumnPathMap("bsppl_cd", "bsppl_cd");
				addColumnPathMap("ap_dpt_cd", "ap_dpt_cd");
				addColumnPathMap("sppl_prnt_typ", "sppl_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0570.Bp_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk02_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_upd02_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_upd02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_upd02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_id_typ", "purc_id_typ");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("purc_basis_typ", "purc_basis_typ");
				addColumnPathMap("accpt_insp_lt", "accpt_insp_lt");
				addColumnPathMap("buf_lt", "buf_lt");
				addColumnPathMap("ord_fix_pd", "ord_fix_pd");
				addColumnPathMap("sz_day_week_typ", "sz_day_week_typ");
				addColumnPathMap("sz_week", "sz_week");
				addColumnPathMap("lot_sz_pd", "lot_sz_pd");
				addColumnPathMap("min_lot_qty", "min_lot_qty");
				addColumnPathMap("batch_lot_qty", "batch_lot_qty");
				addColumnPathMap("max_lot_qty", "max_lot_qty");
				addColumnPathMap("max_order", "max_order");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("order_ratio", "order_ratio");
				addColumnPathMap("pre_po_tgt_flg", "pre_po_tgt_flg");
				addColumnPathMap("rqst_wg_cd", "rqst_wg_cd");
				addColumnPathMap("po_batch_flg", "po_batch_flg");
				addColumnPathMap("sno1", "sno1");
				addColumnPathMap("sno2", "sno2");
				addColumnPathMap("sno3", "sno3");
				addColumnPathMap("sno4", "sno4");
				addColumnPathMap("not_mrp_flg", "not_mrp_flg");
				addColumnPathMap("cost_ratio", "cost_ratio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("rqst_loc_cd", "rqst_loc_cd");
				addColumnPathMap("bom_ptn", "bom_ptn");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0010.ItmDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> src_Upd01_Dtl3){
			up_CALL_OPE03_chk03_0(dest0_0, src_Upd01_Dtl3);
			up_CALL_OPE03_upd03_0(dest1_0, src_Upd01_Dtl3);
		}
		
		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_chk03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_chk03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_chk03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("to_site_cd", "to_site_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("no_insp_flg", "no_insp_flg");
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("no_mrkt_judg_flg", "no_mrkt_judg_flg");
				addColumnPathMap("no_plnt_aprv_flg", "no_plnt_aprv_flg");
				addColumnPathMap("no_insp_aprv_flg", "no_insp_aprv_flg");
				addColumnPathMap("lmt_dt_frm_typ", "lmt_dt_frm_typ");
				addColumnPathMap("vld_pd", "vld_pd");
				addColumnPathMap("lmt_pd", "lmt_pd");
				addColumnPathMap("lot_insp_vld_pd", "lot_insp_vld_pd");
				addColumnPathMap("calc_pd_typ", "calc_pd_typ");
				addColumnPathMap("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ");
				addColumnPathMap("insp_inst_issue_typ", "insp_inst_issue_typ");
				addColumnPathMap("insp_offst", "insp_offst");
				addColumnPathMap("inst_rslt_issue_flg", "inst_rslt_issue_flg");
				addColumnPathMap("pre_insp_valid_flg", "pre_insp_valid_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("from_site_cd", "from_site_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_chk03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE03_upd03_0() {
			MCRowMapper map = new Map_up_CALL_OPE03_upd03_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE03_upd03_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("maker_cd", "maker_cd");
				addColumnPathMap("to_site_cd", "to_site_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("no_insp_flg", "no_insp_flg");
				addColumnPathMap("insp_ptn_cd", "insp_ptn_cd");
				addColumnPathMap("no_mrkt_judg_flg", "no_mrkt_judg_flg");
				addColumnPathMap("no_plnt_aprv_flg", "no_plnt_aprv_flg");
				addColumnPathMap("no_insp_aprv_flg", "no_insp_aprv_flg");
				addColumnPathMap("lmt_dt_frm_typ", "lmt_dt_frm_typ");
				addColumnPathMap("vld_pd", "vld_pd");
				addColumnPathMap("lmt_pd", "lmt_pd");
				addColumnPathMap("lot_insp_vld_pd", "lot_insp_vld_pd");
				addColumnPathMap("calc_pd_typ", "calc_pd_typ");
				addColumnPathMap("lot_insp_lmt_dt_frm_typ", "lot_insp_lmt_dt_frm_typ");
				addColumnPathMap("insp_inst_issue_typ", "insp_inst_issue_typ");
				addColumnPathMap("insp_offst", "insp_offst");
				addColumnPathMap("inst_rslt_issue_flg", "inst_rslt_issue_flg");
				addColumnPathMap("pre_insp_valid_flg", "pre_insp_valid_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("mfg_loc_cd", "mfg_loc_cd");
				addColumnPathMap("from_site_cd", "from_site_cd");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0190.ItmInsp_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> src_Upd01_Dtl4){
			up_CALL_OPE04_chk04_0(dest0_0, src_Upd01_Dtl4);
			up_CALL_OPE04_upd04_0(dest1_0, src_Upd01_Dtl4);
		}
		
		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_chk04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_chk04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_chk04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_chk04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE04_upd04_0() {
			MCRowMapper map = new Map_up_CALL_OPE04_upd04_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE04_upd04_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("lg_grp_cd", "lg_grp_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_lt", "purc_lt");
				addColumnPathMap("purc_lt_add_qty", "purc_lt_add_qty");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0530.PurcDdlvLt_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE05(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src_Upd01_Dtl5){
			up_CALL_OPE05_chk05_0(dest0_0, src_Upd01_Dtl5);
			up_CALL_OPE05_upd05_0(dest1_0, src_Upd01_Dtl5);
		}
		
		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_chk05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_chk05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_chk05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("not_onr_prov_flg", "not_onr_prov_flg");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_chk05_0(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_chk05_0(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_chk05_0();
			for(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_chk05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE05_upd05_0() {
			MCRowMapper map = new Map_up_CALL_OPE05_upd05_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE05_upd05_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("if_proc_typ", "if_proc_typ");
				addColumnPathMap("not_onr_prov_flg", "not_onr_prov_flg");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("ext_sys_cd", "ext_sys_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE05_upd05_0(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_upd05_0(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_upd05_0();
			for(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_upd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE06専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE06の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE06(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src_Upd01_Dtl6){
			up_CALL_OPE06_chk06_0(dest0_0, src_Upd01_Dtl6);
			up_CALL_OPE06_upd06_0(dest1_0, src_Upd01_Dtl6);
		}
		
		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE06_chk06_0() {
			MCRowMapper map = new Map_up_CALL_OPE06_chk06_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE06_chk06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE06_chk06_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_chk06_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_chk06_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_chk06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE06_upd06_0() {
			MCRowMapper map = new Map_up_CALL_OPE06_upd06_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE06_upd06_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("bp_cd", "bp_cd");
				addColumnPathMap("itm_cd", "itm_cd");
				addColumnPathMap("itm_sub1", "itm_sub1");
				addColumnPathMap("itm_sub2", "itm_sub2");
				addColumnPathMap("itm_sub3", "itm_sub3");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("bp_itm_cd", "bp_itm_cd");
				addColumnPathMap("bp_itm_nm", "bp_itm_nm");
				addColumnPathMap("def_flg", "def_flg");
				addColumnPathMap("pf_grp_cd", "pf_grp_cd");
				addColumnPathMap("pf_fix_flg", "pf_fix_flg");
				addColumnPathMap("purc_commit_flg", "purc_commit_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE06_upd06_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_upd06_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_upd06_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_upd06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE07専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE07の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE07(MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> src_Upd01_Dtl7){
			up_CALL_OPE07_chk07_0(dest0_0, src_Upd01_Dtl7);
			up_CALL_OPE07_upd07_0(dest1_0, src_Upd01_Dtl7);
		}
		
		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE07_chk07_0() {
			MCRowMapper map = new Map_up_CALL_OPE07_chk07_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE07_chk07_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_usr_cd", "purc_usr_cd");
				addColumnPathMap("purc_dpt_cd", "purc_dpt_cd");
				addColumnPathMap("outsrc_usr_cd", "outsrc_usr_cd");
				addColumnPathMap("outsrc_dpt_cd", "outsrc_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE07_chk07_0(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE07_chk07_0(MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE07_chk07_0();
			for(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE07_chk07_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE07_upd07_0() {
			MCRowMapper map = new Map_up_CALL_OPE07_upd07_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE07_upd07_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("sppl_cd", "sppl_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("purc_usr_cd", "purc_usr_cd");
				addColumnPathMap("purc_dpt_cd", "purc_dpt_cd");
				addColumnPathMap("outsrc_usr_cd", "outsrc_usr_cd");
				addColumnPathMap("outsrc_dpt_cd", "outsrc_dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE07_upd07_0(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE07_upd07_0(MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE07_upd07_0();
			for(mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0670.SpplUsr_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE07_upd07_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
		//-----------------------CALL_OPE02専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE02の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE02(){
		}
		//-----------------------CALL_OPE03専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE03の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE03(){
		}
		//-----------------------CALL_OPE04専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE04の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE04(){
		}
		//-----------------------CALL_OPE05専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE05の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE05(){
		}
		//-----------------------CALL_OPE06専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE06の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE06(){
		}
		//-----------------------CALL_OPE07専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE07の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE07(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}