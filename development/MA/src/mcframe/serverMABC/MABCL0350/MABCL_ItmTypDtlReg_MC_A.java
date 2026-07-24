package mcframe.serverMABC.MABCL0350;

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
 * "MABCL_ItmTypDtlReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABCL_ItmTypDtlReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABCL0350";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABCL_ItmTypDtlReg.ItmTypDtl_UpdChk01 aItmTypDtl_UpdChk01;

	protected void initItmTypDtl_UpdChk01() {
		this.info = PDef.MA_MABCL0350_ItmTypDtl_UpdChk01_INFO;
		this.aItmTypDtl_UpdChk01 = ((MABCL_ItmTypDtlReg)this).new ItmTypDtl_UpdChk01();
	}

	public static MABCL_ItmTypDtlReg.ItmTypDtl_UpdChk01 crtItmTypDtl_UpdChk01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
		lgc.initItmTypDtl_UpdChk01();
		return lgc.aItmTypDtl_UpdChk01;
	}

	protected void paramItmTypDtl_UpdChk01(MCParam p) {
		if (this.aItmTypDtl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmTypDtl_UpdChk01.up0());
	}

	protected void doItmTypDtl_UpdChk01() {
		aItmTypDtl_UpdChk01.call();
	};

	/**
	 * ItmTypDtl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR createItmTypDtl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmTypDtl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> createItmTypDtl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.ItmTypDtl_Upd01 aItmTypDtl_Upd01;

	protected void initItmTypDtl_Upd01() {
		this.info = PDef.MA_MABCL0350_ItmTypDtl_Upd01_INFO;
		this.aItmTypDtl_Upd01 = ((MABCL_ItmTypDtlReg)this).new ItmTypDtl_Upd01();
	}

	public static MABCL_ItmTypDtlReg.ItmTypDtl_Upd01 crtItmTypDtl_Upd01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
		lgc.initItmTypDtl_Upd01();
		return lgc.aItmTypDtl_Upd01;
	}

	protected void paramItmTypDtl_Upd01(MCParam p) {
		if (this.aItmTypDtl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmTypDtl_Upd01.up0());
	}

	protected void doItmTypDtl_Upd01() {
		aItmTypDtl_Upd01.call();
	};

	/**
	 * ItmTypDtl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR createItmTypDtl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmTypDtl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> createItmTypDtl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.ItmTypDtlLcl_UpdChk01 aItmTypDtlLcl_UpdChk01;

	protected void initItmTypDtlLcl_UpdChk01() {
		this.info = PDef.MA_MABCL0350_ItmTypDtlLcl_UpdChk01_INFO;
		this.aItmTypDtlLcl_UpdChk01 = ((MABCL_ItmTypDtlReg)this).new ItmTypDtlLcl_UpdChk01();
	}

	public static MABCL_ItmTypDtlReg.ItmTypDtlLcl_UpdChk01 crtItmTypDtlLcl_UpdChk01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
		lgc.initItmTypDtlLcl_UpdChk01();
		return lgc.aItmTypDtlLcl_UpdChk01;
	}

	protected void paramItmTypDtlLcl_UpdChk01(MCParam p) {
		if (this.aItmTypDtlLcl_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmTypDtlLcl_UpdChk01.up0());
	}

	protected void doItmTypDtlLcl_UpdChk01() {
		aItmTypDtlLcl_UpdChk01.call();
	};

	/**
	 * ItmTypDtlLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR createItmTypDtlLcl_UpdChk01_DtlR(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmTypDtlLcl_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> createItmTypDtlLcl_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.ItmTypDtlLcl_Upd01 aItmTypDtlLcl_Upd01;

	protected void initItmTypDtlLcl_Upd01() {
		this.info = PDef.MA_MABCL0350_ItmTypDtlLcl_Upd01_INFO;
		this.aItmTypDtlLcl_Upd01 = ((MABCL_ItmTypDtlReg)this).new ItmTypDtlLcl_Upd01();
	}

	public static MABCL_ItmTypDtlReg.ItmTypDtlLcl_Upd01 crtItmTypDtlLcl_Upd01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
		lgc.initItmTypDtlLcl_Upd01();
		return lgc.aItmTypDtlLcl_Upd01;
	}

	protected void paramItmTypDtlLcl_Upd01(MCParam p) {
		if (this.aItmTypDtlLcl_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmTypDtlLcl_Upd01.up0());
	}

	protected void doItmTypDtlLcl_Upd01() {
		aItmTypDtlLcl_Upd01.call();
	};

	/**
	 * ItmTypDtlLcl_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR createItmTypDtlLcl_Upd01_DtlR(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.create();
	}

	/**
	 * ItmTypDtlLcl_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> createItmTypDtlLcl_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.ItmTypDtl_DelChk01 aItmTypDtl_DelChk01;

	protected void initItmTypDtl_DelChk01() {
		this.info = PDef.MA_MABCL0350_ItmTypDtl_DelChk01_INFO;
		this.aItmTypDtl_DelChk01 = ((MABCL_ItmTypDtlReg)this).new ItmTypDtl_DelChk01();
	}

	public static MABCL_ItmTypDtlReg.ItmTypDtl_DelChk01 crtItmTypDtl_DelChk01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
		lgc.initItmTypDtl_DelChk01();
		return lgc.aItmTypDtl_DelChk01;
	}

	protected void paramItmTypDtl_DelChk01(MCParam p) {
		if (this.aItmTypDtl_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmTypDtl_DelChk01.up0());
	}

	protected void doItmTypDtl_DelChk01() {
		aItmTypDtl_DelChk01.call();
	};

	/**
	 * ItmTypDtl_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR createItmTypDtl_DelChk01_DtlR(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.create();
	}

	/**
	 * ItmTypDtl_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> createItmTypDtl_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.ItmTypDtl_Del01 aItmTypDtl_Del01;

	protected void initItmTypDtl_Del01() {
		this.info = PDef.MA_MABCL0350_ItmTypDtl_Del01_INFO;
		this.aItmTypDtl_Del01 = ((MABCL_ItmTypDtlReg)this).new ItmTypDtl_Del01();
	}

	public static MABCL_ItmTypDtlReg.ItmTypDtl_Del01 crtItmTypDtl_Del01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
		lgc.initItmTypDtl_Del01();
		return lgc.aItmTypDtl_Del01;
	}

	protected void paramItmTypDtl_Del01(MCParam p) {
		if (this.aItmTypDtl_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aItmTypDtl_Del01.up0());
	}

	protected void doItmTypDtl_Del01() {
		aItmTypDtl_Del01.call();
	};

	/**
	 * ItmTypDtl_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR createItmTypDtl_Del01_DtlR(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.create();
	}

	/**
	 * ItmTypDtl_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> createItmTypDtl_Del01_DtlL(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABCL0350_Srch01_INFO;
		this.aSrch01 = ((MABCL_ItmTypDtlReg)this).new Srch01();
	}

	public static MABCL_ItmTypDtlReg.Srch01 crtSrch01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
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
	public mcframe.serverMABC.MABCL0350.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABC.MABCL0350.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABC.MABCL0350.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABC.MABCL0350.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABC.MABCL0350.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABC.MABCL0350.Srch01_Rslt2R.class);
	}
	protected MABCL_ItmTypDtlReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABCL0350_Upd01_INFO;
		this.aUpd01 = ((MABCL_ItmTypDtlReg)this).new Upd01();
	}

	public static MABCL_ItmTypDtlReg.Upd01 crtUpd01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
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
	public mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);
	}
	protected MABCL_ItmTypDtlReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABCL0350_Del01_INFO;
		this.aDel01 = ((MABCL_ItmTypDtlReg)this).new Del01();
	}

	public static MABCL_ItmTypDtlReg.Del01 crtDel01() {
		MABCL_ItmTypDtlReg lgc = new MABCL_ItmTypDtlReg();
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
	public mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * ItmTypDtl_UpdChk01オペレーション.<p>
	 *
	 * 品目区分詳細マスタを登録する前のチェックを行う<br>
	 */
	abstract public class ItmTypDtl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmTypDtl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmTypDtl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);

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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmTypDtl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR createItmTypDtl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmTypDtl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> createItmTypDtl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>def_comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>def_skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>def_stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>def_prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>def_dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sch_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>def_inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>def_main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_cost_bom_flg</td></tr>
		 * 	<tr><td><br></td><td>def_calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}


	}
	/**
	 * ItmTypDtl_Upd01オペレーション.<p>
	 *
	 * 品目区分詳細マスタを登録する<br>
	 */
	abstract public class ItmTypDtl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmTypDtl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_TYP_D_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_TYP_D_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmTypDtl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_TYP_D_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_TYP_D_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_TYP_D_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_TYP_D_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmTypDtl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR createItmTypDtl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmTypDtl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> createItmTypDtl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>def_comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>def_skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>def_stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>def_prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>def_dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sch_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>def_inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>def_main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_cost_bom_flg</td></tr>
		 * 	<tr><td><br></td><td>def_calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_TYP_D_R> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src_ItmTypDtl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmTypDtl_Upd01_Dtl);
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("def_sls_flg", "def_sls_flg");
				addColumnPathMap("def_mfg_flg", "def_mfg_flg");
				addColumnPathMap("def_purc_flg", "def_purc_flg");
				addColumnPathMap("def_insp_flg", "def_insp_flg");
				addColumnPathMap("def_itm_jnl_cd", "def_itm_jnl_cd");
				addColumnPathMap("def_ac_itm_grp_cd", "def_ac_itm_grp_cd");
				addColumnPathMap("def_minus_stk_flg", "def_minus_stk_flg");
				addColumnPathMap("def_not_new_lot_flg", "def_not_new_lot_flg");
				addColumnPathMap("def_gi_alloc_flg", "def_gi_alloc_flg");
				addColumnPathMap("def_pack_alloc_flg", "def_pack_alloc_flg");
				addColumnPathMap("def_bp_lot_flg", "def_bp_lot_flg");
				addColumnPathMap("def_comp_spec_typ", "def_comp_spec_typ");
				addColumnPathMap("def_comp_rev_at_slo_flg", "def_comp_rev_at_slo_flg");
				addColumnPathMap("def_comp_core_itm_flg", "def_comp_core_itm_flg");
				addColumnPathMap("def_insp_bind_typ", "def_insp_bind_typ");
				addColumnPathMap("def_skip_chk_ship_flg", "def_skip_chk_ship_flg");
				addColumnPathMap("def_itm_spec_grp_cd", "def_itm_spec_grp_cd");
				addColumnPathMap("def_lmt_ctl_flg", "def_lmt_ctl_flg");
				addColumnPathMap("def_lmt_ctl_categ", "def_lmt_ctl_categ");
				addColumnPathMap("def_sls_upri_grp_cd", "def_sls_upri_grp_cd");
				addColumnPathMap("def_slo_proc_flg", "def_slo_proc_flg");
				addColumnPathMap("def_slo_proc_typ", "def_slo_proc_typ");
				addColumnPathMap("def_ship_inst_typ", "def_ship_inst_typ");
				addColumnPathMap("def_ship_lot_back_stop_flg", "def_ship_lot_back_stop_flg");
				addColumnPathMap("def_itm_ship_grp_cd", "def_itm_ship_grp_cd");
				addColumnPathMap("def_ship_valid_grp_cd", "def_ship_valid_grp_cd");
				addColumnPathMap("def_arr_skip_flg", "def_arr_skip_flg");
				addColumnPathMap("def_ship_term_cd", "def_ship_term_cd");
				addColumnPathMap("def_stk_lst_flg", "def_stk_lst_flg");
				addColumnPathMap("def_ver_flg", "def_ver_flg");
				addColumnPathMap("def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ");
				addColumnPathMap("def_sls_upri_cng_flg", "def_sls_upri_cng_flg");
				addColumnPathMap("def_purc_upri_cng_flg", "def_purc_upri_cng_flg");
				addColumnPathMap("def_prov_upri_cng_flg", "def_prov_upri_cng_flg");
				addColumnPathMap("def_mrp_proc_typ", "def_mrp_proc_typ");
				addColumnPathMap("def_rqmt_typ", "def_rqmt_typ");
				addColumnPathMap("def_prod_pln_typ", "def_prod_pln_typ");
				addColumnPathMap("def_dmnd_date_div_mons", "def_dmnd_date_div_mons");
				addColumnPathMap("def_alloc_margin_days", "def_alloc_margin_days");
				addColumnPathMap("def_mrp_alloc_margin_days", "def_mrp_alloc_margin_days");
				addColumnPathMap("def_mrp_opn_xfr_days", "def_mrp_opn_xfr_days");
				addColumnPathMap("def_inpt_itm_add_flg", "def_inpt_itm_add_flg");
				addColumnPathMap("def_inpt_itm_del_flg", "def_inpt_itm_del_flg");
				addColumnPathMap("def_sch_flg", "def_sch_flg");
				addColumnPathMap("def_lot_mng_typ", "def_lot_mng_typ");
				addColumnPathMap("def_lot_no_typ", "def_lot_no_typ");
				addColumnPathMap("def_lot_no_ptn_cd", "def_lot_no_ptn_cd");
				addColumnPathMap("def_sublot_mng_typ", "def_sublot_mng_typ");
				addColumnPathMap("def_sublot_no_typ", "def_sublot_no_typ");
				addColumnPathMap("def_sublot_no_ptn_cd", "def_sublot_no_ptn_cd");
				addColumnPathMap("def_sno1_mng_typ", "def_sno1_mng_typ");
				addColumnPathMap("def_slo_sno1_flg", "def_slo_sno1_flg");
				addColumnPathMap("def_rqmt_sno1_flg", "def_rqmt_sno1_flg");
				addColumnPathMap("def_sno1_num_typ", "def_sno1_num_typ");
				addColumnPathMap("def_sno1_ptn_cd", "def_sno1_ptn_cd");
				addColumnPathMap("def_sno2_mng_typ", "def_sno2_mng_typ");
				addColumnPathMap("def_slo_sno2_flg", "def_slo_sno2_flg");
				addColumnPathMap("def_rqmt_sno2_flg", "def_rqmt_sno2_flg");
				addColumnPathMap("def_sno2_num_typ", "def_sno2_num_typ");
				addColumnPathMap("def_sno2_ptn_cd", "def_sno2_ptn_cd");
				addColumnPathMap("def_sno3_mng_typ", "def_sno3_mng_typ");
				addColumnPathMap("def_slo_sno3_flg", "def_slo_sno3_flg");
				addColumnPathMap("def_rqmt_sno3_flg", "def_rqmt_sno3_flg");
				addColumnPathMap("def_sno3_num_typ", "def_sno3_num_typ");
				addColumnPathMap("def_sno3_ptn_cd", "def_sno3_ptn_cd");
				addColumnPathMap("def_sno4_mng_typ", "def_sno4_mng_typ");
				addColumnPathMap("def_slo_sno4_flg", "def_slo_sno4_flg");
				addColumnPathMap("def_rqmt_sno4_flg", "def_rqmt_sno4_flg");
				addColumnPathMap("def_sno4_num_typ", "def_sno4_num_typ");
				addColumnPathMap("def_sno4_ptn_cd", "def_sno4_ptn_cd");
				addColumnPathMap("def_mrkt_judg_flg", "def_mrkt_judg_flg");
				addColumnPathMap("def_mrkt_judg_role_cd", "def_mrkt_judg_role_cd");
				addColumnPathMap("def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_cd");
				addColumnPathMap("def_plnt_aprv_flg", "def_plnt_aprv_flg");
				addColumnPathMap("def_plnt_aprv_role_cd", "def_plnt_aprv_role_cd");
				addColumnPathMap("def_insp_aprv_flg", "def_insp_aprv_flg");
				addColumnPathMap("def_insp_aprv_role_cd", "def_insp_aprv_role_cd");
				addColumnPathMap("def_mfg_aprv_flg", "def_mfg_aprv_flg");
				addColumnPathMap("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd");
				addColumnPathMap("def_sno_typ1", "def_sno_typ1");
				addColumnPathMap("def_sno_typ2", "def_sno_typ2");
				addColumnPathMap("def_sno_typ3", "def_sno_typ3");
				addColumnPathMap("def_sno_typ4", "def_sno_typ4");
				addColumnPathMap("def_inst_lot_fix_flg", "def_inst_lot_fix_flg");
				addColumnPathMap("def_lot_mix_flg", "def_lot_mix_flg");
				addColumnPathMap("def_sublot_mix_flg", "def_sublot_mix_flg");
				addColumnPathMap("def_alloc_ctl_typ", "def_alloc_ctl_typ");
				addColumnPathMap("def_inpt_ctl_typ", "def_inpt_ctl_typ");
				addColumnPathMap("def_bkf_typ", "def_bkf_typ");
				addColumnPathMap("def_main_itm_flg", "def_main_itm_flg");
				addColumnPathMap("def_byprod_flg", "def_byprod_flg");
				addColumnPathMap("def_not_cost_bom_flg", "def_not_cost_bom_flg");
				addColumnPathMap("def_calc_ptn_cd", "def_calc_ptn_cd");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_TYP_D_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_TYP_D_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_TYP_D_R> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src_ItmTypDtl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmTypDtl_Upd01_Dtl);
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_TYP_D_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_TYP_D_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_R r_dest = dest.createRow();
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
	 * ItmTypDtlLcl_UpdChk01オペレーション.<p>
	 *
	 * 品目区分詳細マスタ(ロケール別情報)を登録する前のチェックを行う<br>
	 */
	abstract public class ItmTypDtlLcl_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmTypDtlLcl_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 EXISTS<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt; （{@link #chk01}）<br>
		 */
		public final String EXISTS = "EXISTS";

		/**
		 * DBC連携 chk01<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #chk01_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_R> chk01;
		// 連携ロジック上り
		public final MCList<MAM_ITM_TYP_D_R> chk01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmTypDtlLcl_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = MCController.create(MAM_ITM_TYP_D_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<MAM_ITM_TYP_D_R>)chk01.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(EXISTS, chk01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * EXISTS<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #chk01_up0}）<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmTypDtlLcl_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR createItmTypDtlLcl_UpdChk01_DtlR(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmTypDtlLcl_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> createItmTypDtlLcl_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}

		//-----------------------EXISTS専用up関連メソッド--------------------------
		/**
		 * オペレーショングループEXISTSの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_EXISTS(MCList<MAM_ITM_TYP_D_R> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src_ItmTypDtlLcl_UpdChk01_Dtl){
			up_EXISTS_chk01_0(dest0_0, src_ItmTypDtlLcl_UpdChk01_Dtl);
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
			}
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_EXISTS_chk01_0(MAM_ITM_TYP_D_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理EXISTS_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_EXISTS_chk01_0(MCList<MAM_ITM_TYP_D_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_EXISTS_chk01_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_R r_dest = dest.createRow();
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
	 * ItmTypDtlLcl_Upd01オペレーション.<p>
	 *
	 * 品目区分詳細マスタ(ロケール別情報)を登録する<br>
	 */
	abstract public class ItmTypDtlLcl_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmTypDtlLcl_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_LCL_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_TYP_D_LCL_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_LCL_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_ITM_TYP_D_LCL_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmTypDtlLcl_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_ITM_TYP_D_LCL_R.create("T1"));
			chkMaster = MCController.create(MAM_ITM_TYP_D_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_ITM_TYP_D_LCL_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_ITM_TYP_D_LCL_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmTypDtlLcl_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR createItmTypDtlLcl_Upd01_DtlR(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.create();
		}

		/**
		 * ItmTypDtlLcl_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> createItmTypDtlLcl_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_TYP_D_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src_ItmTypDtlLcl_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_ItmTypDtlLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
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
		protected void up_UPDATE_updMaster_0(MAM_ITM_TYP_D_LCL_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_ITM_TYP_D_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_LCL_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_ITM_TYP_D_LCL_R> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src_ItmTypDtlLcl_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_ItmTypDtlLcl_Upd01_Dtl);
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_ITM_TYP_D_LCL_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_ITM_TYP_D_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_LCL_R r_dest = dest.createRow();
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
	 * ItmTypDtl_DelChk01オペレーション.<p>
	 *
	 * 品目区分詳細マスタ、品目区分詳細マスタ(ロケール別情報)を削除する前のチェックを行う<br>
	 */
	abstract public class ItmTypDtl_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmTypDtl_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected ItmTypDtl_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);

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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmTypDtl_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR createItmTypDtl_DelChk01_DtlR(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.create();
		}

		/**
		 * ItmTypDtl_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> createItmTypDtl_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}


	}
	/**
	 * ItmTypDtl_Del01オペレーション.<p>
	 *
	 * 品目区分詳細マスタ、品目区分詳細マスタ(ロケール別情報)を削除する<br>
	 */
	abstract public class ItmTypDtl_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "ItmTypDtl_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt; （{@link #updMaster1}）<br>
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #updMaster2}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_R> updMaster1;
		/**
		 * DBC連携 updMaster2<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #updMaster2_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_LCL_R> updMaster2;
		// 連携ロジック上り
		public final MCList<MAM_ITM_TYP_D_R> updMaster1_up0;
		public final MCList<MAM_ITM_TYP_D_LCL_R> updMaster2_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected ItmTypDtl_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_ITM_TYP_D_R.create("T1"));
			updMaster2 = MCController.create(MAM_ITM_TYP_D_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_ITM_TYP_D_R>)updMaster1.up(1);
			updMaster2_up0 = (MCList<MAM_ITM_TYP_D_LCL_R>)updMaster2.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
			appendOpe(UPDATE, updMaster2);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #updMaster1_up0}）<br>
		 * up0() => MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #updMaster2_up0}）<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * ItmTypDtl_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR createItmTypDtl_Del01_DtlR(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.create();
		}

		/**
		 * ItmTypDtl_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> createItmTypDtl_Del01_DtlL(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_ITM_TYP_D_R> dest0_0, MCList<MAM_ITM_TYP_D_LCL_R> dest1_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> src_ItmTypDtl_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_ItmTypDtl_Del01_Dtl);
			up_UPDATE_updMaster2_0(dest1_0, src_ItmTypDtl_Del01_Dtl);
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_ITM_TYP_D_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_ITM_TYP_D_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_R r_dest = dest.createRow();
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster2_0(MAM_ITM_TYP_D_LCL_R r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster2の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster2_0(MCList<MAM_ITM_TYP_D_LCL_R> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster2_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src : src){
				MAM_ITM_TYP_D_LCL_R r_dest = dest.createRow();
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
		private final mcframe.serverMABC.MABCL0350.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_TYP_D_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_TYP_D_R> c0_down0;
		/**
		 * 連携情報 SELECT_LCL<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_LCL = "SELECT_LCL";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_ITM_TYP_D_LCL_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_ITM_TYP_D_LCL_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_ITM_TYP_D_LCL_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_ITM_TYP_D_LCL_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABC.MABCL0350.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABC.MABCL0350.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABC.MABCL0350.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_ITM_TYP_D_R.create("T1"));
			c1 = MCController.create(MAM_ITM_TYP_D_LCL_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_ITM_TYP_D_R>)c0.down(0);
			c1_down0 = (MCList<MAM_ITM_TYP_D_LCL_R>)c1.down(0);

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
		 * MCList&lt;MAM_ITM_TYP_D_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_LCL<br>
		 * MCList&lt;MAM_ITM_TYP_D_LCL_R&gt;（{@link #c1_down0}）=> down1()<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
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
		public mcframe.serverMABC.MABCL0350.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABC.MABCL0350.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABC.MABCL0350.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABC.MABCL0350.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABC.MABCL0350.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABC.MABCL0350.Srch01_Rslt2R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABC.MABCL0350.Srch01_CndR
		 */
		public mcframe.serverMABC.MABCL0350.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm_lcl</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>def_itm_jnl_nm</td></tr>
		 * 	<tr><td><br></td><td>def_ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ac_itm_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>def_comp_spec_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>def_insp_bind_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_itm_spec_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_inst_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_itm_ship_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ship_valid_grp_nm</td></tr>
		 * 	<tr><td><br></td><td>def_arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ship_term_nm</td></tr>
		 * 	<tr><td><br></td><td>def_stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_inst_unit_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_proc_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>def_prod_pln_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sch_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_mng_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_num_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_ptn_nm</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_role_nm</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_upd_role_nm</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_role_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ_nm1</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ_nm2</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ_nm3</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ_nm4</td></tr>
		 * 	<tr><td><br></td><td>def_inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_ctl_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>def_bkf_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>def_main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_cost_bom_flg</td></tr>
		 * 	<tr><td><br></td><td>def_calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_calc_ptn_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_nm</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
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
		public MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
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
		protected void down_SELECT(MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_ITM_TYP_D_R> src0_0){
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm_lcl", "itm_typ_d_nm");
				addColumnPathMap("itm_typ_d_nm", "base_itm_typ_d_nm");
				addColumnPathMap("def_sls_flg", "def_sls_flg");
				addColumnPathMap("def_mfg_flg", "def_mfg_flg");
				addColumnPathMap("def_purc_flg", "def_purc_flg");
				addColumnPathMap("def_insp_flg", "def_insp_flg");
				addColumnPathMap("def_itm_jnl_cd", "def_itm_jnl_cd");
				addColumnPathMap("def_itm_jnl_nm", "def_itm_jnl_nm");
				addColumnPathMap("def_ac_itm_grp_cd", "def_ac_itm_grp_cd");
				addColumnPathMap("def_ac_itm_grp_nm", "def_ac_itm_grp_nm");
				addColumnPathMap("def_minus_stk_flg", "def_minus_stk_flg");
				addColumnPathMap("def_not_new_lot_flg", "def_not_new_lot_flg");
				addColumnPathMap("def_gi_alloc_flg", "def_gi_alloc_flg");
				addColumnPathMap("def_pack_alloc_flg", "def_pack_alloc_flg");
				addColumnPathMap("def_bp_lot_flg", "def_bp_lot_flg");
				addColumnPathMap("def_comp_spec_typ", "def_comp_spec_typ");
				addColumnPathMap("def_comp_rev_at_slo_flg", "def_comp_rev_at_slo_flg");
				addColumnPathMap("def_comp_core_itm_flg", "def_comp_core_itm_flg");
				addColumnPathMap("def_insp_bind_typ", "def_insp_bind_typ");
				addColumnPathMap("def_skip_chk_ship_flg", "def_skip_chk_ship_flg");
				addColumnPathMap("def_itm_spec_grp_cd", "def_itm_spec_grp_cd");
				addColumnPathMap("def_itm_spec_grp_nm", "def_itm_spec_grp_nm");
				addColumnPathMap("def_lmt_ctl_flg", "def_lmt_ctl_flg");
				addColumnPathMap("def_lmt_ctl_categ", "def_lmt_ctl_categ");
				addColumnPathMap("def_sls_upri_grp_cd", "def_sls_upri_grp_cd");
				addColumnPathMap("def_sls_upri_grp_nm", "def_sls_upri_grp_nm");
				addColumnPathMap("def_slo_proc_flg", "def_slo_proc_flg");
				addColumnPathMap("def_slo_proc_typ", "def_slo_proc_typ");
				addColumnPathMap("def_ship_inst_typ", "def_ship_inst_typ");
				addColumnPathMap("def_ship_lot_back_stop_flg", "def_ship_lot_back_stop_flg");
				addColumnPathMap("def_itm_ship_grp_cd", "def_itm_ship_grp_cd");
				addColumnPathMap("def_itm_ship_grp_nm", "def_itm_ship_grp_nm");
				addColumnPathMap("def_ship_valid_grp_cd", "def_ship_valid_grp_cd");
				addColumnPathMap("def_ship_valid_grp_nm", "def_ship_valid_grp_nm");
				addColumnPathMap("def_arr_skip_flg", "def_arr_skip_flg");
				addColumnPathMap("def_ship_term_cd", "def_ship_term_cd");
				addColumnPathMap("def_ship_term_nm", "def_ship_term_nm");
				addColumnPathMap("def_stk_lst_flg", "def_stk_lst_flg");
				addColumnPathMap("def_ver_flg", "def_ver_flg");
				addColumnPathMap("def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ");
				addColumnPathMap("def_sls_upri_cng_flg", "def_sls_upri_cng_flg");
				addColumnPathMap("def_purc_upri_cng_flg", "def_purc_upri_cng_flg");
				addColumnPathMap("def_prov_upri_cng_flg", "def_prov_upri_cng_flg");
				addColumnPathMap("def_mrp_proc_typ", "def_mrp_proc_typ");
				addColumnPathMap("def_rqmt_typ", "def_rqmt_typ");
				addColumnPathMap("def_prod_pln_typ", "def_prod_pln_typ");
				addColumnPathMap("def_dmnd_date_div_mons", "def_dmnd_date_div_mons");
				addColumnPathMap("def_alloc_margin_days", "def_alloc_margin_days");
				addColumnPathMap("def_mrp_alloc_margin_days", "def_mrp_alloc_margin_days");
				addColumnPathMap("def_mrp_opn_xfr_days", "def_mrp_opn_xfr_days");
				addColumnPathMap("def_inpt_itm_add_flg", "def_inpt_itm_add_flg");
				addColumnPathMap("def_inpt_itm_del_flg", "def_inpt_itm_del_flg");
				addColumnPathMap("def_sch_flg", "def_sch_flg");
				addColumnPathMap("def_lot_mng_typ", "def_lot_mng_typ");
				addColumnPathMap("def_lot_no_typ", "def_lot_no_typ");
				addColumnPathMap("def_lot_no_ptn_cd", "def_lot_no_ptn_cd");
				addColumnPathMap("def_lot_no_ptn_nm", "def_lot_no_ptn_nm");
				addColumnPathMap("def_sublot_mng_typ", "def_sublot_mng_typ");
				addColumnPathMap("def_sublot_no_typ", "def_sublot_no_typ");
				addColumnPathMap("def_sublot_no_ptn_cd", "def_sublot_no_ptn_cd");
				addColumnPathMap("def_sublot_no_ptn_nm", "def_sublot_no_ptn_nm");
				addColumnPathMap("def_sno1_mng_typ", "def_sno1_mng_typ");
				addColumnPathMap("def_slo_sno1_flg", "def_slo_sno1_flg");
				addColumnPathMap("def_rqmt_sno1_flg", "def_rqmt_sno1_flg");
				addColumnPathMap("def_sno1_num_typ", "def_sno1_num_typ");
				addColumnPathMap("def_sno1_ptn_cd", "def_sno1_ptn_cd");
				addColumnPathMap("def_sno1_ptn_nm", "def_sno1_ptn_nm");
				addColumnPathMap("def_sno2_mng_typ", "def_sno2_mng_typ");
				addColumnPathMap("def_slo_sno2_flg", "def_slo_sno2_flg");
				addColumnPathMap("def_rqmt_sno2_flg", "def_rqmt_sno2_flg");
				addColumnPathMap("def_sno2_num_typ", "def_sno2_num_typ");
				addColumnPathMap("def_sno2_ptn_cd", "def_sno2_ptn_cd");
				addColumnPathMap("def_sno2_ptn_nm", "def_sno2_ptn_nm");
				addColumnPathMap("def_sno3_mng_typ", "def_sno3_mng_typ");
				addColumnPathMap("def_slo_sno3_flg", "def_slo_sno3_flg");
				addColumnPathMap("def_rqmt_sno3_flg", "def_rqmt_sno3_flg");
				addColumnPathMap("def_sno3_num_typ", "def_sno3_num_typ");
				addColumnPathMap("def_sno3_ptn_cd", "def_sno3_ptn_cd");
				addColumnPathMap("def_sno3_ptn_nm", "def_sno3_ptn_nm");
				addColumnPathMap("def_sno4_mng_typ", "def_sno4_mng_typ");
				addColumnPathMap("def_slo_sno4_flg", "def_slo_sno4_flg");
				addColumnPathMap("def_rqmt_sno4_flg", "def_rqmt_sno4_flg");
				addColumnPathMap("def_sno4_num_typ", "def_sno4_num_typ");
				addColumnPathMap("def_sno4_ptn_cd", "def_sno4_ptn_cd");
				addColumnPathMap("def_sno4_ptn_nm", "def_sno4_ptn_nm");
				addColumnPathMap("def_mrkt_judg_flg", "def_mrkt_judg_flg");
				addColumnPathMap("def_mrkt_judg_role_cd", "def_mrkt_judg_role_cd");
				addColumnPathMap("def_mrkt_judg_role_nm", "def_mrkt_judg_role_nm");
				addColumnPathMap("def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_cd");
				addColumnPathMap("def_mrkt_judg_upd_role_nm", "def_mrkt_judg_upd_role_nm");
				addColumnPathMap("def_plnt_aprv_flg", "def_plnt_aprv_flg");
				addColumnPathMap("def_plnt_aprv_role_cd", "def_plnt_aprv_role_cd");
				addColumnPathMap("def_plnt_aprv_role_nm", "def_plnt_aprv_role_nm");
				addColumnPathMap("def_insp_aprv_flg", "def_insp_aprv_flg");
				addColumnPathMap("def_insp_aprv_role_cd", "def_insp_aprv_role_cd");
				addColumnPathMap("def_insp_aprv_role_nm", "def_insp_aprv_role_nm");
				addColumnPathMap("def_mfg_aprv_flg", "def_mfg_aprv_flg");
				addColumnPathMap("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd");
				addColumnPathMap("def_mfg_aprv_role_nm", "def_mfg_aprv_role_nm");
				addColumnPathMap("def_sno_typ1", "def_sno_typ1");
				addColumnPathMap("def_sno_typ2", "def_sno_typ2");
				addColumnPathMap("def_sno_typ3", "def_sno_typ3");
				addColumnPathMap("def_sno_typ4", "def_sno_typ4");
				addColumnPathMap("def_inst_lot_fix_flg", "def_inst_lot_fix_flg");
				addColumnPathMap("def_lot_mix_flg", "def_lot_mix_flg");
				addColumnPathMap("def_sublot_mix_flg", "def_sublot_mix_flg");
				addColumnPathMap("def_alloc_ctl_typ", "def_alloc_ctl_typ");
				addColumnPathMap("def_inpt_ctl_typ", "def_inpt_ctl_typ");
				addColumnPathMap("def_bkf_typ", "def_bkf_typ");
				addColumnPathMap("def_main_itm_flg", "def_main_itm_flg");
				addColumnPathMap("def_byprod_flg", "def_byprod_flg");
				addColumnPathMap("def_not_cost_bom_flg", "def_not_cost_bom_flg");
				addColumnPathMap("def_calc_ptn_cd", "def_calc_ptn_cd");
				addColumnPathMap("def_calc_ptn_nm", "def_calc_ptn_nm");
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
		protected void down_SELECT_c0_0(mcframe.serverMABC.MABCL0350.Srch01_Rslt1R r_dest, MAM_ITM_TYP_D_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt1R> dest, MCList<MAM_ITM_TYP_D_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_ITM_TYP_D_R r_src : src){
				mcframe.serverMABC.MABCL0350.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_LCL専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_LCLの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_LCL(MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_ITM_TYP_D_LCL_R> src0_0){
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
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
		protected void down_SELECT_LCL_c1_0(mcframe.serverMABC.MABCL0350.Srch01_Rslt2R r_dest, MAM_ITM_TYP_D_LCL_R r_src) {
		}

		/**
		 * 連携処理SELECT_LCL_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_LCL_c1_0(MCList<mcframe.serverMABC.MABCL0350.Srch01_Rslt2R> dest, MCList<MAM_ITM_TYP_D_LCL_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_LCL_c1_0();
			for(MAM_ITM_TYP_D_LCL_R r_src : src){
				mcframe.serverMABC.MABCL0350.Srch01_Rslt2R r_dest = dest.createRow();
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
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtlLcl_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtlLcl_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtlLcl_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtlLcl_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtlLcl_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtlLcl_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.crtItmTypDtl_UpdChk01();
			upd01 = mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.crtItmTypDtl_Upd01();
			chk02 = mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.crtItmTypDtlLcl_UpdChk01();
			upd02 = mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.crtItmTypDtlLcl_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR>)chk01.up(0);
			upd01_up0 = (MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR>)upd01.up(0);
			chk02_up0 = (MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR>)chk02.up(0);
			upd02_up0 = (MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR>)upd02.up(0);

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
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>def_sls_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_jnl_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ac_itm_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_minus_stk_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_new_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_gi_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_pack_alloc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_bp_lot_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_spec_typ</td></tr>
		 * 	<tr><td><br></td><td>def_comp_rev_at_slo_flg</td></tr>
		 * 	<tr><td><br></td><td>def_comp_core_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_bind_typ</td></tr>
		 * 	<tr><td><br></td><td>def_skip_chk_ship_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_spec_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lmt_ctl_categ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_flg</td></tr>
		 * 	<tr><td><br></td><td>def_slo_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_inst_typ</td></tr>
		 * 	<tr><td><br></td><td>def_ship_lot_back_stop_flg</td></tr>
		 * 	<tr><td><br></td><td>def_itm_ship_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_ship_valid_grp_cd</td></tr>
		 * 	<tr><td><br></td><td>def_arr_skip_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ship_term_cd</td></tr>
		 * 	<tr><td><br></td><td>def_stk_lst_flg</td></tr>
		 * 	<tr><td><br></td><td>def_ver_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_inst_unit_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sls_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_purc_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_prov_upri_cng_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_proc_typ</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_typ</td></tr>
		 * 	<tr><td><br></td><td>def_prod_pln_typ</td></tr>
		 * 	<tr><td><br></td><td>def_dmnd_date_div_mons</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_alloc_margin_days</td></tr>
		 * 	<tr><td><br></td><td>def_mrp_opn_xfr_days</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_add_flg</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_itm_del_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sch_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_lot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_no_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno1_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno1_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno2_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno2_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno3_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno3_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_mng_typ</td></tr>
		 * 	<tr><td><br></td><td>def_slo_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_rqmt_sno4_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_num_typ</td></tr>
		 * 	<tr><td><br></td><td>def_sno4_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mrkt_judg_upd_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_plnt_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_insp_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_flg</td></tr>
		 * 	<tr><td><br></td><td>def_mfg_aprv_role_cd</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ1</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ2</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ3</td></tr>
		 * 	<tr><td><br></td><td>def_sno_typ4</td></tr>
		 * 	<tr><td><br></td><td>def_inst_lot_fix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_lot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_sublot_mix_flg</td></tr>
		 * 	<tr><td><br></td><td>def_alloc_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_inpt_ctl_typ</td></tr>
		 * 	<tr><td><br></td><td>def_bkf_typ</td></tr>
		 * 	<tr><td><br></td><td>def_main_itm_flg</td></tr>
		 * 	<tr><td><br></td><td>def_byprod_flg</td></tr>
		 * 	<tr><td><br></td><td>def_not_cost_bom_flg</td></tr>
		 * 	<tr><td><br></td><td>def_calc_ptn_cd</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>lcl_cd</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src_Upd01_Dtl1){
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("def_sls_flg", "def_sls_flg");
				addColumnPathMap("def_mfg_flg", "def_mfg_flg");
				addColumnPathMap("def_purc_flg", "def_purc_flg");
				addColumnPathMap("def_insp_flg", "def_insp_flg");
				addColumnPathMap("def_itm_jnl_cd", "def_itm_jnl_cd");
				addColumnPathMap("def_ac_itm_grp_cd", "def_ac_itm_grp_cd");
				addColumnPathMap("def_minus_stk_flg", "def_minus_stk_flg");
				addColumnPathMap("def_not_new_lot_flg", "def_not_new_lot_flg");
				addColumnPathMap("def_gi_alloc_flg", "def_gi_alloc_flg");
				addColumnPathMap("def_pack_alloc_flg", "def_pack_alloc_flg");
				addColumnPathMap("def_bp_lot_flg", "def_bp_lot_flg");
				addColumnPathMap("def_comp_spec_typ", "def_comp_spec_typ");
				addColumnPathMap("def_comp_rev_at_slo_flg", "def_comp_rev_at_slo_flg");
				addColumnPathMap("def_comp_core_itm_flg", "def_comp_core_itm_flg");
				addColumnPathMap("def_insp_bind_typ", "def_insp_bind_typ");
				addColumnPathMap("def_skip_chk_ship_flg", "def_skip_chk_ship_flg");
				addColumnPathMap("def_itm_spec_grp_cd", "def_itm_spec_grp_cd");
				addColumnPathMap("def_lmt_ctl_flg", "def_lmt_ctl_flg");
				addColumnPathMap("def_lmt_ctl_categ", "def_lmt_ctl_categ");
				addColumnPathMap("def_sls_upri_grp_cd", "def_sls_upri_grp_cd");
				addColumnPathMap("def_slo_proc_flg", "def_slo_proc_flg");
				addColumnPathMap("def_slo_proc_typ", "def_slo_proc_typ");
				addColumnPathMap("def_ship_inst_typ", "def_ship_inst_typ");
				addColumnPathMap("def_ship_lot_back_stop_flg", "def_ship_lot_back_stop_flg");
				addColumnPathMap("def_itm_ship_grp_cd", "def_itm_ship_grp_cd");
				addColumnPathMap("def_ship_valid_grp_cd", "def_ship_valid_grp_cd");
				addColumnPathMap("def_arr_skip_flg", "def_arr_skip_flg");
				addColumnPathMap("def_ship_term_cd", "def_ship_term_cd");
				addColumnPathMap("def_stk_lst_flg", "def_stk_lst_flg");
				addColumnPathMap("def_ver_flg", "def_ver_flg");
				addColumnPathMap("def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ");
				addColumnPathMap("def_sls_upri_cng_flg", "def_sls_upri_cng_flg");
				addColumnPathMap("def_purc_upri_cng_flg", "def_purc_upri_cng_flg");
				addColumnPathMap("def_prov_upri_cng_flg", "def_prov_upri_cng_flg");
				addColumnPathMap("def_mrp_proc_typ", "def_mrp_proc_typ");
				addColumnPathMap("def_rqmt_typ", "def_rqmt_typ");
				addColumnPathMap("def_prod_pln_typ", "def_prod_pln_typ");
				addColumnPathMap("def_dmnd_date_div_mons", "def_dmnd_date_div_mons");
				addColumnPathMap("def_alloc_margin_days", "def_alloc_margin_days");
				addColumnPathMap("def_mrp_alloc_margin_days", "def_mrp_alloc_margin_days");
				addColumnPathMap("def_mrp_opn_xfr_days", "def_mrp_opn_xfr_days");
				addColumnPathMap("def_inpt_itm_add_flg", "def_inpt_itm_add_flg");
				addColumnPathMap("def_inpt_itm_del_flg", "def_inpt_itm_del_flg");
				addColumnPathMap("def_sch_flg", "def_sch_flg");
				addColumnPathMap("def_lot_mng_typ", "def_lot_mng_typ");
				addColumnPathMap("def_lot_no_typ", "def_lot_no_typ");
				addColumnPathMap("def_lot_no_ptn_cd", "def_lot_no_ptn_cd");
				addColumnPathMap("def_sublot_mng_typ", "def_sublot_mng_typ");
				addColumnPathMap("def_sublot_no_typ", "def_sublot_no_typ");
				addColumnPathMap("def_sublot_no_ptn_cd", "def_sublot_no_ptn_cd");
				addColumnPathMap("def_sno1_mng_typ", "def_sno1_mng_typ");
				addColumnPathMap("def_slo_sno1_flg", "def_slo_sno1_flg");
				addColumnPathMap("def_rqmt_sno1_flg", "def_rqmt_sno1_flg");
				addColumnPathMap("def_sno1_num_typ", "def_sno1_num_typ");
				addColumnPathMap("def_sno1_ptn_cd", "def_sno1_ptn_cd");
				addColumnPathMap("def_sno2_mng_typ", "def_sno2_mng_typ");
				addColumnPathMap("def_slo_sno2_flg", "def_slo_sno2_flg");
				addColumnPathMap("def_rqmt_sno2_flg", "def_rqmt_sno2_flg");
				addColumnPathMap("def_sno2_num_typ", "def_sno2_num_typ");
				addColumnPathMap("def_sno2_ptn_cd", "def_sno2_ptn_cd");
				addColumnPathMap("def_sno3_mng_typ", "def_sno3_mng_typ");
				addColumnPathMap("def_slo_sno3_flg", "def_slo_sno3_flg");
				addColumnPathMap("def_rqmt_sno3_flg", "def_rqmt_sno3_flg");
				addColumnPathMap("def_sno3_num_typ", "def_sno3_num_typ");
				addColumnPathMap("def_sno3_ptn_cd", "def_sno3_ptn_cd");
				addColumnPathMap("def_sno4_mng_typ", "def_sno4_mng_typ");
				addColumnPathMap("def_slo_sno4_flg", "def_slo_sno4_flg");
				addColumnPathMap("def_rqmt_sno4_flg", "def_rqmt_sno4_flg");
				addColumnPathMap("def_sno4_num_typ", "def_sno4_num_typ");
				addColumnPathMap("def_sno4_ptn_cd", "def_sno4_ptn_cd");
				addColumnPathMap("def_mrkt_judg_flg", "def_mrkt_judg_flg");
				addColumnPathMap("def_mrkt_judg_role_cd", "def_mrkt_judg_role_cd");
				addColumnPathMap("def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_cd");
				addColumnPathMap("def_plnt_aprv_flg", "def_plnt_aprv_flg");
				addColumnPathMap("def_plnt_aprv_role_cd", "def_plnt_aprv_role_cd");
				addColumnPathMap("def_insp_aprv_flg", "def_insp_aprv_flg");
				addColumnPathMap("def_insp_aprv_role_cd", "def_insp_aprv_role_cd");
				addColumnPathMap("def_mfg_aprv_flg", "def_mfg_aprv_flg");
				addColumnPathMap("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd");
				addColumnPathMap("def_sno_typ1", "def_sno_typ1");
				addColumnPathMap("def_sno_typ2", "def_sno_typ2");
				addColumnPathMap("def_sno_typ3", "def_sno_typ3");
				addColumnPathMap("def_sno_typ4", "def_sno_typ4");
				addColumnPathMap("def_inst_lot_fix_flg", "def_inst_lot_fix_flg");
				addColumnPathMap("def_lot_mix_flg", "def_lot_mix_flg");
				addColumnPathMap("def_sublot_mix_flg", "def_sublot_mix_flg");
				addColumnPathMap("def_alloc_ctl_typ", "def_alloc_ctl_typ");
				addColumnPathMap("def_inpt_ctl_typ", "def_inpt_ctl_typ");
				addColumnPathMap("def_bkf_typ", "def_bkf_typ");
				addColumnPathMap("def_main_itm_flg", "def_main_itm_flg");
				addColumnPathMap("def_byprod_flg", "def_byprod_flg");
				addColumnPathMap("def_not_cost_bom_flg", "def_not_cost_bom_flg");
				addColumnPathMap("def_calc_ptn_cd", "def_calc_ptn_cd");
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
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
				addColumnPathMap("def_sls_flg", "def_sls_flg");
				addColumnPathMap("def_mfg_flg", "def_mfg_flg");
				addColumnPathMap("def_purc_flg", "def_purc_flg");
				addColumnPathMap("def_insp_flg", "def_insp_flg");
				addColumnPathMap("def_itm_jnl_cd", "def_itm_jnl_cd");
				addColumnPathMap("def_ac_itm_grp_cd", "def_ac_itm_grp_cd");
				addColumnPathMap("def_minus_stk_flg", "def_minus_stk_flg");
				addColumnPathMap("def_not_new_lot_flg", "def_not_new_lot_flg");
				addColumnPathMap("def_gi_alloc_flg", "def_gi_alloc_flg");
				addColumnPathMap("def_pack_alloc_flg", "def_pack_alloc_flg");
				addColumnPathMap("def_bp_lot_flg", "def_bp_lot_flg");
				addColumnPathMap("def_comp_spec_typ", "def_comp_spec_typ");
				addColumnPathMap("def_comp_rev_at_slo_flg", "def_comp_rev_at_slo_flg");
				addColumnPathMap("def_comp_core_itm_flg", "def_comp_core_itm_flg");
				addColumnPathMap("def_insp_bind_typ", "def_insp_bind_typ");
				addColumnPathMap("def_skip_chk_ship_flg", "def_skip_chk_ship_flg");
				addColumnPathMap("def_itm_spec_grp_cd", "def_itm_spec_grp_cd");
				addColumnPathMap("def_lmt_ctl_flg", "def_lmt_ctl_flg");
				addColumnPathMap("def_lmt_ctl_categ", "def_lmt_ctl_categ");
				addColumnPathMap("def_sls_upri_grp_cd", "def_sls_upri_grp_cd");
				addColumnPathMap("def_slo_proc_flg", "def_slo_proc_flg");
				addColumnPathMap("def_slo_proc_typ", "def_slo_proc_typ");
				addColumnPathMap("def_ship_inst_typ", "def_ship_inst_typ");
				addColumnPathMap("def_ship_lot_back_stop_flg", "def_ship_lot_back_stop_flg");
				addColumnPathMap("def_itm_ship_grp_cd", "def_itm_ship_grp_cd");
				addColumnPathMap("def_ship_valid_grp_cd", "def_ship_valid_grp_cd");
				addColumnPathMap("def_arr_skip_flg", "def_arr_skip_flg");
				addColumnPathMap("def_ship_term_cd", "def_ship_term_cd");
				addColumnPathMap("def_stk_lst_flg", "def_stk_lst_flg");
				addColumnPathMap("def_ver_flg", "def_ver_flg");
				addColumnPathMap("def_mfg_inst_unit_typ", "def_mfg_inst_unit_typ");
				addColumnPathMap("def_sls_upri_cng_flg", "def_sls_upri_cng_flg");
				addColumnPathMap("def_purc_upri_cng_flg", "def_purc_upri_cng_flg");
				addColumnPathMap("def_prov_upri_cng_flg", "def_prov_upri_cng_flg");
				addColumnPathMap("def_mrp_proc_typ", "def_mrp_proc_typ");
				addColumnPathMap("def_rqmt_typ", "def_rqmt_typ");
				addColumnPathMap("def_prod_pln_typ", "def_prod_pln_typ");
				addColumnPathMap("def_dmnd_date_div_mons", "def_dmnd_date_div_mons");
				addColumnPathMap("def_alloc_margin_days", "def_alloc_margin_days");
				addColumnPathMap("def_mrp_alloc_margin_days", "def_mrp_alloc_margin_days");
				addColumnPathMap("def_mrp_opn_xfr_days", "def_mrp_opn_xfr_days");
				addColumnPathMap("def_inpt_itm_add_flg", "def_inpt_itm_add_flg");
				addColumnPathMap("def_inpt_itm_del_flg", "def_inpt_itm_del_flg");
				addColumnPathMap("def_sch_flg", "def_sch_flg");
				addColumnPathMap("def_lot_mng_typ", "def_lot_mng_typ");
				addColumnPathMap("def_lot_no_typ", "def_lot_no_typ");
				addColumnPathMap("def_lot_no_ptn_cd", "def_lot_no_ptn_cd");
				addColumnPathMap("def_sublot_mng_typ", "def_sublot_mng_typ");
				addColumnPathMap("def_sublot_no_typ", "def_sublot_no_typ");
				addColumnPathMap("def_sublot_no_ptn_cd", "def_sublot_no_ptn_cd");
				addColumnPathMap("def_sno1_mng_typ", "def_sno1_mng_typ");
				addColumnPathMap("def_slo_sno1_flg", "def_slo_sno1_flg");
				addColumnPathMap("def_rqmt_sno1_flg", "def_rqmt_sno1_flg");
				addColumnPathMap("def_sno1_num_typ", "def_sno1_num_typ");
				addColumnPathMap("def_sno1_ptn_cd", "def_sno1_ptn_cd");
				addColumnPathMap("def_sno2_mng_typ", "def_sno2_mng_typ");
				addColumnPathMap("def_slo_sno2_flg", "def_slo_sno2_flg");
				addColumnPathMap("def_rqmt_sno2_flg", "def_rqmt_sno2_flg");
				addColumnPathMap("def_sno2_num_typ", "def_sno2_num_typ");
				addColumnPathMap("def_sno2_ptn_cd", "def_sno2_ptn_cd");
				addColumnPathMap("def_sno3_mng_typ", "def_sno3_mng_typ");
				addColumnPathMap("def_slo_sno3_flg", "def_slo_sno3_flg");
				addColumnPathMap("def_rqmt_sno3_flg", "def_rqmt_sno3_flg");
				addColumnPathMap("def_sno3_num_typ", "def_sno3_num_typ");
				addColumnPathMap("def_sno3_ptn_cd", "def_sno3_ptn_cd");
				addColumnPathMap("def_sno4_mng_typ", "def_sno4_mng_typ");
				addColumnPathMap("def_slo_sno4_flg", "def_slo_sno4_flg");
				addColumnPathMap("def_rqmt_sno4_flg", "def_rqmt_sno4_flg");
				addColumnPathMap("def_sno4_num_typ", "def_sno4_num_typ");
				addColumnPathMap("def_sno4_ptn_cd", "def_sno4_ptn_cd");
				addColumnPathMap("def_mrkt_judg_flg", "def_mrkt_judg_flg");
				addColumnPathMap("def_mrkt_judg_role_cd", "def_mrkt_judg_role_cd");
				addColumnPathMap("def_mrkt_judg_upd_role_cd", "def_mrkt_judg_upd_role_cd");
				addColumnPathMap("def_plnt_aprv_flg", "def_plnt_aprv_flg");
				addColumnPathMap("def_plnt_aprv_role_cd", "def_plnt_aprv_role_cd");
				addColumnPathMap("def_insp_aprv_flg", "def_insp_aprv_flg");
				addColumnPathMap("def_insp_aprv_role_cd", "def_insp_aprv_role_cd");
				addColumnPathMap("def_mfg_aprv_flg", "def_mfg_aprv_flg");
				addColumnPathMap("def_mfg_aprv_role_cd", "def_mfg_aprv_role_cd");
				addColumnPathMap("def_sno_typ1", "def_sno_typ1");
				addColumnPathMap("def_sno_typ2", "def_sno_typ2");
				addColumnPathMap("def_sno_typ3", "def_sno_typ3");
				addColumnPathMap("def_sno_typ4", "def_sno_typ4");
				addColumnPathMap("def_inst_lot_fix_flg", "def_inst_lot_fix_flg");
				addColumnPathMap("def_lot_mix_flg", "def_lot_mix_flg");
				addColumnPathMap("def_sublot_mix_flg", "def_sublot_mix_flg");
				addColumnPathMap("def_alloc_ctl_typ", "def_alloc_ctl_typ");
				addColumnPathMap("def_inpt_ctl_typ", "def_inpt_ctl_typ");
				addColumnPathMap("def_bkf_typ", "def_bkf_typ");
				addColumnPathMap("def_main_itm_flg", "def_main_itm_flg");
				addColumnPathMap("def_byprod_flg", "def_byprod_flg");
				addColumnPathMap("def_not_cost_bom_flg", "def_not_cost_bom_flg");
				addColumnPathMap("def_calc_ptn_cd", "def_calc_ptn_cd");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0350.ItmTypDtl_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src_Upd01_Dtl2){
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
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
		protected void up_CALL_OPE02_chk02_0(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk02_0(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk02_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("lcl_cd", "lcl_cd");
				addColumnPathMap("itm_typ_d_nm", "itm_typ_d_nm");
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
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0350.ItmTypDtlLcl_UpdChk01_DtlR r_dest = dest.createRow();
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
		private final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.ItmTypDtl_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.crtItmTypDtl_DelChk01();
			del01 = mcframe.serverMABC.MABCL0350.MABCL_ItmTypDtlReg.crtItmTypDtl_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>itm_typ</td></tr>
		 * 	<tr><td><br></td><td>itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABCL_ItmTypDtlReg)MABCL_ItmTypDtlReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("itm_typ", "itm_typ");
				addColumnPathMap("itm_typ_d_cd", "itm_typ_d_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_dest, mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> dest, MCList<mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_src : src){
				mcframe.serverMABC.MABCL0350.ItmTypDtl_DelChk01_DtlR r_dest = dest.createRow();
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