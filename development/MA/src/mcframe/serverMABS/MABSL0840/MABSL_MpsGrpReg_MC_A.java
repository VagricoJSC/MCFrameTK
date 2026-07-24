package mcframe.serverMABS.MABSL0840;

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
 * "MABSL_MpsGrpReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_MpsGrpReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * ロジックID<p>
	 *
	 * ロジックはモジュールIDとロジックIDで一意に特定できます。<br>
	 * ロジックインスタンスもしくはオペレーションインスタンスから参照する場合には{@link #getLogicID()}を使用してください。
	 */
	public static final String LOGIC_ID = "MABSL0840";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_MpsGrpReg.MpsGrp_UpdChk01 aMpsGrp_UpdChk01;

	protected void initMpsGrp_UpdChk01() {
		this.info = PDef.MA_MABSL0840_MpsGrp_UpdChk01_INFO;
		this.aMpsGrp_UpdChk01 = ((MABSL_MpsGrpReg)this).new MpsGrp_UpdChk01();
	}

	public static MABSL_MpsGrpReg.MpsGrp_UpdChk01 crtMpsGrp_UpdChk01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
		lgc.initMpsGrp_UpdChk01();
		return lgc.aMpsGrp_UpdChk01;
	}

	protected void paramMpsGrp_UpdChk01(MCParam p) {
		if (this.aMpsGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMpsGrp_UpdChk01.up0());
	}

	protected void doMpsGrp_UpdChk01() {
		aMpsGrp_UpdChk01.call();
	};

	/**
	 * MpsGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR createMpsGrp_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.create();
	}

	/**
	 * MpsGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> createMpsGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.MpsGrp_Upd01 aMpsGrp_Upd01;

	protected void initMpsGrp_Upd01() {
		this.info = PDef.MA_MABSL0840_MpsGrp_Upd01_INFO;
		this.aMpsGrp_Upd01 = ((MABSL_MpsGrpReg)this).new MpsGrp_Upd01();
	}

	public static MABSL_MpsGrpReg.MpsGrp_Upd01 crtMpsGrp_Upd01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
		lgc.initMpsGrp_Upd01();
		return lgc.aMpsGrp_Upd01;
	}

	protected void paramMpsGrp_Upd01(MCParam p) {
		if (this.aMpsGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMpsGrp_Upd01.up0());
	}

	protected void doMpsGrp_Upd01() {
		aMpsGrp_Upd01.call();
	};

	/**
	 * MpsGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR createMpsGrp_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.create();
	}

	/**
	 * MpsGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> createMpsGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.MpsGrpLcl_UpdChk01 aMpsGrpLcl_UpdChk01;

	protected void initMpsGrpLcl_UpdChk01() {
		this.info = PDef.MA_MABSL0840_MpsGrpLcl_UpdChk01_INFO;
		this.aMpsGrpLcl_UpdChk01 = ((MABSL_MpsGrpReg)this).new MpsGrpLcl_UpdChk01();
	}

	public static MABSL_MpsGrpReg.MpsGrpLcl_UpdChk01 crtMpsGrpLcl_UpdChk01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
		lgc.initMpsGrpLcl_UpdChk01();
		return lgc.aMpsGrpLcl_UpdChk01;
	}

	protected void paramMpsGrpLcl_UpdChk01(MCParam p) {
		if (this.aMpsGrpLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMpsGrpLcl_UpdChk01.up0());
	}

	protected void doMpsGrpLcl_UpdChk01() {
		aMpsGrpLcl_UpdChk01.call();
	};

	/**
	 * MpsGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR createMpsGrpLcl_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * MpsGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> createMpsGrpLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.MpsGrpLcl_Upd01 aMpsGrpLcl_Upd01;

	protected void initMpsGrpLcl_Upd01() {
		this.info = PDef.MA_MABSL0840_MpsGrpLcl_Upd01_INFO;
		this.aMpsGrpLcl_Upd01 = ((MABSL_MpsGrpReg)this).new MpsGrpLcl_Upd01();
	}

	public static MABSL_MpsGrpReg.MpsGrpLcl_Upd01 crtMpsGrpLcl_Upd01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
		lgc.initMpsGrpLcl_Upd01();
		return lgc.aMpsGrpLcl_Upd01;
	}

	protected void paramMpsGrpLcl_Upd01(MCParam p) {
		if (this.aMpsGrpLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMpsGrpLcl_Upd01.up0());
	}

	protected void doMpsGrpLcl_Upd01() {
		aMpsGrpLcl_Upd01.call();
	};

	/**
	 * MpsGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR createMpsGrpLcl_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * MpsGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> createMpsGrpLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.MpsGrp_DelChk01 aMpsGrp_DelChk01;

	protected void initMpsGrp_DelChk01() {
		this.info = PDef.MA_MABSL0840_MpsGrp_DelChk01_INFO;
		this.aMpsGrp_DelChk01 = ((MABSL_MpsGrpReg)this).new MpsGrp_DelChk01();
	}

	public static MABSL_MpsGrpReg.MpsGrp_DelChk01 crtMpsGrp_DelChk01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
		lgc.initMpsGrp_DelChk01();
		return lgc.aMpsGrp_DelChk01;
	}

	protected void paramMpsGrp_DelChk01(MCParam p) {
		if (this.aMpsGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMpsGrp_DelChk01.up0());
	}

	protected void doMpsGrp_DelChk01() {
		aMpsGrp_DelChk01.call();
	};

	/**
	 * MpsGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR createMpsGrp_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.create();
	}

	/**
	 * MpsGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> createMpsGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.MpsGrp_Del01 aMpsGrp_Del01;

	protected void initMpsGrp_Del01() {
		this.info = PDef.MA_MABSL0840_MpsGrp_Del01_INFO;
		this.aMpsGrp_Del01 = ((MABSL_MpsGrpReg)this).new MpsGrp_Del01();
	}

	public static MABSL_MpsGrpReg.MpsGrp_Del01 crtMpsGrp_Del01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
		lgc.initMpsGrp_Del01();
		return lgc.aMpsGrp_Del01;
	}

	protected void paramMpsGrp_Del01(MCParam p) {
		if (this.aMpsGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aMpsGrp_Del01.up0());
	}

	protected void doMpsGrp_Del01() {
		aMpsGrp_Del01.call();
	};

	/**
	 * MpsGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR createMpsGrp_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.create();
	}

	/**
	 * MpsGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> createMpsGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0840_Srch01_INFO;
		this.aSrch01 = ((MABSL_MpsGrpReg)this).new Srch01();
	}

	public static MABSL_MpsGrpReg.Srch01 crtSrch01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
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
	public mcframe.serverMABS.MABSL0840.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0840.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABS.MABSL0840.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL0840.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABS.MABSL0840.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABS.MABSL0840.Srch01_Rslt2R.class);
	}
	protected MABSL_MpsGrpReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL0840_Upd01_INFO;
		this.aUpd01 = ((MABSL_MpsGrpReg)this).new Upd01();
	}

	public static MABSL_MpsGrpReg.Upd01 crtUpd01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
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
	public mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);
	}
	protected MABSL_MpsGrpReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABSL0840_Del01_INFO;
		this.aDel01 = ((MABSL_MpsGrpReg)this).new Del01();
	}

	public static MABSL_MpsGrpReg.Del01 crtDel01() {
		MABSL_MpsGrpReg lgc = new MABSL_MpsGrpReg();
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
	public mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * MpsGrp_UpdChk01オペレーション.<p>
	 *
	 * ＭＰＳグループマスタを登録する前のチェックを行う<br>
	 */
	abstract public class MpsGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MpsGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected MpsGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);

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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MpsGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR createMpsGrp_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.create();
		}

		/**
		 * MpsGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> createMpsGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_mons</td></tr>
		 * 	<tr><td><br></td><td>prcd_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>week_div_mons</td></tr>
		 * 	<tr><td><br></td><td>period_div_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_typ</td></tr>
		 * 	<tr><td><br></td><td>mon01_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon02_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon03_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon04_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon05_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon06_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon07_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon08_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon09_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon10_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon11_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon12_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}


	}
	/**
	 * MpsGrp_Upd01オペレーション.<p>
	 *
	 * ＭＰＳグループマスタを登録する<br>
	 */
	abstract public class MpsGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MpsGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_MPS_GRP_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_MPS_GRP_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MpsGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_MPS_GRP_R.create("T1"));
			chkMaster = MCController.create(MAM_MPS_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_MPS_GRP_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_MPS_GRP_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MpsGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR createMpsGrp_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.create();
		}

		/**
		 * MpsGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> createMpsGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_mons</td></tr>
		 * 	<tr><td><br></td><td>prcd_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>week_div_mons</td></tr>
		 * 	<tr><td><br></td><td>period_div_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_typ</td></tr>
		 * 	<tr><td><br></td><td>mon01_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon02_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon03_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon04_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon05_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon06_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon07_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon08_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon09_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon10_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon11_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon12_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_MPS_GRP_R> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src_MpsGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_MpsGrp_Upd01_Dtl);
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
				addColumnPathMap("rqmt_mons", "rqmt_mons");
				addColumnPathMap("prcd_mons", "prcd_mons");
				addColumnPathMap("date_div_mons", "date_div_mons");
				addColumnPathMap("week_div_mons", "week_div_mons");
				addColumnPathMap("period_div_mons", "period_div_mons");
				addColumnPathMap("date_div_typ", "date_div_typ");
				addColumnPathMap("mon01_prod_qty", "mon01_prod_qty");
				addColumnPathMap("mon02_prod_qty", "mon02_prod_qty");
				addColumnPathMap("mon03_prod_qty", "mon03_prod_qty");
				addColumnPathMap("mon04_prod_qty", "mon04_prod_qty");
				addColumnPathMap("mon05_prod_qty", "mon05_prod_qty");
				addColumnPathMap("mon06_prod_qty", "mon06_prod_qty");
				addColumnPathMap("mon07_prod_qty", "mon07_prod_qty");
				addColumnPathMap("mon08_prod_qty", "mon08_prod_qty");
				addColumnPathMap("mon09_prod_qty", "mon09_prod_qty");
				addColumnPathMap("mon10_prod_qty", "mon10_prod_qty");
				addColumnPathMap("mon11_prod_qty", "mon11_prod_qty");
				addColumnPathMap("mon12_prod_qty", "mon12_prod_qty");
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
		protected void up_UPDATE_updMaster_0(MAM_MPS_GRP_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_MPS_GRP_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src : src){
				MAM_MPS_GRP_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_MPS_GRP_R> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src_MpsGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_MpsGrp_Upd01_Dtl);
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_MPS_GRP_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_MPS_GRP_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src : src){
				MAM_MPS_GRP_R r_dest = dest.createRow();
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
	 * MpsGrpLcl_UpdChk01オペレーション.<p>
	 *
	 * ＭＰＳグループマスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class MpsGrpLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MpsGrpLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_MPS_GRP_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MpsGrpLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_MPS_GRP_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_MPS_GRP_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MpsGrpLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR createMpsGrpLcl_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * MpsGrpLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> createMpsGrpLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_MPS_GRP_R> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src_MpsGrpLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_MpsGrpLcl_UpdChk01_Dtl);
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_MPS_GRP_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_MPS_GRP_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_MPS_GRP_R r_dest = dest.createRow();
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
	 * MpsGrpLcl_Upd01オペレーション.<p>
	 *
	 * ＭＰＳグループマスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class MpsGrpLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MpsGrpLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_MPS_GRP_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_MPS_GRP_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MpsGrpLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_MPS_GRP_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_MPS_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_MPS_GRP_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_MPS_GRP_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MpsGrpLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR createMpsGrpLcl_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * MpsGrpLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> createMpsGrpLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_MPS_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src_MpsGrpLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_MpsGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_MPS_GRP_LCL_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_MPS_GRP_LCL_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_MPS_GRP_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_MPS_GRP_LCL_R> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src_MpsGrpLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_MpsGrpLcl_Upd01_Dtl);
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_MPS_GRP_LCL_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_MPS_GRP_LCL_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src : src){
				MAM_MPS_GRP_LCL_R r_dest = dest.createRow();
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
	 * MpsGrp_DelChk01オペレーション.<p>
	 *
	 * ＭＰＳグループマスタ、ＭＰＳグループマスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class MpsGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MpsGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected MpsGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);

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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MpsGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR createMpsGrp_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.create();
		}

		/**
		 * MpsGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> createMpsGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}


	}
	/**
	 * MpsGrp_Del01オペレーション.<p>
	 *
	 * ＭＰＳグループマスタ、ＭＰＳグループマスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class MpsGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "MpsGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_MPS_GRP_R> updMaster1_up0;
		public final MCList<MAM_MPS_GRP_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected MpsGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_MPS_GRP_R.create("T1"));
			updMaster2 = MCController.create(MAM_MPS_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_MPS_GRP_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_MPS_GRP_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * MpsGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR createMpsGrp_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.create();
		}

		/**
		 * MpsGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> createMpsGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_MPS_GRP_R> dest0_0, MCList<MAM_MPS_GRP_LCL_R> dest1_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> src_MpsGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_MpsGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_MpsGrp_Del01_Dtl);
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_MPS_GRP_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_MPS_GRP_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src : src){
				MAM_MPS_GRP_R r_dest = dest.createRow();
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_MPS_GRP_LCL_R r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_MPS_GRP_LCL_R> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src : src){
				MAM_MPS_GRP_LCL_R r_dest = dest.createRow();
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
		private final mcframe.serverMABS.MABSL0840.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_R&gt;<br>
		 * 第1 上りブロッククラス MAM_MPS_GRP_R （{@link #c0_up0}）<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_MPS_GRP_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_R> c0;
		// 連携ロジック上り
		public final MAM_MPS_GRP_R c0_up0;
		// 連携ロジック下り
		public final MCList<MAM_MPS_GRP_R> c0_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_MPS_GRP_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_MPS_GRP_LCL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_MPS_GRP_LCL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_MPS_GRP_LCL_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0840.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0840.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABS.MABSL0840.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_MPS_GRP_R.create("T1"));
			c1 = MCController.create(MAM_MPS_GRP_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_up0 = (MAM_MPS_GRP_R)c0.up(0);
			c0_down0 = (MCList<MAM_MPS_GRP_R>)c0.down(0);
			c1_down0 = (MCList<MAM_MPS_GRP_LCL_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_LCL, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * up0() => MAM_MPS_GRP_R （{@link #c0_up0}）<br>
		 * SELECT_LCL<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT(c0_up0, up0());
			}
			if (key.equals(SELECT_LCL)) {
				up_SELECT_LCL();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_MPS_GRP_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_MPS_GRP_LCL_R&gt;（{@link #c1_down0}）=> down1()<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
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
		public mcframe.serverMABS.MABSL0840.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0840.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABS.MABSL0840.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL0840.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABS.MABSL0840.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABS.MABSL0840.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0840.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0840.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_mons</td></tr>
		 * 	<tr><td><br></td><td>prcd_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>week_div_mons</td></tr>
		 * 	<tr><td><br></td><td>period_div_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_typ</td></tr>
		 * 	<tr><td><br></td><td>date_div_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>mon01_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon02_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon03_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon04_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon05_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon06_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon07_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon08_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon09_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon10_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon11_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon12_prod_qty</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(MAM_MPS_GRP_R dest0_0, mcframe.serverMABS.MABSL0840.Srch01_CndR src_Srch01_Cnd){
			up_SELECT_c0_0(dest0_0, src_Srch01_Cnd);
		}
		
		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_SELECT_c0_0() {
			MCRowMapper map = new Map_up_SELECT_c0_0();
			return map;
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_SELECT_c0_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("mps_grp_nm_lcl", "mps_grp_nm_lcl");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
			}
		}

		/**
		 * 連携処理SELECT_c0の上りブロック0のRowをコピーする。<p>
		 *
		 * @param dest コピー先のRow
		 * @param src コピー元のRow
		 */
		protected void up_SELECT_c0_0(MAM_MPS_GRP_R dest, mcframe.serverMABS.MABSL0840.Srch01_CndR src) {
			createMap_up_SELECT_c0_0().copy(dest, src);
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
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_MPS_GRP_R> src0_0){
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("mps_grp_nm_lcl", "mps_grp_nm");
				addColumnPathMap("mps_grp_nm", "base_mps_grp_nm");
				addColumnPathMap("rqmt_mons", "rqmt_mons");
				addColumnPathMap("prcd_mons", "prcd_mons");
				addColumnPathMap("date_div_mons", "date_div_mons");
				addColumnPathMap("week_div_mons", "week_div_mons");
				addColumnPathMap("period_div_mons", "period_div_mons");
				addColumnPathMap("date_div_typ", "date_div_typ");
				addColumnPathMap("mon01_prod_qty", "mon01_prod_qty");
				addColumnPathMap("mon02_prod_qty", "mon02_prod_qty");
				addColumnPathMap("mon03_prod_qty", "mon03_prod_qty");
				addColumnPathMap("mon04_prod_qty", "mon04_prod_qty");
				addColumnPathMap("mon05_prod_qty", "mon05_prod_qty");
				addColumnPathMap("mon06_prod_qty", "mon06_prod_qty");
				addColumnPathMap("mon07_prod_qty", "mon07_prod_qty");
				addColumnPathMap("mon08_prod_qty", "mon08_prod_qty");
				addColumnPathMap("mon09_prod_qty", "mon09_prod_qty");
				addColumnPathMap("mon10_prod_qty", "mon10_prod_qty");
				addColumnPathMap("mon11_prod_qty", "mon11_prod_qty");
				addColumnPathMap("mon12_prod_qty", "mon12_prod_qty");
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
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0840.Srch01_Rslt1R r_dest, MAM_MPS_GRP_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt1R> dest, MCList<MAM_MPS_GRP_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_MPS_GRP_R r_src : src){
				mcframe.serverMABS.MABSL0840.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_MPS_GRP_LCL_R> src0_0){
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
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
		protected void down_SELECT_LCL_c1_0(mcframe.serverMABS.MABSL0840.Srch01_Rslt2R r_dest, MAM_MPS_GRP_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c1_0(MCList<mcframe.serverMABS.MABSL0840.Srch01_Rslt2R> dest, MCList<MAM_MPS_GRP_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c1_0();
			for(MAM_MPS_GRP_LCL_R r_src : src){
				mcframe.serverMABS.MABSL0840.Srch01_Rslt2R r_dest = dest.createRow();
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
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrpLcl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrpLcl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrpLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrpLcl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrpLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrpLcl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.crtMpsGrp_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.crtMpsGrp_Upd01();
			chk02 = mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.crtMpsGrpLcl_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.crtMpsGrpLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR>)upd02.up(0);

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
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>rqmt_mons</td></tr>
		 * 	<tr><td><br></td><td>prcd_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>week_div_mons</td></tr>
		 * 	<tr><td><br></td><td>period_div_mons</td></tr>
		 * 	<tr><td><br></td><td>date_div_typ</td></tr>
		 * 	<tr><td><br></td><td>mon01_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon02_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon03_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon04_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon05_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon06_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon07_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon08_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon09_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon10_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon11_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>mon12_prod_qty</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>mps_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
				addColumnPathMap("rqmt_mons", "rqmt_mons");
				addColumnPathMap("prcd_mons", "prcd_mons");
				addColumnPathMap("date_div_mons", "date_div_mons");
				addColumnPathMap("week_div_mons", "week_div_mons");
				addColumnPathMap("period_div_mons", "period_div_mons");
				addColumnPathMap("date_div_typ", "date_div_typ");
				addColumnPathMap("mon01_prod_qty", "mon01_prod_qty");
				addColumnPathMap("mon02_prod_qty", "mon02_prod_qty");
				addColumnPathMap("mon03_prod_qty", "mon03_prod_qty");
				addColumnPathMap("mon04_prod_qty", "mon04_prod_qty");
				addColumnPathMap("mon05_prod_qty", "mon05_prod_qty");
				addColumnPathMap("mon06_prod_qty", "mon06_prod_qty");
				addColumnPathMap("mon07_prod_qty", "mon07_prod_qty");
				addColumnPathMap("mon08_prod_qty", "mon08_prod_qty");
				addColumnPathMap("mon09_prod_qty", "mon09_prod_qty");
				addColumnPathMap("mon10_prod_qty", "mon10_prod_qty");
				addColumnPathMap("mon11_prod_qty", "mon11_prod_qty");
				addColumnPathMap("mon12_prod_qty", "mon12_prod_qty");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
				addColumnPathMap("rqmt_mons", "rqmt_mons");
				addColumnPathMap("prcd_mons", "prcd_mons");
				addColumnPathMap("date_div_mons", "date_div_mons");
				addColumnPathMap("week_div_mons", "week_div_mons");
				addColumnPathMap("period_div_mons", "period_div_mons");
				addColumnPathMap("date_div_typ", "date_div_typ");
				addColumnPathMap("mon01_prod_qty", "mon01_prod_qty");
				addColumnPathMap("mon02_prod_qty", "mon02_prod_qty");
				addColumnPathMap("mon03_prod_qty", "mon03_prod_qty");
				addColumnPathMap("mon04_prod_qty", "mon04_prod_qty");
				addColumnPathMap("mon05_prod_qty", "mon05_prod_qty");
				addColumnPathMap("mon06_prod_qty", "mon06_prod_qty");
				addColumnPathMap("mon07_prod_qty", "mon07_prod_qty");
				addColumnPathMap("mon08_prod_qty", "mon08_prod_qty");
				addColumnPathMap("mon09_prod_qty", "mon09_prod_qty");
				addColumnPathMap("mon10_prod_qty", "mon10_prod_qty");
				addColumnPathMap("mon11_prod_qty", "mon11_prod_qty");
				addColumnPathMap("mon12_prod_qty", "mon12_prod_qty");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0840.MpsGrp_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
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
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("mps_grp_nm", "mps_grp_nm");
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
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0840.MpsGrpLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
		private final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.MpsGrp_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.crtMpsGrp_DelChk01();
			del01 = mcframe.serverMABS.MABSL0840.MABSL_MpsGrpReg.crtMpsGrp_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>mps_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_MpsGrpReg)MABSL_MpsGrpReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("mps_grp_cd", "mps_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0840.MpsGrp_DelChk01_DtlR r_dest = dest.createRow();
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