package mcframe.serverMABS.MABSL0080;

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
 * "MABSL_AltItmReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_AltItmReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABSL0080";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_AltItmReg.AltGrp_UpdChk01 aAltGrp_UpdChk01;

	protected void initAltGrp_UpdChk01() {
		this.info = PDef.MA_MABSL0080_AltGrp_UpdChk01_INFO;
		this.aAltGrp_UpdChk01 = ((MABSL_AltItmReg)this).new AltGrp_UpdChk01();
	}

	public static MABSL_AltItmReg.AltGrp_UpdChk01 crtAltGrp_UpdChk01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
		lgc.initAltGrp_UpdChk01();
		return lgc.aAltGrp_UpdChk01;
	}

	protected void paramAltGrp_UpdChk01(MCParam p) {
		if (this.aAltGrp_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAltGrp_UpdChk01.up0());
	}

	protected void doAltGrp_UpdChk01() {
		aAltGrp_UpdChk01.call();
	};

	/**
	 * AltGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR createAltGrp_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.create();
	}

	/**
	 * AltGrp_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> createAltGrp_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.AltGrp_Upd01 aAltGrp_Upd01;

	protected void initAltGrp_Upd01() {
		this.info = PDef.MA_MABSL0080_AltGrp_Upd01_INFO;
		this.aAltGrp_Upd01 = ((MABSL_AltItmReg)this).new AltGrp_Upd01();
	}

	public static MABSL_AltItmReg.AltGrp_Upd01 crtAltGrp_Upd01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
		lgc.initAltGrp_Upd01();
		return lgc.aAltGrp_Upd01;
	}

	protected void paramAltGrp_Upd01(MCParam p) {
		if (this.aAltGrp_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAltGrp_Upd01.up0());
	}

	protected void doAltGrp_Upd01() {
		aAltGrp_Upd01.call();
	};

	/**
	 * AltGrp_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR createAltGrp_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.create();
	}

	/**
	 * AltGrp_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> createAltGrp_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.AltItm_UpdChk01 aAltItm_UpdChk01;

	protected void initAltItm_UpdChk01() {
		this.info = PDef.MA_MABSL0080_AltItm_UpdChk01_INFO;
		this.aAltItm_UpdChk01 = ((MABSL_AltItmReg)this).new AltItm_UpdChk01();
	}

	public static MABSL_AltItmReg.AltItm_UpdChk01 crtAltItm_UpdChk01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
		lgc.initAltItm_UpdChk01();
		return lgc.aAltItm_UpdChk01;
	}

	protected void paramAltItm_UpdChk01(MCParam p) {
		if (this.aAltItm_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAltItm_UpdChk01.up0());
	}

	protected void doAltItm_UpdChk01() {
		aAltItm_UpdChk01.call();
	};

	/**
	 * AltItm_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR createAltItm_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.create();
	}

	/**
	 * AltItm_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> createAltItm_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.AltItm_Upd01 aAltItm_Upd01;

	protected void initAltItm_Upd01() {
		this.info = PDef.MA_MABSL0080_AltItm_Upd01_INFO;
		this.aAltItm_Upd01 = ((MABSL_AltItmReg)this).new AltItm_Upd01();
	}

	public static MABSL_AltItmReg.AltItm_Upd01 crtAltItm_Upd01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
		lgc.initAltItm_Upd01();
		return lgc.aAltItm_Upd01;
	}

	protected void paramAltItm_Upd01(MCParam p) {
		if (this.aAltItm_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAltItm_Upd01.up0());
	}

	protected void doAltItm_Upd01() {
		aAltItm_Upd01.call();
	};

	/**
	 * AltItm_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR createAltItm_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.create();
	}

	/**
	 * AltItm_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> createAltItm_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.AltGrp_DelChk01 aAltGrp_DelChk01;

	protected void initAltGrp_DelChk01() {
		this.info = PDef.MA_MABSL0080_AltGrp_DelChk01_INFO;
		this.aAltGrp_DelChk01 = ((MABSL_AltItmReg)this).new AltGrp_DelChk01();
	}

	public static MABSL_AltItmReg.AltGrp_DelChk01 crtAltGrp_DelChk01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
		lgc.initAltGrp_DelChk01();
		return lgc.aAltGrp_DelChk01;
	}

	protected void paramAltGrp_DelChk01(MCParam p) {
		if (this.aAltGrp_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAltGrp_DelChk01.up0());
	}

	protected void doAltGrp_DelChk01() {
		aAltGrp_DelChk01.call();
	};

	/**
	 * AltGrp_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR createAltGrp_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.create();
	}

	/**
	 * AltGrp_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> createAltGrp_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.AltGrp_Del01 aAltGrp_Del01;

	protected void initAltGrp_Del01() {
		this.info = PDef.MA_MABSL0080_AltGrp_Del01_INFO;
		this.aAltGrp_Del01 = ((MABSL_AltItmReg)this).new AltGrp_Del01();
	}

	public static MABSL_AltItmReg.AltGrp_Del01 crtAltGrp_Del01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
		lgc.initAltGrp_Del01();
		return lgc.aAltGrp_Del01;
	}

	protected void paramAltGrp_Del01(MCParam p) {
		if (this.aAltGrp_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aAltGrp_Del01.up0());
	}

	protected void doAltGrp_Del01() {
		aAltGrp_Del01.call();
	};

	/**
	 * AltGrp_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR createAltGrp_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.create();
	}

	/**
	 * AltGrp_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> createAltGrp_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0080_Srch01_INFO;
		this.aSrch01 = ((MABSL_AltItmReg)this).new Srch01();
	}

	public static MABSL_AltItmReg.Srch01 crtSrch01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
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
	public mcframe.serverMABS.MABSL0080.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0080.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABS.MABSL0080.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL0080.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABS.MABSL0080.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABS.MABSL0080.Srch01_Rslt2R.class);
	}
	protected MABSL_AltItmReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL0080_Upd01_INFO;
		this.aUpd01 = ((MABSL_AltItmReg)this).new Upd01();
	}

	public static MABSL_AltItmReg.Upd01 crtUpd01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
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
	public mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);
	}
	protected MABSL_AltItmReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABSL0080_Del01_INFO;
		this.aDel01 = ((MABSL_AltItmReg)this).new Del01();
	}

	public static MABSL_AltItmReg.Del01 crtDel01() {
		MABSL_AltItmReg lgc = new MABSL_AltItmReg();
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
	public mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * AltGrp_UpdChk01オペレーション.<p>
	 *
	 * 代替グループマスタを登録する前のチェックを行う<br>
	 */
	abstract public class AltGrp_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AltGrp_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AltGrp_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);

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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AltGrp_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR createAltGrp_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.create();
		}

		/**
		 * AltGrp_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> createAltGrp_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}


	}
	/**
	 * AltGrp_Upd01オペレーション.<p>
	 *
	 * 代替グループマスタを登録する<br>
	 */
	abstract public class AltGrp_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AltGrp_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_GRP__R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_GRP__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_GRP__R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_GRP__R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALT_GRP__R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_GRP__R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_GRP__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_GRP__R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_GRP__R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALT_GRP__R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AltGrp_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ALT_GRP__R.create("T1"));
			chkMaster = MCController.create(MAM_ALT_GRP__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ALT_GRP__R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ALT_GRP__R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ALT_GRP__R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ALT_GRP__R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AltGrp_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR createAltGrp_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.create();
		}

		/**
		 * AltGrp_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> createAltGrp_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ALT_GRP__R> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src_AltGrp_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AltGrp_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
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
		protected void up_UPDATE_updMaster_0(MAM_ALT_GRP__R r_dest, mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ALT_GRP__R> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src : src){
				MAM_ALT_GRP__R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ALT_GRP__R> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src_AltGrp_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AltGrp_Upd01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ALT_GRP__R r_dest, mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ALT_GRP__R> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src : src){
				MAM_ALT_GRP__R r_dest = dest.createRow();
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
	 * AltItm_UpdChk01オペレーション.<p>
	 *
	 * 代替品目マスタを登録する前のチェックを行う<br>
	 */
	abstract public class AltItm_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AltItm_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_GRP__R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_GRP__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_GRP__R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_GRP__R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ALT_GRP__R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AltItm_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ALT_GRP__R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ALT_GRP__R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ALT_GRP__R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AltItm_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR createAltItm_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.create();
		}

		/**
		 * AltItm_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> createAltItm_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_ratio</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_ratio</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_ALT_GRP__R> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src_AltItm_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_AltItm_UpdChk01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ALT_GRP__R r_dest, mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ALT_GRP__R> dest, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src : src){
				MAM_ALT_GRP__R r_dest = dest.createRow();
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
	 * AltItm_Upd01オペレーション.<p>
	 *
	 * 代替品目マスタを登録する<br>
	 */
	abstract public class AltItm_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AltItm_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_ITM_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_ITM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_ITM_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_ITM_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALT_ITM_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_ITM_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_ITM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_ITM_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_ITM_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ALT_ITM_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AltItm_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ALT_ITM_R.create("T1"));
			chkMaster = MCController.create(MAM_ALT_ITM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ALT_ITM_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ALT_ITM_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ALT_ITM_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ALT_ITM_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AltItm_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR createAltItm_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.create();
		}

		/**
		 * AltItm_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> createAltItm_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_ratio</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_ratio</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ALT_ITM_R> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src_AltItm_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_AltItm_Upd01_Dtl);
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
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("chd_rqmt_ratio", "chd_rqmt_ratio");
				addColumnPathMap("chd_inpt_ratio", "chd_inpt_ratio");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_ALT_ITM_R r_dest, mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ALT_ITM_R> dest, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src : src){
				MAM_ALT_ITM_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ALT_ITM_R> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src_AltItm_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_AltItm_Upd01_Dtl);
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
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("st_dt", "st_dt");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ALT_ITM_R r_dest, mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ALT_ITM_R> dest, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src : src){
				MAM_ALT_ITM_R r_dest = dest.createRow();
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
	 * AltGrp_DelChk01オペレーション.<p>
	 *
	 * 代替グループマスタ、代替品目マスタを削除する前のチェックを行う<br>
	 */
	abstract public class AltGrp_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AltGrp_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected AltGrp_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);

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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AltGrp_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR createAltGrp_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.create();
		}

		/**
		 * AltGrp_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> createAltGrp_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}


	}
	/**
	 * AltGrp_Del01オペレーション.<p>
	 *
	 * 代替グループマスタ、代替品目マスタを削除する<br>
	 */
	abstract public class AltGrp_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "AltGrp_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_GRP__R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_ITM_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_GRP__R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_GRP__R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_GRP__R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_ITM_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ALT_ITM_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_ITM_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ALT_GRP__R> updMaster1_up0;
		public final MCList<MAM_ALT_ITM_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected AltGrp_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ALT_GRP__R.create("T1"));
			updMaster2 = MCController.create(MAM_ALT_ITM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ALT_GRP__R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ALT_ITM_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ALT_GRP__R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ALT_ITM_R&gt; （{@link #updMaster2_up0}）<br>
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * AltGrp_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR createAltGrp_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.create();
		}

		/**
		 * AltGrp_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> createAltGrp_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ALT_GRP__R> dest0_0, MCList<MAM_ALT_ITM_R> dest1_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> src_AltGrp_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_AltGrp_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_AltGrp_Del01_Dtl);
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ALT_GRP__R r_dest, mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ALT_GRP__R> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src : src){
				MAM_ALT_GRP__R r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ALT_ITM_R r_dest, mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ALT_ITM_R> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src : src){
				MAM_ALT_ITM_R r_dest = dest.createRow();
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
		private final mcframe.serverMABS.MABSL0080.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_GRP__R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_GRP__R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ALT_GRP__R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_GRP__R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ALT_GRP__R> c0_down0;
		/**
		 * 連携情報 SELECT_ITM<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ALT_ITM_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_ITM = "SELECT_ITM";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ALT_ITM_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ALT_ITM_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ALT_ITM_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ALT_ITM_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0080.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0080.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABS.MABSL0080.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ALT_GRP__R.create("T1"));
			c1 = MCController.create(MAM_ALT_ITM_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ALT_GRP__R>)c0.down(0);
			c1_down0 = (MCList<MAM_ALT_ITM_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_ITM, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_ITM<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_ITM)) {
				up_SELECT_ITM();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_ALT_GRP__R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_ITM<br>
		 * MCList&lt;MAM_ALT_ITM_R&gt;（{@link #c1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_ITM)) {
				down_SELECT_ITM(down1(), c1_down0);
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
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
		public mcframe.serverMABS.MABSL0080.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0080.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABS.MABSL0080.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL0080.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABS.MABSL0080.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABS.MABSL0080.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>cmn_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0080.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0080.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ_nm</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>unit_cd</td></tr>
		 * 	<tr><td><br></td><td>dec_place</td></tr>
		 * 	<tr><td><br></td><td>cont_fctr_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_flg</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_ratio</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_ratio</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_ITM専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_ITMの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_ITM(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ALT_GRP__R> src0_0){
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
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
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0080.Srch01_Rslt1R r_dest, MAM_ALT_GRP__R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt1R> dest, MCList<MAM_ALT_GRP__R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ALT_GRP__R r_src : src){
				mcframe.serverMABS.MABSL0080.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_ITM専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_ITMの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_ITM(MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_ALT_ITM_R> src0_0){
			down_SELECT_ITM_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_ITM_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_ITM_c1_0() {
			MCRowMapper map = new Map_down_SELECT_ITM_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_ITM_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_ITM_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("chd_itm_nm", "chd_itm_nm");
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("unit_cd", "unit_cd");
				addColumnPathMap("dec_place", "dec_place");
				addColumnPathMap("cont_fctr_flg", "cont_fctr_flg");
				addColumnPathMap("ver_flg", "ver_flg");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("chd_rqmt_ratio", "chd_rqmt_ratio");
				addColumnPathMap("chd_inpt_ratio", "chd_inpt_ratio");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
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
		 * 連携処理SELECT_ITM_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_ITM_c1_0(mcframe.serverMABS.MABSL0080.Srch01_Rslt2R r_dest, MAM_ALT_ITM_R r_src) {
		}

		/**
		 * 連携処理SELECT_ITM_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_ITM_c1_0(MCList<mcframe.serverMABS.MABSL0080.Srch01_Rslt2R> dest, MCList<MAM_ALT_ITM_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_ITM_c1_0();
			for(MAM_ALT_ITM_R r_src : src){
				mcframe.serverMABS.MABSL0080.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_ITM_c1_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltItm_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltItm_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltItm_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltItm_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltItm_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltItm_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.crtAltGrp_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.crtAltGrp_Upd01();
			chk02 = mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.crtAltItm_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.crtAltItm_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR>)upd02.up(0);

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
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>ver_no</td></tr>
		 * 	<tr><td><br></td><td>st_dt_key</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * 	<tr><td><br></td><td>chd_rqmt_ratio</td></tr>
		 * 	<tr><td><br></td><td>chd_inpt_ratio</td></tr>
		 * 	<tr><td><br></td><td>fxd_chd_rqmt_qty</td></tr>
		 * 	<tr><td><br></td><td>alt_itm_ratio</td></tr>
		 * 	<tr><td><br></td><td>alt_alloc_prio</td></tr>
		 * 	<tr><td><br></td><td>not_cost_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("alt_grp_nm", "alt_grp_nm");
				addColumnPathMap("alt_itm_typ", "alt_itm_typ");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0080.AltGrp_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("chd_rqmt_ratio", "chd_rqmt_ratio");
				addColumnPathMap("chd_inpt_ratio", "chd_inpt_ratio");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
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
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("ver_no", "ver_no");
				addColumnPathMap("st_dt_key", "st_dt_key");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
				addColumnPathMap("chd_rqmt_ratio", "chd_rqmt_ratio");
				addColumnPathMap("chd_inpt_ratio", "chd_inpt_ratio");
				addColumnPathMap("fxd_chd_rqmt_qty", "fxd_chd_rqmt_qty");
				addColumnPathMap("alt_itm_ratio", "alt_itm_ratio");
				addColumnPathMap("alt_alloc_prio", "alt_alloc_prio");
				addColumnPathMap("not_cost_flg", "not_cost_flg");
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
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0080.AltItm_UpdChk01_DtlR r_dest = dest.createRow();
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
		private final MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.AltGrp_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.crtAltGrp_DelChk01();
			del01 = mcframe.serverMABS.MABSL0080.MABSL_AltItmReg.crtAltGrp_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>alt_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_AltItmReg)MABSL_AltItmReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("alt_grp_cd", "alt_grp_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0080.AltGrp_DelChk01_DtlR r_dest = dest.createRow();
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