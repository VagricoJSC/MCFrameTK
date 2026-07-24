package mcframe.serverMABC.MABCL0540;

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
 * "MABCL_CstReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_CstReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0540";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_CstReg.BpCst_UpdChk01 aBpCst_UpdChk01;

	protected void initBpCst_UpdChk01() {
		this.info = PDef.MA_MABCL0540_BpCst_UpdChk01_INFO;
		this.aBpCst_UpdChk01 = ((MABCL_CstReg)this).new BpCst_UpdChk01();
	}

	public static MABCL_CstReg.BpCst_UpdChk01 crtBpCst_UpdChk01() {
		MABCL_CstReg lgc = new MABCL_CstReg();
		lgc.initBpCst_UpdChk01();
		return lgc.aBpCst_UpdChk01;
	}

	protected void paramBpCst_UpdChk01(MCParam p) {
		if (this.aBpCst_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpCst_UpdChk01.up0());
	}

	protected void doBpCst_UpdChk01() {
		aBpCst_UpdChk01.call();
	};

	/**
	 * BpCst_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR createBpCst_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.create();
	}

	/**
	 * BpCst_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> createBpCst_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
	}
	protected MABCL_CstReg.BpCst_Upd01 aBpCst_Upd01;

	protected void initBpCst_Upd01() {
		this.info = PDef.MA_MABCL0540_BpCst_Upd01_INFO;
		this.aBpCst_Upd01 = ((MABCL_CstReg)this).new BpCst_Upd01();
	}

	public static MABCL_CstReg.BpCst_Upd01 crtBpCst_Upd01() {
		MABCL_CstReg lgc = new MABCL_CstReg();
		lgc.initBpCst_Upd01();
		return lgc.aBpCst_Upd01;
	}

	protected void paramBpCst_Upd01(MCParam p) {
		if (this.aBpCst_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aBpCst_Upd01.up0());
	}

	protected void doBpCst_Upd01() {
		aBpCst_Upd01.call();
	};

	/**
	 * BpCst_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR createBpCst_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.create();
	}

	/**
	 * BpCst_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> createBpCst_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
	}
	protected MABCL_CstReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0540_Srch01_INFO;
		this.aSrch01 = ((MABCL_CstReg)this).new Srch01();
	}

	public static MABCL_CstReg.Srch01 crtSrch01() {
		MABCL_CstReg lgc = new MABCL_CstReg();
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
		p.addDownBlock(aSrch01.down7());
	}

	protected void doSrch01() {
		aSrch01.call();
	};

	/**
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0540.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt2R.class);
	}

	/**
	 * Srch01_Rslt3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt3R createSrch01_Rslt3R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt3R.create();
	}

	/**
	 * Srch01_Rslt3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt3R> createSrch01_Rslt3L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt3R.class);
	}

	/**
	 * Srch01_Rslt4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt4R createSrch01_Rslt4R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt4R.create();
	}

	/**
	 * Srch01_Rslt4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt4R> createSrch01_Rslt4L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt4R.class);
	}

	/**
	 * Srch01_Rslt5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt5R createSrch01_Rslt5R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt5R.create();
	}

	/**
	 * Srch01_Rslt5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt5R> createSrch01_Rslt5L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt5R.class);
	}

	/**
	 * Srch01_Rslt6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt6R createSrch01_Rslt6R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt6R.create();
	}

	/**
	 * Srch01_Rslt6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt6R> createSrch01_Rslt6L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt6R.class);
	}

	/**
	 * Srch01_Rslt7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt7R createSrch01_Rslt7R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt7R.create();
	}

	/**
	 * Srch01_Rslt7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt7R> createSrch01_Rslt7L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt7R.class);
	}

	/**
	 * Srch01_Rslt8ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.Srch01_Rslt8R createSrch01_Rslt8R(){
		return mcframe.serverMABC.MABCL0540.Srch01_Rslt8R.create();
	}

	/**
	 * Srch01_Rslt8ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt8R> createSrch01_Rslt8L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt8R.class);
	}
	protected MABCL_CstReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0540_Upd01_INFO;
		this.aUpd01 = ((MABCL_CstReg)this).new Upd01();
	}

	public static MABCL_CstReg.Upd01 crtUpd01() {
		MABCL_CstReg lgc = new MABCL_CstReg();
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
		p.addUpBlock(aUpd01.up7());
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl3ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR createUpd01_Dtl3R(){
		return mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl3ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> createUpd01_Dtl3L(){
		return MCList.create(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl4ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR createUpd01_Dtl4R(){
		return mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl4ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> createUpd01_Dtl4L(){
		return MCList.create(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl5ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR createUpd01_Dtl5R(){
		return mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl5ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> createUpd01_Dtl5L(){
		return MCList.create(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl6ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR createUpd01_Dtl6R(){
		return mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl6ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> createUpd01_Dtl6L(){
		return MCList.create(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl7ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR createUpd01_Dtl7R(){
		return mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl7ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> createUpd01_Dtl7L(){
		return MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl8ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl8R(){
		return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl8ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl8L(){
		return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * BpCst_UpdChk01オペレーション.<p>
	 *
	 * 取引先マスタの登録前のチェックを行います。<br>
	 */
	abstract public class BpCst_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpCst_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected BpCst_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);

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
			invoke((MABCL_CstReg)MABCL_CstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpCst_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR createBpCst_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.create();
		}

		/**
		 * BpCst_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> createBpCst_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CstReg)MABCL_CstReg_MC_A.this).info;
		}


	}
	/**
	 * BpCst_Upd01オペレーション.<p>
	 *
	 * 取引先マスタの登録を行います。<br>
	 */
	abstract public class BpCst_Upd01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "BpCst_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> up0;
		
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
		protected BpCst_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);

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
			invoke((MABCL_CstReg)MABCL_CstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * BpCst_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR createBpCst_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.create();
		}

		/**
		 * BpCst_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> createBpCst_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CstReg)MABCL_CstReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src_BpCst_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_BpCst_Upd01_Dtl);
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
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src : src){
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
		protected void up_MAIN(MCList<MAM_BP_R> dest0_0, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src_BpCst_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_BpCst_Upd01_Dtl);
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
		protected void up_MAIN_chkMaster_0(MAM_BP_R r_dest, mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_BP_R> dest, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src : src){
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
	 * 得意先関連マスタの検索を行います。<br>
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
		private final mcframe.serverMABC.MABCL0540.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt2R> down1;
		/** このオペレーションからの下り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt3R> down2;
		/** このオペレーションからの下り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt4R> down3;
		/** このオペレーションからの下り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt5R> down4;
		/** このオペレーションからの下り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt6R> down5;
		/** このオペレーションからの下り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt7R> down6;
		/** このオペレーションからの下り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt8R> down7;
		
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
		 * 連携先 MCDBSubOperation&lt;MAM_CST_USR_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SUB1 = "SELECT_SUB1";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CST_USR_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_CST_USR_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_CST_USR_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_CST_USR_R> c1_down0;
		/**
		 * 連携情報 SELECT_SUB2<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CST_SLS_UPRI_RANK_R&gt; （{@link #c2}）<br>
		 */
		public final String SELECT_SUB2 = "SELECT_SUB2";

		/**
		 * DBC連携 c2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CST_SLS_UPRI_RANK_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_CST_SLS_UPRI_RANK_R&gt; （{@link #c2_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_CST_SLS_UPRI_RANK_R> c2;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_CST_SLS_UPRI_RANK_R> c2_down0;
		/**
		 * 連携情報 SELECT_SUB3<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_CST_DLV_R&gt; （{@link #c3}）<br>
		 */
		public final String SELECT_SUB3 = "SELECT_SUB3";

		/**
		 * DBC連携 c3<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_CST_DLV_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_CST_DLV_R&gt; （{@link #c3_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_CST_DLV_R> c3;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_CST_DLV_R> c3_down0;
		/**
		 * 連携情報 SELECT_SUB4<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SHIP_VALID_CTL_R&gt; （{@link #c4}）<br>
		 */
		public final String SELECT_SUB4 = "SELECT_SUB4";

		/**
		 * DBC連携 c4<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SHIP_VALID_CTL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SHIP_VALID_CTL_R&gt; （{@link #c4_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SHIP_VALID_CTL_R> c4;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_SHIP_VALID_CTL_R> c4_down0;
		/**
		 * 連携情報 SELECT_SUB5<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_SLO_ALLOC_GD_R&gt; （{@link #c5}）<br>
		 */
		public final String SELECT_SUB5 = "SELECT_SUB5";

		/**
		 * DBC連携 c5<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_SLO_ALLOC_GD_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_SLO_ALLOC_GD_R&gt; （{@link #c5_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_SLO_ALLOC_GD_R> c5;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_SLO_ALLOC_GD_R> c5_down0;
		/**
		 * 連携情報 SELECT_SUB6<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_EDI_IF_CTL_R&gt; （{@link #c6}）<br>
		 */
		public final String SELECT_SUB6 = "SELECT_SUB6";

		/**
		 * DBC連携 c6<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_EDI_IF_CTL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_EDI_IF_CTL_R&gt; （{@link #c6_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_EDI_IF_CTL_R> c6;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_EDI_IF_CTL_R> c6_down0;
		/**
		 * 連携情報 SELECT_SUB7<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_BP_ITM_R&gt; （{@link #c7}）<br>
		 */
		public final String SELECT_SUB7 = "SELECT_SUB7";

		/**
		 * DBC連携 c7<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_BP_ITM_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_BP_ITM_R&gt; （{@link #c7_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_BP_ITM_R> c7;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_BP_ITM_R> c7_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0540.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt2R.class);
			down2 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt3R.class);
			down3 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt4R.class);
			down4 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt5R.class);
			down5 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt6R.class);
			down6 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt7R.class);
			down7 = MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt8R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_BP_R.create("T1"));
			c1 = MCController.create(MAM_CST_USR_R.create("T1"));
			c2 = MCController.create(MAM_CST_SLS_UPRI_RANK_R.create("T1"));
			c3 = MCController.create(MAM_CST_DLV_R.create("T1"));
			c4 = MCController.create(MAM_SHIP_VALID_CTL_R.create("T1"));
			c5 = MCController.create(MAM_SLO_ALLOC_GD_R.create("T1"));
			c6 = MCController.create(MAM_EDI_IF_CTL_R.create("T1"));
			c7 = MCController.create(MAM_BP_ITM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_BP_R>)c0.down(0);
			c1_down0 = (MCList<MAM_CST_USR_R>)c1.down(0);
			c2_down0 = (MCList<MAM_CST_SLS_UPRI_RANK_R>)c2.down(0);
			c3_down0 = (MCList<MAM_CST_DLV_R>)c3.down(0);
			c4_down0 = (MCList<MAM_SHIP_VALID_CTL_R>)c4.down(0);
			c5_down0 = (MCList<MAM_SLO_ALLOC_GD_R>)c5.down(0);
			c6_down0 = (MCList<MAM_EDI_IF_CTL_R>)c6.down(0);
			c7_down0 = (MCList<MAM_BP_ITM_R>)c7.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SUB1, c1);
			appendOpe(SELECT_SUB2, c2);
			appendOpe(SELECT_SUB3, c3);
			appendOpe(SELECT_SUB4, c4);
			appendOpe(SELECT_SUB5, c5);
			appendOpe(SELECT_SUB6, c6);
			appendOpe(SELECT_SUB7, c7);
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
		 * SELECT_SUB7<br>
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
			if (key.equals(SELECT_SUB7)) {
				up_SELECT_SUB7();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_BP_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SUB1<br>
		 * MCList&lt;MAM_CST_USR_R&gt;（{@link #c1_down0}）=> down1()<br>
		 * SELECT_SUB2<br>
		 * MCList&lt;MAM_CST_SLS_UPRI_RANK_R&gt;（{@link #c2_down0}）=> down2()<br>
		 * SELECT_SUB3<br>
		 * MCList&lt;MAM_CST_DLV_R&gt;（{@link #c3_down0}）=> down3()<br>
		 * SELECT_SUB4<br>
		 * MCList&lt;MAM_SHIP_VALID_CTL_R&gt;（{@link #c4_down0}）=> down4()<br>
		 * SELECT_SUB5<br>
		 * MCList&lt;MAM_SLO_ALLOC_GD_R&gt;（{@link #c5_down0}）=> down5()<br>
		 * SELECT_SUB6<br>
		 * MCList&lt;MAM_EDI_IF_CTL_R&gt;（{@link #c6_down0}）=> down6()<br>
		 * SELECT_SUB7<br>
		 * MCList&lt;MAM_BP_ITM_R&gt;（{@link #c7_down0}）=> down7()<br>
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
			if (key.equals(SELECT_SUB7)) {
				down_SELECT_SUB7(down7(), c7_down0);
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
			if (i == 7) return down7();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_CstReg)MABCL_CstReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
			down2().clear();
			down3().clear();
			down4().clear();
			down5().clear();
			down6().clear();
			down7().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0540.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt2R.class);
		}

		/**
		 * Srch01_Rslt3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt3R createSrch01_Rslt3R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt3R.create();
		}

		/**
		 * Srch01_Rslt3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt3R> createSrch01_Rslt3L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt3R.class);
		}

		/**
		 * Srch01_Rslt4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt4R createSrch01_Rslt4R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt4R.create();
		}

		/**
		 * Srch01_Rslt4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt4R> createSrch01_Rslt4L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt4R.class);
		}

		/**
		 * Srch01_Rslt5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt5R createSrch01_Rslt5R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt5R.create();
		}

		/**
		 * Srch01_Rslt5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt5R> createSrch01_Rslt5L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt5R.class);
		}

		/**
		 * Srch01_Rslt6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt6R createSrch01_Rslt6R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt6R.create();
		}

		/**
		 * Srch01_Rslt6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt6R> createSrch01_Rslt6L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt6R.class);
		}

		/**
		 * Srch01_Rslt7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt7R createSrch01_Rslt7R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt7R.create();
		}

		/**
		 * Srch01_Rslt7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt7R> createSrch01_Rslt7L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt7R.class);
		}

		/**
		 * Srch01_Rslt8ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_Rslt8R createSrch01_Rslt8R(){
			return mcframe.serverMABC.MABCL0540.Srch01_Rslt8R.create();
		}

		/**
		 * Srch01_Rslt8ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt8R> createSrch01_Rslt8L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.Srch01_Rslt8R.class);
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
		 * @see mcframe.serverMABC.MABCL0540.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0540.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_flg</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_nm</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_nm</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_nm3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_nm3</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>bcst_nm</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ_nm</td></tr>
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
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>usr_nm</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt2R> down1() {
			return down1;
		}

		/**
		 * 下り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_nm1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_nm2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>dest_nm3</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt3R> down2() {
			return down2;
		}

		/**
		 * 下り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt4R> down3() {
			return down3;
		}

		/**
		 * 下り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>valid_days</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt5R> down4() {
			return down4;
		}

		/**
		 * 下り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_nm</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt6R> down5() {
			return down5;
		}

		/**
		 * 下り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第6ブロック項目]</caption>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt7R> down6() {
			return down6;
		}

		/**
		 * 下り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第7ブロック項目]</caption>
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
		public MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt8R> down7() {
			return down7;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CstReg)MABCL_CstReg_MC_A.this).info;
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
		//-----------------------SELECT_SUB7専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SUB7の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SUB7(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_BP_R> src0_0){
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
				addColumnPathMap("acst_flg", "acst_flg");
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("acst_nm", "acst_nm");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("ar_dpt_nm", "ar_dpt_nm");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("cst_ship_form_nm", "cst_ship_form_nm");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("stk_lst_form_nm", "stk_lst_form_nm");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_nm", "sls_tax_nm");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_nm1", "cst_tterm_nm1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_nm2", "cst_tterm_nm2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("cst_tterm_nm3", "cst_tterm_nm3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_nm1", "sls_anly_nm1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_nm2", "sls_anly_nm2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("sls_anly_nm3", "sls_anly_nm3");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("bcst_nm", "bcst_nm");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
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
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt1R r_dest, MAM_BP_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt1R> dest, MCList<MAM_BP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_BP_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB1専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB1の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB1(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_CST_USR_R> src0_0){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("usr_nm", "usr_nm");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("dpt_nm", "dpt_nm");
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
		protected void down_SELECT_SUB1_c1_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt2R r_dest, MAM_CST_USR_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB1_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB1_c1_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt2R> dest, MCList<MAM_CST_USR_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB1_c1_0();
			for(MAM_CST_USR_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB1_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB2専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB2の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB2(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt3R> dest_Srch01_Rslt3, MCList<MAM_CST_SLS_UPRI_RANK_R> src0_0){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_nm1", "dest_nm1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_nm2", "dest_nm2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("dest_nm3", "dest_nm3");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("sls_upri_rank_nm", "sls_upri_rank_nm");
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
		protected void down_SELECT_SUB2_c2_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt3R r_dest, MAM_CST_SLS_UPRI_RANK_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB2_c2の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB2_c2_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt3R> dest, MCList<MAM_CST_SLS_UPRI_RANK_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB2_c2_0();
			for(MAM_CST_SLS_UPRI_RANK_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt3R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB2_c2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB3専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB3の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB3(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt4R> dest_Srch01_Rslt4, MCList<MAM_CST_DLV_R> src0_0){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
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
		protected void down_SELECT_SUB3_c3_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt4R r_dest, MAM_CST_DLV_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB3_c3の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB3_c3_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt4R> dest, MCList<MAM_CST_DLV_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB3_c3_0();
			for(MAM_CST_DLV_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt4R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB3_c3_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB4専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB4の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB4(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt5R> dest_Srch01_Rslt5, MCList<MAM_SHIP_VALID_CTL_R> src0_0){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("ship_valid_grp_nm", "ship_valid_grp_nm");
				addColumnPathMap("valid_days", "valid_days");
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
		protected void down_SELECT_SUB4_c4_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt5R r_dest, MAM_SHIP_VALID_CTL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB4_c4の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB4_c4_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt5R> dest, MCList<MAM_SHIP_VALID_CTL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB4_c4_0();
			for(MAM_SHIP_VALID_CTL_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt5R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB4_c4_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB5専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB5の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB5(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt6R> dest_Srch01_Rslt6, MCList<MAM_SLO_ALLOC_GD_R> src0_0){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dlv_nm", "dlv_nm");
				addColumnPathMap("gd_cd", "gd_cd");
				addColumnPathMap("gd_nm", "gd_nm");
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
		protected void down_SELECT_SUB5_c5_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt6R r_dest, MAM_SLO_ALLOC_GD_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB5_c5の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB5_c5_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt6R> dest, MCList<MAM_SLO_ALLOC_GD_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB5_c5_0();
			for(MAM_SLO_ALLOC_GD_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt6R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB5_c5_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB6専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB6の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB6(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt7R> dest_Srch01_Rslt7, MCList<MAM_EDI_IF_CTL_R> src0_0){
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
		 * 連携処理SELECT_SUB6_c6の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB6_c6_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt7R r_dest, MAM_EDI_IF_CTL_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB6_c6の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB6_c6_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt7R> dest, MCList<MAM_EDI_IF_CTL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB6_c6_0();
			for(MAM_EDI_IF_CTL_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt7R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB6_c6_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SUB7専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SUB7の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SUB7(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt8R> dest_Srch01_Rslt8, MCList<MAM_BP_ITM_R> src0_0){
			down_SELECT_SUB7_c7_0(dest_Srch01_Rslt8, src0_0);
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SUB7_c7_0() {
			MCRowMapper map = new Map_down_SELECT_SUB7_c7_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SUB7_c7_0 extends MCRowMapper {
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
		 * 連携処理SELECT_SUB7_c7の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SUB7_c7_0(mcframe.serverMABC.MABCL0540.Srch01_Rslt8R r_dest, MAM_BP_ITM_R r_src) {
		}

		/**
		 * 連携処理SELECT_SUB7_c7の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SUB7_c7_0(MCList<mcframe.serverMABC.MABCL0540.Srch01_Rslt8R> dest, MCList<MAM_BP_ITM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SUB7_c7_0();
			for(MAM_BP_ITM_R r_src : src){
				mcframe.serverMABC.MABCL0540.Srch01_Rslt8R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SUB7_c7_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 得意先関連マスタの登録を行います。<br>
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
		private final MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> up1;
		/** このオペレーションへの上り電文パラメータの第2ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> up2;
		/** このオペレーションへの上り電文パラメータの第3ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> up3;
		/** このオペレーションへの上り電文パラメータの第4ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> up4;
		/** このオペレーションへの上り電文パラメータの第5ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> up5;
		/** このオペレーションへの上り電文パラメータの第6ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> up6;
		/** このオペレーションへの上り電文パラメータの第7ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up7;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0540.MABCL_CstReg.BpCst_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0540.MABCL_CstReg.BpCst_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0540.MABCL_CstReg.BpCst_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0540.MABCL_CstReg.BpCst_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0540.MABCL_CstReg.BpCst_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0540.MABCL_CstReg.BpCst_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.CstUsr_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.CstUsr_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.CstUsr_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.CstUsr_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.CstUsr_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.CstUsr_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE03<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.CstSlsUpriRank_UpdChk01 （{@link #chk03}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.CstSlsUpriRank_Upd01 （{@link #upd03}）<br>
		 */
		public final String CALL_OPE03 = "CALL_OPE03";

		/**
		 * 連携オペレーション chk03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.CstSlsUpriRank_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.CstSlsUpriRank_UpdChk01 chk03;
		/**
		 * 連携オペレーション upd03<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.CstSlsUpriRank_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.CstSlsUpriRank_Upd01 upd03;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> chk03_up0;
		public final MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> upd03_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE04<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.CstDlv_UpdChk01 （{@link #chk04}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.CstDlv_Upd01 （{@link #upd04}）<br>
		 */
		public final String CALL_OPE04 = "CALL_OPE04";

		/**
		 * 連携オペレーション chk04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.CstDlv_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.CstDlv_UpdChk01 chk04;
		/**
		 * 連携オペレーション upd04<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.CstDlv_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.CstDlv_Upd01 upd04;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> chk04_up0;
		public final MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> upd04_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE05<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.ShipValidCtl_UpdChk01 （{@link #chk05}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.ShipValidCtl_Upd01 （{@link #upd05}）<br>
		 */
		public final String CALL_OPE05 = "CALL_OPE05";

		/**
		 * 連携オペレーション chk05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.ShipValidCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.ShipValidCtl_UpdChk01 chk05;
		/**
		 * 連携オペレーション upd05<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.ShipValidCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.ShipValidCtl_Upd01 upd05;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> chk05_up0;
		public final MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> upd05_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE06<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.SloAllocGd_UpdChk01 （{@link #chk06}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.SloAllocGd_Upd01 （{@link #upd06}）<br>
		 */
		public final String CALL_OPE06 = "CALL_OPE06";

		/**
		 * 連携オペレーション chk06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.SloAllocGd_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.SloAllocGd_UpdChk01 chk06;
		/**
		 * 連携オペレーション upd06<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.SloAllocGd_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.SloAllocGd_Upd01 upd06;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> chk06_up0;
		public final MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> upd06_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE07<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01 （{@link #chk07}）<br>
		 * 連携先 mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01 （{@link #upd07}）<br>
		 */
		public final String CALL_OPE07 = "CALL_OPE07";

		/**
		 * 連携オペレーション chk07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #chk07_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_UpdChk01 chk07;
		/**
		 * 連携オペレーション upd07<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #upd07_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.EdiIfCtl_Upd01 upd07;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> chk07_up0;
		public final MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> upd07_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE08<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 （{@link #chk08}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 （{@link #upd08}）<br>
		 */
		public final String CALL_OPE08 = "CALL_OPE08";

		/**
		 * 連携オペレーション chk08<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk08_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_UpdChk01 chk08;
		/**
		 * 連携オペレーション upd08<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd08_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.BpItm_Upd01 upd08;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> chk08_up0;
		public final MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> upd08_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR.class);
			up2 = MCList.create(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR.class);
			up3 = MCList.create(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR.class);
			up4 = MCList.create(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR.class);
			up5 = MCList.create(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR.class);
			up6 = MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
			up7 = MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0540.MABCL_CstReg.crtBpCst_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0540.MABCL_CstReg.crtBpCst_Upd01();
			chk02 = mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.crtCstUsr_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0650.MABSL_CstUsrReg.crtCstUsr_Upd01();
			chk03 = mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.crtCstSlsUpriRank_UpdChk01();
			upd03 = mcframe.serverMABS.MABSL0230.MABSL_CstSlsUpriRankReg.crtCstSlsUpriRank_Upd01();
			chk04 = mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.crtCstDlv_UpdChk01();
			upd04 = mcframe.serverMABS.MABSL0660.MABSL_CstDlvReg.crtCstDlv_Upd01();
			chk05 = mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.crtShipValidCtl_UpdChk01();
			upd05 = mcframe.serverMABS.MABSL0480.MABSL_ShipValidCtlReg.crtShipValidCtl_Upd01();
			chk06 = mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.crtSloAllocGd_UpdChk01();
			upd06 = mcframe.serverMABS.MABSL0520.MABSL_SloAllocGdReg.crtSloAllocGd_Upd01();
			chk07 = mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.crtEdiIfCtl_UpdChk01();
			upd07 = mcframe.serverMABS.MABSL1230.MABSL_EdiIfCtlReg.crtEdiIfCtl_Upd01();
			chk08 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_UpdChk01();
			upd08 = mcframe.serverMABS.MABSL0640.MABSL_BpItmReg.crtBpItm_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR>)upd02.up(0);
			chk03_up0 = (MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR>)chk03.up(0);
			upd03_up0 = (MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR>)upd03.up(0);
			chk04_up0 = (MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR>)chk04.up(0);
			upd04_up0 = (MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR>)upd04.up(0);
			chk05_up0 = (MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR>)chk05.up(0);
			upd05_up0 = (MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR>)upd05.up(0);
			chk06_up0 = (MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR>)chk06.up(0);
			upd06_up0 = (MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR>)upd06.up(0);
			chk07_up0 = (MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR>)chk07.up(0);
			upd07_up0 = (MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR>)upd07.up(0);
			chk08_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)chk08.up(0);
			upd08_up0 = (MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR>)upd08.up(0);

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
			appendOpe(CALL_OPE08, chk08);
			appendOpe(CALL_OPE08, upd08);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 * CALL_OPE03<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR&gt; （{@link #chk03_up0}）<br>
		 * up2() => MCList&lt;mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR&gt; （{@link #upd03_up0}）<br>
		 * CALL_OPE04<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR&gt; （{@link #chk04_up0}）<br>
		 * up3() => MCList&lt;mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR&gt; （{@link #upd04_up0}）<br>
		 * CALL_OPE05<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR&gt; （{@link #chk05_up0}）<br>
		 * up4() => MCList&lt;mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR&gt; （{@link #upd05_up0}）<br>
		 * CALL_OPE06<br>
		 * up5() => MCList&lt;mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR&gt; （{@link #chk06_up0}）<br>
		 * up5() => MCList&lt;mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR&gt; （{@link #upd06_up0}）<br>
		 * CALL_OPE07<br>
		 * up6() => MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #chk07_up0}）<br>
		 * up6() => MCList&lt;mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR&gt; （{@link #upd07_up0}）<br>
		 * CALL_OPE08<br>
		 * up7() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #chk08_up0}）<br>
		 * up7() => MCList&lt;mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR&gt; （{@link #upd08_up0}）<br>
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
			if (key.equals(CALL_OPE08)) {
				up_CALL_OPE08(chk08_up0, upd08_up0, up7());
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
		 * CALL_OPE08<br>
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
			if (key.equals(CALL_OPE08)) {
				down_CALL_OPE08();
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
			if (i == 7) return up7();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABCL_CstReg)MABCL_CstReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl3ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR createUpd01_Dtl3R(){
			return mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl3ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> createUpd01_Dtl3L(){
			return MCList.create(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl4ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR createUpd01_Dtl4R(){
			return mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl4ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> createUpd01_Dtl4L(){
			return MCList.create(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl5ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR createUpd01_Dtl5R(){
			return mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl5ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> createUpd01_Dtl5L(){
			return MCList.create(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl6ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR createUpd01_Dtl6R(){
			return mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl6ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> createUpd01_Dtl6L(){
			return MCList.create(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl7ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR createUpd01_Dtl7R(){
			return mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl7ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> createUpd01_Dtl7L(){
			return MCList.create(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl8ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR createUpd01_Dtl8R(){
			return mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl8ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> createUpd01_Dtl8L(){
			return MCList.create(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>bp_cd</td></tr>
		 * 	<tr><td><br></td><td>acst_cd</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_typ</td></tr>
		 * 	<tr><td><br></td><td>ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>check_ar_dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_dpt</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn</td></tr>
		 * 	<tr><td><br></td><td>cst_cntct_psn_title</td></tr>
		 * 	<tr><td><br></td><td>cst_sundry_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_req_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_amt_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_calc_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_rnd_typ</td></tr>
		 * 	<tr><td><br></td><td>sls_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>ship_schd_split_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_basis_typ</td></tr>
		 * 	<tr><td><br></td><td>bill_crryovr_times</td></tr>
		 * 	<tr><td><br></td><td>lot_back_stop_typ</td></tr>
		 * 	<tr><td><br></td><td>slip_each_lot_typ</td></tr>
		 * 	<tr><td><br></td><td>cst_ship_form_cd</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_issue_flg</td></tr>
		 * 	<tr><td><br></td><td>stk_lst_form_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd</td></tr>
		 * 	<tr><td><br></td><td>sls_tax_cd_prio_flg</td></tr>
		 * 	<tr><td><br></td><td>wrk_ar_flg</td></tr>
		 * 	<tr><td><br></td><td>cst_iv_flg</td></tr>
		 * 	<tr><td><br></td><td>ship_lt</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd1</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd2</td></tr>
		 * 	<tr><td><br></td><td>cst_tterm_cd3</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd1</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd2</td></tr>
		 * 	<tr><td><br></td><td>sls_anly_cd3</td></tr>
		 * 	<tr><td><br></td><td>bcst_flg</td></tr>
		 * 	<tr><td><br></td><td>bcst_cd</td></tr>
		 * 	<tr><td><br></td><td>cst_prnt_typ</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * 	<tr><td><br></td><td>not_lg_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>not_sublot_mix_flg</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>usr_cd</td></tr>
		 * 	<tr><td><br></td><td>dpt_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> up1() {
			return up1;
		}

		/**
		 * 上り電文の第2ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第2ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>dest_cd1</td></tr>
		 * 	<tr><td><br></td><td>dest_cd2</td></tr>
		 * 	<tr><td><br></td><td>dest_cd3</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>sls_upri_rank_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> up2() {
			return up2;
		}

		/**
		 * 上り電文の第3ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第3ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> up3() {
			return up3;
		}

		/**
		 * 上り電文の第4ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第4ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>valid_days</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> up4() {
			return up4;
		}

		/**
		 * 上り電文の第5ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第5ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cst_cd</td></tr>
		 * 	<tr><td><br></td><td>dlv_cd</td></tr>
		 * 	<tr><td><br></td><td>gd_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> up5() {
			return up5;
		}

		/**
		 * 上り電文の第6ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第6ブロック項目]</caption>
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
		public MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> up6() {
			return up6;
		}

		/**
		 * 上り電文の第7ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第7ブロック項目]</caption>
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
		public MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> up7() {
			return up7;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_CstReg)MABCL_CstReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("check_ar_dpt_cd", "check_ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_flg", "bcst_flg");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("acst_cd", "acst_cd");
				addColumnPathMap("ar_dpt_typ", "ar_dpt_typ");
				addColumnPathMap("ar_dpt_cd", "ar_dpt_cd");
				addColumnPathMap("cst_cntct_dpt", "cst_cntct_dpt");
				addColumnPathMap("cst_cntct_psn", "cst_cntct_psn");
				addColumnPathMap("cst_cntct_psn_title", "cst_cntct_psn_title");
				addColumnPathMap("cst_sundry_flg", "cst_sundry_flg");
				addColumnPathMap("sls_upri_req_typ", "sls_upri_req_typ");
				addColumnPathMap("sls_upri_cng_flg", "sls_upri_cng_flg");
				addColumnPathMap("sls_upri_rnd_typ", "sls_upri_rnd_typ");
				addColumnPathMap("sls_amt_rnd_typ", "sls_amt_rnd_typ");
				addColumnPathMap("sls_tax_calc_typ", "sls_tax_calc_typ");
				addColumnPathMap("sls_tax_rnd_typ", "sls_tax_rnd_typ");
				addColumnPathMap("sls_basis_typ", "sls_basis_typ");
				addColumnPathMap("ship_schd_split_typ", "ship_schd_split_typ");
				addColumnPathMap("bill_basis_typ", "bill_basis_typ");
				addColumnPathMap("bill_crryovr_times", "bill_crryovr_times");
				addColumnPathMap("lot_back_stop_typ", "lot_back_stop_typ");
				addColumnPathMap("slip_each_lot_typ", "slip_each_lot_typ");
				addColumnPathMap("cst_ship_form_cd", "cst_ship_form_cd");
				addColumnPathMap("stk_lst_issue_flg", "stk_lst_issue_flg");
				addColumnPathMap("stk_lst_form_cd", "stk_lst_form_cd");
				addColumnPathMap("sls_tax_cd", "sls_tax_cd");
				addColumnPathMap("sls_tax_cd_prio_flg", "sls_tax_cd_prio_flg");
				addColumnPathMap("wrk_ar_flg", "wrk_ar_flg");
				addColumnPathMap("cst_iv_flg", "cst_iv_flg");
				addColumnPathMap("ship_lt", "ship_lt");
				addColumnPathMap("cst_tterm_cd1", "cst_tterm_cd1");
				addColumnPathMap("cst_tterm_cd2", "cst_tterm_cd2");
				addColumnPathMap("cst_tterm_cd3", "cst_tterm_cd3");
				addColumnPathMap("sls_anly_cd1", "sls_anly_cd1");
				addColumnPathMap("sls_anly_cd2", "sls_anly_cd2");
				addColumnPathMap("sls_anly_cd3", "sls_anly_cd3");
				addColumnPathMap("bcst_cd", "bcst_cd");
				addColumnPathMap("cst_prnt_typ", "cst_prnt_typ");
				addColumnPathMap("upd_cntr", "upd_cntr");
				addColumnPathMap("not_lg_mix_flg", "not_lg_mix_flg");
				addColumnPathMap("not_lot_mix_flg", "not_lot_mix_flg");
				addColumnPathMap("not_sublot_mix_flg", "not_sublot_mix_flg");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0540.BpCst_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("usr_cd", "usr_cd");
				addColumnPathMap("dpt_cd", "dpt_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0650.CstUsr_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE03専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE03の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE03(MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> src_Upd01_Dtl3){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_chk03_0(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_chk03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_chk03_0(MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_chk03_0();
			for(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("dest_cd1", "dest_cd1");
				addColumnPathMap("dest_cd2", "dest_cd2");
				addColumnPathMap("dest_cd3", "dest_cd3");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("sls_upri_rank_cd", "sls_upri_rank_cd");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE03_upd03_0(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE03_upd03の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE03_upd03_0(MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE03_upd03_0();
			for(mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0230.CstSlsUpriRank_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE03_upd03_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE04専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE04の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE04(MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> src_Upd01_Dtl4){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
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
		protected void up_CALL_OPE04_chk04_0(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_chk04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_chk04_0(MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_chk04_0();
			for(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
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
		protected void up_CALL_OPE04_upd04_0(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE04_upd04の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE04_upd04_0(MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE04_upd04_0();
			for(mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0660.CstDlv_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE04_upd04_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE05専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE05の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE05(MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> src_Upd01_Dtl5){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("valid_days", "valid_days");
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
		protected void up_CALL_OPE05_chk05_0(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_chk05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_chk05_0(MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_chk05_0();
			for(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("ship_valid_grp_cd", "ship_valid_grp_cd");
				addColumnPathMap("valid_days", "valid_days");
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
		protected void up_CALL_OPE05_upd05_0(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE05_upd05の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE05_upd05_0(MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE05_upd05_0();
			for(mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0480.ShipValidCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE05_upd05_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE06専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE06の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE06(MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> src_Upd01_Dtl6){
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("gd_cd", "gd_cd");
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
		protected void up_CALL_OPE06_chk06_0(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_chk06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_chk06_0(MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_chk06_0();
			for(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cst_cd", "cst_cd");
				addColumnPathMap("dlv_cd", "dlv_cd");
				addColumnPathMap("gd_cd", "gd_cd");
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
		protected void up_CALL_OPE06_upd06_0(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE06_upd06の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE06_upd06_0(MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE06_upd06_0();
			for(mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0520.SloAllocGd_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE06_upd06_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE07専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE07の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE07(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src_Upd01_Dtl7){
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
		 * 連携処理CALL_OPE07_chk07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE07_chk07_0(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE07_chk07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE07_chk07_0(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE07_chk07_0();
			for(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
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
		 * 連携処理CALL_OPE07_upd07の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE07_upd07_0(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE07_upd07の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE07_upd07_0(MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE07_upd07_0();
			for(mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL1230.EdiIfCtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE07_upd07_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE08専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE08の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE08(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src_Upd01_Dtl8){
			up_CALL_OPE08_chk08_0(dest0_0, src_Upd01_Dtl8);
			up_CALL_OPE08_upd08_0(dest1_0, src_Upd01_Dtl8);
		}
		
		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE08_chk08_0() {
			MCRowMapper map = new Map_up_CALL_OPE08_chk08_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE08_chk08_0 extends MCRowMapper {
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
		 * 連携処理CALL_OPE08_chk08の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE08_chk08_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE08_chk08の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE08_chk08_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE08_chk08_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE08_chk08_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE08_upd08_0() {
			MCRowMapper map = new Map_up_CALL_OPE08_upd08_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE08_upd08_0 extends MCRowMapper {
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
		 * 連携処理CALL_OPE08_upd08の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE08_upd08_0(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE08_upd08の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE08_upd08_0(MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE08_upd08_0();
			for(mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0640.BpItm_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE08_upd08_0(r_dest, r_src);
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
		//-----------------------CALL_OPE08専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE08の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE08(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}