package mcframe.serverMABG.MABGL0180;

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
 * "MABGL_CostSlsReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGL_CostSlsReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABGL0180";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABGL_CostSlsReg.CostSls_UpdChk01 aCostSls_UpdChk01;

	protected void initCostSls_UpdChk01() {
		this.info = PDef.MA_MABGL0180_CostSls_UpdChk01_INFO;
		this.aCostSls_UpdChk01 = ((MABGL_CostSlsReg)this).new CostSls_UpdChk01();
	}

	public static MABGL_CostSlsReg.CostSls_UpdChk01 crtCostSls_UpdChk01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initCostSls_UpdChk01();
		return lgc.aCostSls_UpdChk01;
	}

	protected void paramCostSls_UpdChk01(MCParam p) {
		if (this.aCostSls_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostSls_UpdChk01.up0());
	}

	protected void doCostSls_UpdChk01() {
		aCostSls_UpdChk01.call();
	};

	/**
	 * CostSls_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR createCostSls_UpdChk01_DtlR(){
		return mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.create();
	}

	/**
	 * CostSls_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> createCostSls_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.CostSls_Upd01 aCostSls_Upd01;

	protected void initCostSls_Upd01() {
		this.info = PDef.MA_MABGL0180_CostSls_Upd01_INFO;
		this.aCostSls_Upd01 = ((MABGL_CostSlsReg)this).new CostSls_Upd01();
	}

	public static MABGL_CostSlsReg.CostSls_Upd01 crtCostSls_Upd01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initCostSls_Upd01();
		return lgc.aCostSls_Upd01;
	}

	protected void paramCostSls_Upd01(MCParam p) {
		if (this.aCostSls_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostSls_Upd01.up0());
	}

	protected void doCostSls_Upd01() {
		aCostSls_Upd01.call();
	};

	/**
	 * CostSls_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR createCostSls_Upd01_DtlR(){
		return mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.create();
	}

	/**
	 * CostSls_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> createCostSls_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.CostSlsLcl_UpdChk01 aCostSlsLcl_UpdChk01;

	protected void initCostSlsLcl_UpdChk01() {
		this.info = PDef.MA_MABGL0180_CostSlsLcl_UpdChk01_INFO;
		this.aCostSlsLcl_UpdChk01 = ((MABGL_CostSlsReg)this).new CostSlsLcl_UpdChk01();
	}

	public static MABGL_CostSlsReg.CostSlsLcl_UpdChk01 crtCostSlsLcl_UpdChk01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initCostSlsLcl_UpdChk01();
		return lgc.aCostSlsLcl_UpdChk01;
	}

	protected void paramCostSlsLcl_UpdChk01(MCParam p) {
		if (this.aCostSlsLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostSlsLcl_UpdChk01.up0());
	}

	protected void doCostSlsLcl_UpdChk01() {
		aCostSlsLcl_UpdChk01.call();
	};

	/**
	 * CostSlsLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR createCostSlsLcl_UpdChk01_DtlR(){
		return mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CostSlsLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> createCostSlsLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.CostSlsLcl_Upd01 aCostSlsLcl_Upd01;

	protected void initCostSlsLcl_Upd01() {
		this.info = PDef.MA_MABGL0180_CostSlsLcl_Upd01_INFO;
		this.aCostSlsLcl_Upd01 = ((MABGL_CostSlsReg)this).new CostSlsLcl_Upd01();
	}

	public static MABGL_CostSlsReg.CostSlsLcl_Upd01 crtCostSlsLcl_Upd01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initCostSlsLcl_Upd01();
		return lgc.aCostSlsLcl_Upd01;
	}

	protected void paramCostSlsLcl_Upd01(MCParam p) {
		if (this.aCostSlsLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostSlsLcl_Upd01.up0());
	}

	protected void doCostSlsLcl_Upd01() {
		aCostSlsLcl_Upd01.call();
	};

	/**
	 * CostSlsLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR createCostSlsLcl_Upd01_DtlR(){
		return mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.create();
	}

	/**
	 * CostSlsLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> createCostSlsLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.CostSls_DelChk01 aCostSls_DelChk01;

	protected void initCostSls_DelChk01() {
		this.info = PDef.MA_MABGL0180_CostSls_DelChk01_INFO;
		this.aCostSls_DelChk01 = ((MABGL_CostSlsReg)this).new CostSls_DelChk01();
	}

	public static MABGL_CostSlsReg.CostSls_DelChk01 crtCostSls_DelChk01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initCostSls_DelChk01();
		return lgc.aCostSls_DelChk01;
	}

	protected void paramCostSls_DelChk01(MCParam p) {
		if (this.aCostSls_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostSls_DelChk01.up0());
	}

	protected void doCostSls_DelChk01() {
		aCostSls_DelChk01.call();
	};

	/**
	 * CostSls_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR createCostSls_DelChk01_DtlR(){
		return mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.create();
	}

	/**
	 * CostSls_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> createCostSls_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.CostSls_Del01 aCostSls_Del01;

	protected void initCostSls_Del01() {
		this.info = PDef.MA_MABGL0180_CostSls_Del01_INFO;
		this.aCostSls_Del01 = ((MABGL_CostSlsReg)this).new CostSls_Del01();
	}

	public static MABGL_CostSlsReg.CostSls_Del01 crtCostSls_Del01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initCostSls_Del01();
		return lgc.aCostSls_Del01;
	}

	protected void paramCostSls_Del01(MCParam p) {
		if (this.aCostSls_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aCostSls_Del01.up0());
	}

	protected void doCostSls_Del01() {
		aCostSls_Del01.call();
	};

	/**
	 * CostSls_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR createCostSls_Del01_DtlR(){
		return mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.create();
	}

	/**
	 * CostSls_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> createCostSls_Del01_DtlL(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABGL0180_Srch01_INFO;
		this.aSrch01 = ((MABGL_CostSlsReg)this).new Srch01();
	}

	public static MABGL_CostSlsReg.Srch01 crtSrch01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
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
	 * Srch01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABG.MABGL0180.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABG.MABGL0180.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABG.MABGL0180.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABG.MABGL0180.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABG.MABGL0180.Srch01_Rslt2R.class);
	}
	protected MABGL_CostSlsReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABGL0180_Upd01_INFO;
		this.aUpd01 = ((MABGL_CostSlsReg)this).new Upd01();
	}

	public static MABGL_CostSlsReg.Upd01 crtUpd01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
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
	}

	protected void doUpd01() {
		aUpd01.call();
	};

	/**
	 * Upd01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);
	}
	protected MABGL_CostSlsReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABGL0180_Del01_INFO;
		this.aDel01 = ((MABGL_CostSlsReg)this).new Del01();
	}

	public static MABGL_CostSlsReg.Del01 crtDel01() {
		MABGL_CostSlsReg lgc = new MABGL_CostSlsReg();
		lgc.initDel01();
		return lgc.aDel01;
	}

	protected void paramDel01(MCParam p) {
		if (this.aDel01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aDel01.up0());
	}

	protected void doDel01() {
		aDel01.call();
	};

	/**
	 * Del01_Dtl1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * CostSls_UpdChk01オペレーション.<p>
	 *
	 * 原価売上分類マスタを登録する前のチェックを行う<br>
	 */
	abstract public class CostSls_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostSls_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CostSls_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);

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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostSls_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR createCostSls_UpdChk01_DtlR(){
			return mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.create();
		}

		/**
		 * CostSls_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> createCostSls_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}


	}
	/**
	 * CostSls_Upd01オペレーション.<p>
	 *
	 * 原価売上分類マスタを登録する<br>
	 */
	abstract public class CostSls_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostSls_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_SLS_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_SLS_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostSls_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_COST_SLS_R.create("T1"));
			chkMaster = MCController.create(MAM_COST_SLS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_COST_SLS_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_COST_SLS_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_SLS_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_COST_SLS_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostSls_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR createCostSls_Upd01_DtlR(){
			return mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.create();
		}

		/**
		 * CostSls_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> createCostSls_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_SLS_R> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src_CostSls_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CostSls_Upd01_Dtl);
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_COST_SLS_R r_dest, mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_COST_SLS_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src : src){
				MAM_COST_SLS_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_COST_SLS_R> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src_CostSls_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CostSls_Upd01_Dtl);
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_COST_SLS_R r_dest, mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_COST_SLS_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src : src){
				MAM_COST_SLS_R r_dest = dest.createRow();
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
	 * CostSlsLcl_UpdChk01オペレーション.<p>
	 *
	 * 原価売上分類マスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class CostSlsLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostSlsLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_COST_SLS_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostSlsLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_COST_SLS_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_COST_SLS_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_COST_SLS_R&gt; （{@link #chk01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(EXISTS)) {
				up_EXISTS(chk01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * EXISTS<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(EXISTS)) {
				down_EXISTS();
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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostSlsLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR createCostSlsLcl_UpdChk01_DtlR(){
			return mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CostSlsLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> createCostSlsLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_COST_SLS_R> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src_CostSlsLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_CostSlsLcl_UpdChk01_Dtl);
		}
		
		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_EXISTS_chk01_0() {
			MCRowMapper map = new Map_up_EXISTS_chk01_0();
			return map;
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_EXISTS_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_COST_SLS_R r_dest, mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_COST_SLS_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_SLS_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_EXISTS_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------EXISTS専用down関連メソッド--------------------------

		/**
		 * オペレーショングループEXISTSの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_EXISTS(){
		}
	}
	/**
	 * CostSlsLcl_Upd01オペレーション.<p>
	 *
	 * 原価売上分類マスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class CostSlsLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostSlsLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_SLS_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_COST_SLS_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostSlsLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_COST_SLS_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_COST_SLS_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_COST_SLS_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_COST_SLS_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostSlsLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR createCostSlsLcl_Upd01_DtlR(){
			return mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.create();
		}

		/**
		 * CostSlsLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> createCostSlsLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_SLS_LCL_R> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src_CostSlsLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_CostSlsLcl_Upd01_Dtl);
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster_0(MAM_COST_SLS_LCL_R r_dest, mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_COST_SLS_LCL_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_SLS_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_COST_SLS_LCL_R> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src_CostSlsLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_CostSlsLcl_Upd01_Dtl);
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_COST_SLS_LCL_R r_dest, mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_COST_SLS_LCL_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src : src){
				MAM_COST_SLS_LCL_R r_dest = dest.createRow();
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
	 * CostSls_DelChk01オペレーション.<p>
	 *
	 * 原価売上分類マスタ、原価売上分類マスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class CostSls_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostSls_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected CostSls_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);

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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostSls_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR createCostSls_DelChk01_DtlR(){
			return mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.create();
		}

		/**
		 * CostSls_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> createCostSls_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}


	}
	/**
	 * CostSls_Del01オペレーション.<p>
	 *
	 * 原価売上分類マスタ、原価売上分類マスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class CostSls_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "CostSls_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_COST_SLS_R> updMaster1_up0;
		public final MCList<MAM_COST_SLS_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected CostSls_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_COST_SLS_R.create("T1"));
			updMaster2 = MCController.create(MAM_COST_SLS_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_COST_SLS_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_COST_SLS_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_COST_SLS_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, updMaster2_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * UPDATE<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(UPDATE)) {
				down_UPDATE();
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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * CostSls_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR createCostSls_Del01_DtlR(){
			return mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.create();
		}

		/**
		 * CostSls_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> createCostSls_Del01_DtlL(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_COST_SLS_R> dest0_0, MCList<MAM_COST_SLS_LCL_R> dest1_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> src_CostSls_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_CostSls_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_CostSls_Del01_Dtl);
		}
		
		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster1_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster1_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_COST_SLS_R r_dest, mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_COST_SLS_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src : src){
				MAM_COST_SLS_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_UPDATE_updMaster2_0() {
			MCRowMapper map = new Map_up_UPDATE_updMaster2_0();
			return map;
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_UPDATE_updMaster2_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_COST_SLS_LCL_R r_dest, mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_COST_SLS_LCL_R> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src : src){
				MAM_COST_SLS_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster2_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------UPDATE専用down関連メソッド--------------------------

		/**
		 * オペレーショングループUPDATEの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_UPDATE(){
		}
	}
	/**
	 * Srch01オペレーション.<p>
	 *
	 * 検索処理を行う<br>
	 */
	abstract public class Srch01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLSearcher {
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
		private final mcframe.serverMABG.MABGL0180.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_COST_SLS_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_COST_SLS_R> c0_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_COST_SLS_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_COST_SLS_LCL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_COST_SLS_LCL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_COST_SLS_LCL_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABG.MABGL0180.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABG.MABGL0180.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABG.MABGL0180.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_COST_SLS_R.create("T1"));
			c1 = MCController.create(MAM_COST_SLS_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_COST_SLS_R>)c0.down(0);
			c1_down0 = (MCList<MAM_COST_SLS_LCL_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_LCL, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_LCL<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_LCL)) {
				up_SELECT_LCL();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_COST_SLS_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_COST_SLS_LCL_R&gt;（{@link #c1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_LCL)) {
				down_SELECT_LCL(down1(), c1_down0);
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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
			down1().clear();
		}
		/**
		 * Srch01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABG.MABGL0180.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABG.MABGL0180.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABG.MABGL0180.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABG.MABGL0180.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABG.MABGL0180.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABG.MABGL0180.Srch01_CndR
		 */
		public mcframe.serverMABG.MABGL0180.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
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
		public MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
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
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_LCL専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_LCLの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_LCL(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_COST_SLS_R> src0_0){
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
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("cost_sls_nm_lcl", "cost_sls_nm");
				addColumnPathMap("cost_sls_nm", "base_cost_sls_nm");
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
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABG.MABGL0180.Srch01_Rslt1R r_dest, MAM_COST_SLS_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt1R> dest, MCList<MAM_COST_SLS_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_COST_SLS_R r_src : src){
				mcframe.serverMABG.MABGL0180.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_COST_SLS_LCL_R> src0_0){
			down_SELECT_LCL_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_LCL_c1_0() {
			MCRowMapper map = new Map_down_SELECT_LCL_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_LCL_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
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
			}
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_LCL_c1_0(mcframe.serverMABG.MABGL0180.Srch01_Rslt2R r_dest, MAM_COST_SLS_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c1_0(MCList<mcframe.serverMABG.MABGL0180.Srch01_Rslt2R> dest, MCList<MAM_COST_SLS_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c1_0();
			for(MAM_COST_SLS_LCL_R r_src : src){
				mcframe.serverMABG.MABGL0180.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_LCL_c1_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}
	/**
	 * Upd01オペレーション.<p>
	 *
	 * 登録処理を行う<br>
	 */
	abstract public class Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
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
		private final MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSlsLcl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSlsLcl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSlsLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSlsLcl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSlsLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSlsLcl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.crtCostSls_UpdChk01();
			upd01 = mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.crtCostSls_Upd01();
			chk02 = mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.crtCostSlsLcl_UpdChk01();
			upd02 = mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.crtCostSlsLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk02);
			appendOpe(CALL_OPE02, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk02_up0, upd02_up0, up1());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 * CALL_OPE02<br>
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
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			if (i == 1) return up1();
			return null;
		}
		
		public MCContainer down(int i) {
			return null;
		}

		public void exec() {
			clear();
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_dest, mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src : src){
				mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_dest, mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_src : src){
				mcframe.serverMABG.MABGL0180.CostSls_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_dest, mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("cost_sls_nm", "cost_sls_nm");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_dest, mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABG.MABGL0180.CostSlsLcl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_upd02_0(r_dest, r_src);
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
	}
	/**
	 * Del01オペレーション.<p>
	 *
	 * 削除処理を行う<br>
	 */
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.CostSls_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.crtCostSls_DelChk01();
			del01 = mcframe.serverMABG.MABGL0180.MABGL_CostSlsReg.crtCostSls_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk01_up0, del01_up0, up0());
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * CALL_OPE01<br>
		 * （下りブロック定義なし）<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(CALL_OPE01)) {
				down_CALL_OPE01();
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
			invoke((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cost_sls_typ</td></tr>
		 * 	<tr><td><br></td><td>cost_sls_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABGL_CostSlsReg)MABGL_CostSlsReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> src_Del01_Dtl1){
			up_CALL_OPE01_chk01_0(dest0_0, src_Del01_Dtl1);
			up_CALL_OPE01_del01_0(dest1_0, src_Del01_Dtl1);
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
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_dest, mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src : src){
				mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		
		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_del01_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_del01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_del01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("cost_sls_typ", "cost_sls_typ");
				addColumnPathMap("cost_sls_cd", "cost_sls_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_dest, mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> dest, MCList<mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_src : src){
				mcframe.serverMABG.MABGL0180.CostSls_DelChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_del01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}

		//-----------------------CALL_OPE01専用down関連メソッド--------------------------

		/**
		 * オペレーショングループCALL_OPE01の連携処理の下りブロックを準備する。<p>
		 */
		protected void down_CALL_OPE01(){
		}
	}

	//FMCB LOGIC_CONTROLLER END
}