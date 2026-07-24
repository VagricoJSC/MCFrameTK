package mcframe.serverMABS.MABSL0210;

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
 * "MABSL_LotInhReg"ロジッククラスです。<p>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSL_LotInhReg_MC_A extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase {
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
	public static final String LOGIC_ID = "MABSL0210";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** ロジックIDを取得します。 */
	public String getLogicID(){ return LOGIC_ID; }

	//FMCB CTRL_FIELD_METHOD START

	protected MABSL_LotInhReg.LotInhDest_UpdChk01 aLotInhDest_UpdChk01;

	protected void initLotInhDest_UpdChk01() {
		this.info = PDef.MA_MABSL0210_LotInhDest_UpdChk01_INFO;
		this.aLotInhDest_UpdChk01 = ((MABSL_LotInhReg)this).new LotInhDest_UpdChk01();
	}

	public static MABSL_LotInhReg.LotInhDest_UpdChk01 crtLotInhDest_UpdChk01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initLotInhDest_UpdChk01();
		return lgc.aLotInhDest_UpdChk01;
	}

	protected void paramLotInhDest_UpdChk01(MCParam p) {
		if (this.aLotInhDest_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInhDest_UpdChk01.up0());
	}

	protected void doLotInhDest_UpdChk01() {
		aLotInhDest_UpdChk01.call();
	};

	/**
	 * LotInhDest_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR createLotInhDest_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.create();
	}

	/**
	 * LotInhDest_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> createLotInhDest_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.LotInhDest_Upd01 aLotInhDest_Upd01;

	protected void initLotInhDest_Upd01() {
		this.info = PDef.MA_MABSL0210_LotInhDest_Upd01_INFO;
		this.aLotInhDest_Upd01 = ((MABSL_LotInhReg)this).new LotInhDest_Upd01();
	}

	public static MABSL_LotInhReg.LotInhDest_Upd01 crtLotInhDest_Upd01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initLotInhDest_Upd01();
		return lgc.aLotInhDest_Upd01;
	}

	protected void paramLotInhDest_Upd01(MCParam p) {
		if (this.aLotInhDest_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInhDest_Upd01.up0());
	}

	protected void doLotInhDest_Upd01() {
		aLotInhDest_Upd01.call();
	};

	/**
	 * LotInhDest_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR createLotInhDest_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.create();
	}

	/**
	 * LotInhDest_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> createLotInhDest_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.LotInhSrc_UpdChk01 aLotInhSrc_UpdChk01;

	protected void initLotInhSrc_UpdChk01() {
		this.info = PDef.MA_MABSL0210_LotInhSrc_UpdChk01_INFO;
		this.aLotInhSrc_UpdChk01 = ((MABSL_LotInhReg)this).new LotInhSrc_UpdChk01();
	}

	public static MABSL_LotInhReg.LotInhSrc_UpdChk01 crtLotInhSrc_UpdChk01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initLotInhSrc_UpdChk01();
		return lgc.aLotInhSrc_UpdChk01;
	}

	protected void paramLotInhSrc_UpdChk01(MCParam p) {
		if (this.aLotInhSrc_UpdChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInhSrc_UpdChk01.up0());
	}

	protected void doLotInhSrc_UpdChk01() {
		aLotInhSrc_UpdChk01.call();
	};

	/**
	 * LotInhSrc_UpdChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR createLotInhSrc_UpdChk01_DtlR(){
		return mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.create();
	}

	/**
	 * LotInhSrc_UpdChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> createLotInhSrc_UpdChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.LotInhSrc_Upd01 aLotInhSrc_Upd01;

	protected void initLotInhSrc_Upd01() {
		this.info = PDef.MA_MABSL0210_LotInhSrc_Upd01_INFO;
		this.aLotInhSrc_Upd01 = ((MABSL_LotInhReg)this).new LotInhSrc_Upd01();
	}

	public static MABSL_LotInhReg.LotInhSrc_Upd01 crtLotInhSrc_Upd01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initLotInhSrc_Upd01();
		return lgc.aLotInhSrc_Upd01;
	}

	protected void paramLotInhSrc_Upd01(MCParam p) {
		if (this.aLotInhSrc_Upd01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInhSrc_Upd01.up0());
	}

	protected void doLotInhSrc_Upd01() {
		aLotInhSrc_Upd01.call();
	};

	/**
	 * LotInhSrc_Upd01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR createLotInhSrc_Upd01_DtlR(){
		return mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.create();
	}

	/**
	 * LotInhSrc_Upd01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> createLotInhSrc_Upd01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.LotInh_DelChk01 aLotInh_DelChk01;

	protected void initLotInh_DelChk01() {
		this.info = PDef.MA_MABSL0210_LotInh_DelChk01_INFO;
		this.aLotInh_DelChk01 = ((MABSL_LotInhReg)this).new LotInh_DelChk01();
	}

	public static MABSL_LotInhReg.LotInh_DelChk01 crtLotInh_DelChk01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initLotInh_DelChk01();
		return lgc.aLotInh_DelChk01;
	}

	protected void paramLotInh_DelChk01(MCParam p) {
		if (this.aLotInh_DelChk01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInh_DelChk01.up0());
	}

	protected void doLotInh_DelChk01() {
		aLotInh_DelChk01.call();
	};

	/**
	 * LotInh_DelChk01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR createLotInh_DelChk01_DtlR(){
		return mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.create();
	}

	/**
	 * LotInh_DelChk01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> createLotInh_DelChk01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.LotInh_Del01 aLotInh_Del01;

	protected void initLotInh_Del01() {
		this.info = PDef.MA_MABSL0210_LotInh_Del01_INFO;
		this.aLotInh_Del01 = ((MABSL_LotInhReg)this).new LotInh_Del01();
	}

	public static MABSL_LotInhReg.LotInh_Del01 crtLotInh_Del01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initLotInh_Del01();
		return lgc.aLotInh_Del01;
	}

	protected void paramLotInh_Del01(MCParam p) {
		if (this.aLotInh_Del01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aLotInh_Del01.up0());
	}

	protected void doLotInh_Del01() {
		aLotInh_Del01.call();
	};

	/**
	 * LotInh_Del01_DtlブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR createLotInh_Del01_DtlR(){
		return mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.create();
	}

	/**
	 * LotInh_Del01_DtlブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> createLotInh_Del01_DtlL(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.Srch01 aSrch01;

	protected void initSrch01() {
		this.info = PDef.MA_MABSL0210_Srch01_INFO;
		this.aSrch01 = ((MABSL_LotInhReg)this).new Srch01();
	}

	public static MABSL_LotInhReg.Srch01 crtSrch01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
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
	public mcframe.serverMABS.MABSL0210.Srch01_CndR createSrch01_CndR(){
		return mcframe.serverMABS.MABSL0210.Srch01_CndR.create();
	}

	/**
	 * Srch01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.Srch01_Rslt1R createSrch01_Rslt1R(){
		return mcframe.serverMABS.MABSL0210.Srch01_Rslt1R.create();
	}

	/**
	 * Srch01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt1R> createSrch01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL0210.Srch01_Rslt1R.class);
	}

	/**
	 * Srch01_Rslt2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.Srch01_Rslt2R createSrch01_Rslt2R(){
		return mcframe.serverMABS.MABSL0210.Srch01_Rslt2R.create();
	}

	/**
	 * Srch01_Rslt2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt2R> createSrch01_Rslt2L(){
		return MCList.create(mcframe.serverMABS.MABSL0210.Srch01_Rslt2R.class);
	}
	protected MABSL_LotInhReg.Upd01 aUpd01;

	protected void initUpd01() {
		this.info = PDef.MA_MABSL0210_Upd01_INFO;
		this.aUpd01 = ((MABSL_LotInhReg)this).new Upd01();
	}

	public static MABSL_LotInhReg.Upd01 crtUpd01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
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
	public mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR createUpd01_Dtl1R(){
		return mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> createUpd01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
	}

	/**
	 * Upd01_Dtl2ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR createUpd01_Dtl2R(){
		return mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.create();
	}

	/**
	 * Upd01_Dtl2ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> createUpd01_Dtl2L(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.Del01 aDel01;

	protected void initDel01() {
		this.info = PDef.MA_MABSL0210_Del01_INFO;
		this.aDel01 = ((MABSL_LotInhReg)this).new Del01();
	}

	public static MABSL_LotInhReg.Del01 crtDel01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
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
	public mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR createDel01_Dtl1R(){
		return mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.create();
	}

	/**
	 * Del01_Dtl1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> createDel01_Dtl1L(){
		return MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);
	}
	protected MABSL_LotInhReg.Sprt01 aSprt01;

	protected void initSprt01() {
		this.info = PDef.MA_MABSL0210_Sprt01_INFO;
		this.aSprt01 = ((MABSL_LotInhReg)this).new Sprt01();
	}

	public static MABSL_LotInhReg.Sprt01 crtSprt01() {
		MABSL_LotInhReg lgc = new MABSL_LotInhReg();
		lgc.initSprt01();
		return lgc.aSprt01;
	}

	protected void paramSprt01(MCParam p) {
		if (this.aSprt01 == null) {
			return;
		}
		p.setDef(this.info.def);
		p.addUpBlock(aSprt01.up0());
		p.addDownBlock(aSprt01.down0());
	}

	protected void doSprt01() {
		aSprt01.call();
	};

	/**
	 * Sprt01_CndブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.Sprt01_CndR createSprt01_CndR(){
		return mcframe.serverMABS.MABSL0210.Sprt01_CndR.create();
	}

	/**
	 * Sprt01_Rslt1ブロックのRowコンテナを作成します。
	 *
	 * @return Rowコンテナ
	 */
	public mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R createSprt01_Rslt1R(){
		return mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R.create();
	}

	/**
	 * Sprt01_Rslt1ブロックのListコンテナを作成します。
	 *
	 * @return Listコンテナ
	 */
	public MCList<mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R> createSprt01_Rslt1L(){
		return MCList.create(mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R.class);
	}

	//FMCB CTRL_FIELD_METHOD END

	//FMCB LOGIC_CONTROLLER START

	/**
	 * LotInhDest_UpdChk01オペレーション.<p>
	 *
	 * ロット継承先マスタを登録する前のチェックを行う<br>
	 */
	abstract public class LotInhDest_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInhDest_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected LotInhDest_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);

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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotInhDest_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR createLotInhDest_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.create();
		}

		/**
		 * LotInhDest_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> createLotInhDest_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col</td></tr>
		 * 	<tr><td><br></td><td>overflow_err_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}


	}
	/**
	 * LotInhDest_Upd01オペレーション.<p>
	 *
	 * ロット継承先マスタを登録する<br>
	 */
	abstract public class LotInhDest_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInhDest_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_DEST_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_DEST_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOT_INH_DEST_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_DEST_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOT_INH_DEST_R> updMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected LotInhDest_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_LOT_INH_DEST_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_LOT_INH_DEST_R>)updMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_LOT_INH_DEST_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster_up0, up0());
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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotInhDest_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR createLotInhDest_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.create();
		}

		/**
		 * LotInhDest_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> createLotInhDest_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col</td></tr>
		 * 	<tr><td><br></td><td>overflow_err_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_LOT_INH_DEST_R> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> src_LotInhDest_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_LotInhDest_Upd01_Dtl);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("lot_inh_typ", "lot_inh_typ");
				addColumnPathMap("add_concat_col", "add_concat_col");
				addColumnPathMap("overflow_err_flg", "overflow_err_flg");
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
		protected void up_UPDATE_updMaster_0(MAM_LOT_INH_DEST_R r_dest, mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_LOT_INH_DEST_R> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_src : src){
				MAM_LOT_INH_DEST_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
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
	 * LotInhSrc_UpdChk01オペレーション.<p>
	 *
	 * ロット継承元マスタを登録する前のチェックを行う<br>
	 */
	abstract public class LotInhSrc_UpdChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInhSrc_UpdChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected LotInhSrc_UpdChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);

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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotInhSrc_UpdChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR createLotInhSrc_UpdChk01_DtlR(){
			return mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.create();
		}

		/**
		 * LotInhSrc_UpdChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> createLotInhSrc_UpdChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}


	}
	/**
	 * LotInhSrc_Upd01オペレーション.<p>
	 *
	 * ロット継承元マスタを登録する<br>
	 */
	abstract public class LotInhSrc_Upd01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLUpdater {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInhSrc_Upd01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #updMaster}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #updMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> updMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOT_INH_SRC_R> updMaster_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 MAIN<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #chkMaster}）<br>
		 */
		public final String MAIN = "MAIN";

		/**
		 * DBC連携 chkMaster<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #chkMaster_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> chkMaster;
		// 連携ロジック上り
		public final MCList<MAM_LOT_INH_SRC_R> chkMaster_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected LotInhSrc_Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			chkMaster = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster_up0 = (MCList<MAM_LOT_INH_SRC_R>)updMaster.up(1);
			chkMaster_up0 = (MCList<MAM_LOT_INH_SRC_R>)chkMaster.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster);
			appendOpe(MAIN, chkMaster);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #updMaster_up0}）<br>
		 * MAIN<br>
		 * up0() => MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #chkMaster_up0}）<br>
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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotInhSrc_Upd01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR createLotInhSrc_Upd01_DtlR(){
			return mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.create();
		}

		/**
		 * LotInhSrc_Upd01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> createLotInhSrc_Upd01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_LOT_INH_SRC_R> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src_LotInhSrc_Upd01_Dtl){
			up_UPDATE_updMaster_0(dest0_0, src_LotInhSrc_Upd01_Dtl);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("prio", "prio");
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
		protected void up_UPDATE_updMaster_0(MAM_LOT_INH_SRC_R r_dest, mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster_0(MCList<MAM_LOT_INH_SRC_R> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster_0();
			for(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src : src){
				MAM_LOT_INH_SRC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------MAIN専用up関連メソッド--------------------------
		/**
		 * オペレーショングループMAINの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_MAIN(MCList<MAM_LOT_INH_SRC_R> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src_LotInhSrc_Upd01_Dtl){
			up_MAIN_chkMaster_0(dest0_0, src_LotInhSrc_Upd01_Dtl);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
			}
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_MAIN_chkMaster_0(MAM_LOT_INH_SRC_R r_dest, mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理MAIN_chkMasterの上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_MAIN_chkMaster_0(MCList<MAM_LOT_INH_SRC_R> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_MAIN_chkMaster_0();
			for(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src : src){
				MAM_LOT_INH_SRC_R r_dest = dest.createRow();
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
	 * LotInh_DelChk01オペレーション.<p>
	 *
	 * ロット継承先マスタ、ロット継承元マスタを削除する前のチェックを行う<br>
	 */
	abstract public class LotInh_DelChk01 extends mcframe.serverMAUD.MAUDL5010.MAUDL_LogicBase.Checker {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInh_DelChk01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> up0;
		
		
		// コンストラクタ
		protected LotInh_DelChk01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);

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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotInh_DelChk01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR createLotInh_DelChk01_DtlR(){
			return mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.create();
		}

		/**
		 * LotInh_DelChk01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> createLotInh_DelChk01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}


	}
	/**
	 * LotInh_Del01オペレーション.<p>
	 *
	 * ロット継承先マスタ、ロット継承元マスタを削除する<br>
	 */
	abstract public class LotInh_Del01 extends mcframe.serverMAUD.MAUDL6020.MAUDL_LCLRLDeleter {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "LotInh_Del01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 UPDATE<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #updMaster1}）<br>
		 */
		public final String UPDATE = "UPDATE";

		/**
		 * DBC連携 updMaster1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 * 第1 上りブロッククラス MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> updMaster1;
		// 連携ロジック上り
		public final MCList<MAM_LOT_INH_SRC_R> updMaster1_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected LotInh_Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			updMaster1 = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			updMaster1_up0 = (MCList<MAM_LOT_INH_SRC_R>)updMaster1.up(1);

			// オペレーション、オペレーショングループの登録
			appendOpe(UPDATE, updMaster1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * UPDATE<br>
		 * up0() => MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #updMaster1_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(UPDATE)) {
				up_UPDATE(updMaster1_up0, up0());
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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * LotInh_Del01_DtlブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR createLotInh_Del01_DtlR(){
			return mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.create();
		}

		/**
		 * LotInh_Del01_DtlブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> createLotInh_Del01_DtlL(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------UPDATE専用up関連メソッド--------------------------
		/**
		 * オペレーショングループUPDATEの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_UPDATE(MCList<MAM_LOT_INH_SRC_R> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> src_LotInh_Del01_Dtl){
			up_UPDATE_updMaster1_0(dest0_0, src_LotInh_Del01_Dtl);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_UPDATE_updMaster1_0(MAM_LOT_INH_SRC_R r_dest, mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理UPDATE_updMaster1の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_UPDATE_updMaster1_0(MCList<MAM_LOT_INH_SRC_R> dest, MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_UPDATE_updMaster1_0();
			for(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_src : src){
				MAM_LOT_INH_SRC_R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_UPDATE_updMaster1_0(r_dest, r_src);
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
		private final mcframe.serverMABS.MABSL0210.Srch01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt1R> down0;
		/** このオペレーションからの下り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt2R> down1;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_DEST_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_DEST_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_LOT_INH_DEST_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_DEST_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_LOT_INH_DEST_R> c0_down0;
		/**
		 * 連携情報 SELECT_SRC<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt; （{@link #c1}）<br>
		 */
		public final String SELECT_SRC = "SELECT_SRC";

		/**
		 * DBC連携 c1<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAM_LOT_INH_SRC_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAM_LOT_INH_SRC_R&gt; （{@link #c1_down0}）<br>
		 */
		public final MCDBSubOperation<MAM_LOT_INH_SRC_R> c1;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAM_LOT_INH_SRC_R> c1_down0;
		
		// コンストラクタ
		protected Srch01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0210.Srch01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0210.Srch01_Rslt1R.class);
			down1 = MCList.create(mcframe.serverMABS.MABSL0210.Srch01_Rslt2R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAM_LOT_INH_DEST_R.create("T1"));
			c1 = MCController.create(MAM_LOT_INH_SRC_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAM_LOT_INH_DEST_R>)c0.down(0);
			c1_down0 = (MCList<MAM_LOT_INH_SRC_R>)c1.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
			appendOpe(SELECT_SRC, c1);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 * SELECT_SRC<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
			if (key.equals(SELECT_SRC)) {
				up_SELECT_SRC();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAM_LOT_INH_DEST_R&gt;（{@link #c0_down0}）=> down0()<br>
		 * SELECT_SRC<br>
		 * MCList&lt;MAM_LOT_INH_SRC_R&gt;（{@link #c1_down0}）=> down1()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
			if (key.equals(SELECT_SRC)) {
				down_SELECT_SRC(down1(), c1_down0);
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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
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
		public mcframe.serverMABS.MABSL0210.Srch01_CndR createSrch01_CndR(){
			return mcframe.serverMABS.MABSL0210.Srch01_CndR.create();
		}

		/**
		 * Srch01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.Srch01_Rslt1R createSrch01_Rslt1R(){
			return mcframe.serverMABS.MABSL0210.Srch01_Rslt1R.create();
		}

		/**
		 * Srch01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt1R> createSrch01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL0210.Srch01_Rslt1R.class);
		}

		/**
		 * Srch01_Rslt2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.Srch01_Rslt2R createSrch01_Rslt2R(){
			return mcframe.serverMABS.MABSL0210.Srch01_Rslt2R.create();
		}

		/**
		 * Srch01_Rslt2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt2R> createSrch01_Rslt2L(){
			return MCList.create(mcframe.serverMABS.MABSL0210.Srch01_Rslt2R.class);
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
		 * 	<tr><td><br></td><td>st_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>st_dt_to</td></tr>
		 * 	<tr><td><br></td><td>end_dt_fr</td></tr>
		 * 	<tr><td><br></td><td>end_dt_to</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>off_del_flg</td></tr>
		 * 	<tr><td><br></td><td>on_del_flg</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0210.Srch01_CndR
		 */
		public mcframe.serverMABS.MABSL0210.Srch01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>par_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>wg_nm</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col_nm</td></tr>
		 * 	<tr><td><br></td><td>overflow_err_flg</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt1R> down0() {
			return down0;
		}

		/**
		 * 下り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
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
		public MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt2R> down1() {
			return down1;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}
		//-----------------------SELECT_SRC専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECT_SRCの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT_SRC(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt1R> dest_Srch01_Rslt1, MCList<MAM_LOT_INH_DEST_R> src0_0){
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("par_itm_nm", "par_itm_nm");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("wg_nm", "wg_nm");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("lot_inh_typ", "lot_inh_typ");
				addColumnPathMap("add_concat_col", "add_concat_col");
				addColumnPathMap("overflow_err_flg", "overflow_err_flg");
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
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0210.Srch01_Rslt1R r_dest, MAM_LOT_INH_DEST_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt1R> dest, MCList<MAM_LOT_INH_DEST_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAM_LOT_INH_DEST_R r_src : src){
				mcframe.serverMABS.MABSL0210.Srch01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------SELECT_SRC専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECT_SRCの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT_SRC(MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt2R> dest_Srch01_Rslt2, MCList<MAM_LOT_INH_SRC_R> src0_0){
			down_SELECT_SRC_c1_0(dest_Srch01_Rslt2, src0_0);
		}

		/**
		 * 連携処理SELECT_SRC_c1の下りブロック0のRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_down_SELECT_SRC_c1_0() {
			MCRowMapper map = new Map_down_SELECT_SRC_c1_0();
			return map;
		}

		/**
		 * 連携処理SELECT_SRC_c1の下りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_down_SELECT_SRC_c1_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("chd_itm_nm", "chd_itm_nm");
				addColumnPathMap("chd_itm_typ", "chd_itm_typ");
				addColumnPathMap("chd_itm_typ_d_cd", "chd_itm_typ_d_cd");
				addColumnPathMap("chd_itm_typ_d_nm", "chd_itm_typ_d_nm");
				addColumnPathMap("prio", "prio");
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
		 * 連携処理SELECT_SRC_c1の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_SRC_c1_0(mcframe.serverMABS.MABSL0210.Srch01_Rslt2R r_dest, MAM_LOT_INH_SRC_R r_src) {
		}

		/**
		 * 連携処理SELECT_SRC_c1の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_SRC_c1_0(MCList<mcframe.serverMABS.MABSL0210.Srch01_Rslt2R> dest, MCList<MAM_LOT_INH_SRC_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_SRC_c1_0();
			for(MAM_LOT_INH_SRC_R r_src : src){
				mcframe.serverMABS.MABSL0210.Srch01_Rslt2R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_SRC_c1_0(r_dest, r_src);
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
		private final MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> up0;
		/** このオペレーションへの上り電文パラメータの第1ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> up1;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhSrc_UpdChk01 （{@link #chk02}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhSrc_Upd01 （{@link #upd01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhSrc_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhSrc_UpdChk01 chk02;
		/**
		 * 連携オペレーション upd01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhSrc_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhSrc_Upd01 upd01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> chk02_up0;
		public final MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> upd01_up0;
		// 連携ロジック下り
		/**
		 * 連携情報 CALL_OPE02<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhDest_UpdChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhDest_Upd01 （{@link #upd02}）<br>
		 */
		public final String CALL_OPE02 = "CALL_OPE02";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhDest_UpdChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhDest_UpdChk01 chk01;
		/**
		 * 連携オペレーション upd02<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhDest_Upd01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInhDest_Upd01 upd02;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> upd02_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Upd01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
			up1 = MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk02 = mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.crtLotInhSrc_UpdChk01();
			upd01 = mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.crtLotInhSrc_Upd01();
			chk01 = mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.crtLotInhDest_UpdChk01();
			upd02 = mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.crtLotInhDest_Upd01();
			
			// 連携オペレーションのコンテナ取得
			chk02_up0 = (MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR>)chk02.up(0);
			upd01_up0 = (MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR>)upd01.up(0);
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR>)chk01.up(0);
			upd02_up0 = (MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR>)upd02.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk02);
			appendOpe(CALL_OPE01, upd01);
			appendOpe(CALL_OPE02, chk01);
			appendOpe(CALL_OPE02, upd02);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR&gt; （{@link #chk02_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR&gt; （{@link #upd01_up0}）<br>
		 * CALL_OPE02<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up1() => MCList&lt;mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR&gt; （{@link #upd02_up0}）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(CALL_OPE01)) {
				up_CALL_OPE01(chk02_up0, upd01_up0, up0());
			}
			if (key.equals(CALL_OPE02)) {
				up_CALL_OPE02(chk01_up0, upd02_up0, up1());
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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Upd01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR createUpd01_Dtl1R(){
			return mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> createUpd01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR.class);
		}

		/**
		 * Upd01_Dtl2ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR createUpd01_Dtl2R(){
			return mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.create();
		}

		/**
		 * Upd01_Dtl2ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> createUpd01_Dtl2L(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> up0() {
			return up0;
		}

		/**
		 * 上り電文の第1ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第1ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_typ</td></tr>
		 * 	<tr><td><br></td><td>add_concat_col</td></tr>
		 * 	<tr><td><br></td><td>overflow_err_flg</td></tr>
		 * 	<tr><td><br></td><td>memo1</td></tr>
		 * 	<tr><td><br></td><td>memo2</td></tr>
		 * 	<tr><td><br></td><td>memo3</td></tr>
		 * 	<tr><td><br></td><td>del_flg</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> up1() {
			return up1;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src_Upd01_Dtl1){
			up_CALL_OPE01_chk02_0(dest0_0, src_Upd01_Dtl1);
			up_CALL_OPE01_upd01_0(dest1_0, src_Upd01_Dtl1);
		}
		
		/**
		 * 連携処理CALL_OPE01_chk02の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE01_chk02_0() {
			MCRowMapper map = new Map_up_CALL_OPE01_chk02_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE01_chk02の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE01_chk02_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("del_flg", "del_flg");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk02の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk02_0(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk02_0(MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk02_0();
			for(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_chk02_0(r_dest, r_src);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("prio", "prio");
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
		protected void up_CALL_OPE01_upd01_0(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_upd01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_upd01_0(MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_upd01_0();
			for(mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0210.LotInhSrc_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE01_upd01_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
		//-----------------------CALL_OPE02専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE02の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE02(MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> src_Upd01_Dtl2){
			up_CALL_OPE02_chk01_0(dest0_0, src_Upd01_Dtl2);
			up_CALL_OPE02_upd02_0(dest1_0, src_Upd01_Dtl2);
		}
		
		/**
		 * 連携処理CALL_OPE02_chk01の上りブロック0のためのRowMapperを作成する。<p>
		 *
		 * @return MCRowMapper
		 */
		public MCRowMapper createMap_up_CALL_OPE02_chk01_0() {
			MCRowMapper map = new Map_up_CALL_OPE02_chk01_0();
			return map;
		}

		/**
		 * 連携処理CALL_OPE02_chk01の上りブロック0のためのRowMapperクラス。<p>
		 */
		public class Map_up_CALL_OPE02_chk01_0 extends MCRowMapper {
			@Override
			protected void setupColumnPathMap() {
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("lot_inh_typ", "lot_inh_typ");
				addColumnPathMap("add_concat_col", "add_concat_col");
				addColumnPathMap("overflow_err_flg", "overflow_err_flg");
				addColumnPathMap("memo1", "memo1");
				addColumnPathMap("memo2", "memo2");
				addColumnPathMap("memo3", "memo3");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE02_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE02_chk01_0(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_chk01_0(MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_chk01_0();
			for(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				up_CALL_OPE02_chk01_0(r_dest, r_src);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("lot_inh_typ", "lot_inh_typ");
				addColumnPathMap("add_concat_col", "add_concat_col");
				addColumnPathMap("overflow_err_flg", "overflow_err_flg");
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
		protected void up_CALL_OPE02_upd02_0(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_dest, mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE02_upd02の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE02_upd02_0(MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE02_upd02_0();
			for(mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0210.LotInhDest_UpdChk01_DtlR r_dest = dest.createRow();
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
	abstract public class Del01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLDeleter {
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
		private final MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> up0;
		
		/**
		 * 連携情報 CALL_OPE01<p>
		 *
		 * 連携先 mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInh_DelChk01 （{@link #chk01}）<br>
		 * 連携先 mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInh_Del01 （{@link #del01}）<br>
		 */
		public final String CALL_OPE01 = "CALL_OPE01";

		/**
		 * 連携オペレーション chk01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInh_DelChk01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInh_DelChk01 chk01;
		/**
		 * 連携オペレーション del01<p>
		 *
		 * 連携オペレーションクラス {@link mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInh_Del01}<br>
		 * 第1 上りブロッククラス MCList&lt;mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
		 */
		public final mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.LotInh_Del01 del01;
		// 連携ロジック上り
		public final MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> chk01_up0;
		public final MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> del01_up0;
		// 連携ロジック下り
		
		// コンストラクタ
		protected Del01() {
			
			// このオペレーションのコンテナ初期化
			up0 = MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);

			// 連携オペレーションの初期化
			chk01 = mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.crtLotInh_DelChk01();
			del01 = mcframe.serverMABS.MABSL0210.MABSL_LotInhReg.crtLotInh_Del01();
			
			// 連携オペレーションのコンテナ取得
			chk01_up0 = (MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR>)chk01.up(0);
			del01_up0 = (MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR>)del01.up(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(CALL_OPE01, chk01);
			appendOpe(CALL_OPE01, del01);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * CALL_OPE01<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR&gt; （{@link #chk01_up0}）<br>
		 * up0() => MCList&lt;mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR&gt; （{@link #del01_up0}）<br>
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
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
		}
		/**
		 * Del01_Dtl1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR createDel01_Dtl1R(){
			return mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.create();
		}

		/**
		 * Del01_Dtl1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> createDel01_Dtl1L(){
			return MCList.create(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>upd_cntr</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> up0() {
			return up0;
		}




		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------CALL_OPE01専用up関連メソッド--------------------------
		/**
		 * オペレーショングループCALL_OPE01の連携処理の上りブロックを準備する。<p>
		 */
		protected void up_CALL_OPE01(MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> dest0_0, MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> dest1_0, MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> src_Del01_Dtl1){
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_chk01_0(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_chk01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_chk01_0(MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_chk01_0();
			for(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_dest = dest.createRow();
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("lot_inh_col_typ", "lot_inh_col_typ");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("upd_cntr", "upd_cntr");
			}
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void up_CALL_OPE01_del01_0(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_dest, mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_src) {
		}

		/**
		 * 連携処理CALL_OPE01_del01の上りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void up_CALL_OPE01_del01_0(MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> dest, MCList<mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR> src) {
			MCRowMapper _rm = createMap_up_CALL_OPE01_del01_0();
			for(mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_src : src){
				mcframe.serverMABS.MABSL0210.LotInh_DelChk01_DtlR r_dest = dest.createRow();
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
	/**
	 * Sprt01オペレーション.<p>
	 *
	 * 子品目展開処理を行う<br>
	 */
	abstract public class Sprt01 extends mcframe.serverMAUD.MAUDL6010.MAUDL_RLSearcher {
		/** 
		 * オペレーションID<p>
		 *
		 * オペレーションはモジュールIDとロジックIDとオペレーションIDによって一意に特定できます。<br>
		 * オペレーションインスタンスから参照する場合には{@link #getOperationID()}を使用してください。
		 */
		public static final String OPERATION_ID = "Sprt01";

		/** オペレーションIDを取得します。 */
		public String getOperationID(){ return OPERATION_ID; }

		//----------フィールド----------
		/** このオペレーションへの上り電文パラメータの第0ブロックのコンテナField定義 */
		private final mcframe.serverMABS.MABSL0210.Sprt01_CndR up0;
		/** このオペレーションからの下り電文パラメータの第0ブロックのコンテナField定義 */
		private final MCList<mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R> down0;
		
		/**
		 * 連携情報 SELECT<p>
		 *
		 * 連携先 MCDBSubOperation&lt;MAW_BOM_EX_R&gt; （{@link #c0}）<br>
		 */
		public final String SELECT = "SELECT";

		/**
		 * DBC連携 c0<p>
		 *
		 * DBC連携クラス MCDBSubOperation&lt;MAW_BOM_EX_R&gt;<br>
		 * 第1 下りブロッククラス MCList&lt;MAW_BOM_EX_R&gt; （{@link #c0_down0}）<br>
		 */
		public final MCDBSubOperation<MAW_BOM_EX_R> c0;
		// 連携ロジック上り
		// 連携ロジック下り
		public final MCList<MAW_BOM_EX_R> c0_down0;
		
		// コンストラクタ
		protected Sprt01() {
			
			// このオペレーションのコンテナ初期化
			up0 = mcframe.serverMABS.MABSL0210.Sprt01_CndR.create();
			down0 = MCList.create(mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R.class);

			// 連携オペレーションの初期化
			c0 = MCController.create(MAW_BOM_EX_R.create("T1"));
			
			// 連携オペレーションのコンテナ取得
			c0_down0 = (MCList<MAW_BOM_EX_R>)c0.down(0);

			// オペレーション、オペレーショングループの登録
			appendOpe(SELECT, c0);
		}

		/**
		 * 指定された連携処理の上りブロックを準備する。<p>
		 *
		 * SELECT<br>
		 * （上りブロック定義なし）<br>
		 */
		public void mapUpContainers(String key) {
			super.mapUpContainers(key);
			if (key.equals(SELECT)) {
				up_SELECT();
			}
		}

		/**
		 * 指定された連携処理の下りブロックから値をコピーする。<p>
		 *
		 * SELECT<br>
		 * MCList&lt;MAW_BOM_EX_R&gt;（{@link #c0_down0}）=> down0()<br>
		 */
		public void mapDownContainers(String key) {
			super.mapDownContainers(key);
			if (key.equals(SELECT)) {
				down_SELECT(down0(), c0_down0);
			}
		}

		public MCContainer up(int i) {
			if (i == 0) return up0();
			return null;
		}
		
		public MCContainer down(int i) {
			if (i == 0) return down0();
			return null;
		}

		public void exec() {
			clear();
			invoke((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this);
		}
		
		protected void clear() {
			down0().clear();
		}
		/**
		 * Sprt01_CndブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.Sprt01_CndR createSprt01_CndR(){
			return mcframe.serverMABS.MABSL0210.Sprt01_CndR.create();
		}

		/**
		 * Sprt01_Rslt1ブロックのRowコンテナを作成します。
		 *
		 * @return Rowコンテナ
		 */
		public mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R createSprt01_Rslt1R(){
			return mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R.create();
		}

		/**
		 * Sprt01_Rslt1ブロックのListコンテナを作成します。
		 *
		 * @return Listコンテナ
		 */
		public MCList<mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R> createSprt01_Rslt1L(){
			return MCList.create(mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R.class);
		}

		//-------------------------外部 I/F--------------------------
		/**
		 * 上り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[上り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>base_dt</td></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>lot_inh_col_typ</td></tr>
		 * </table>
		 *
		 * @see mcframe.serverMABS.MABSL0210.Sprt01_CndR
		 */
		public mcframe.serverMABS.MABSL0210.Sprt01_CndR up0() {
			return up0;
		}


		/**
		 * 下り電文の第0ブロックのデータを格納するコンテナを取得します。<p>
		 *
		 * <table border=1 cellspacing=0 cellpadding=2 >
		 *  <caption>[下り第0ブロック項目]</caption>
		 * 	<tr bgcolor="#cccccc"><th>必須</th><th>項目名</th></tr>
		 * 	<tr><td><br></td><td>par_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>par_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>bom_ptn</td></tr>
		 * 	<tr><td><br></td><td>wg_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub1</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub2</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_sub3</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_nm</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_cd</td></tr>
		 * 	<tr><td><br></td><td>chd_itm_typ_d_nm</td></tr>
		 * 	<tr><td><br></td><td>prio</td></tr>
		 * 	<tr><td><br></td><td>st_dt</td></tr>
		 * 	<tr><td><br></td><td>end_dt</td></tr>
		 * </table>
		 *
		 * @see MCList
		 */
		public MCList<mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R> down0() {
			return down0;
		}



		@Override
		public MCOperationInfo getOperationInfo(){
			return ((MABSL_LotInhReg)MABSL_LotInhReg_MC_A.this).info;
		}

		//-----------------------SELECT専用up関連メソッド--------------------------
		/**
		 * オペレーショングループSELECTの連携処理の上りブロックを準備する。<p>
		 */
		protected void up_SELECT(){
		}

		//-----------------------SELECT専用down関連メソッド--------------------------

		/**
		 * オペレーショングループSELECTの連携処理の下りブロックを準備する。<p>
		 */
		protected void down_SELECT(MCList<mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R> dest_Sprt01_Rslt1, MCList<MAW_BOM_EX_R> src0_0){
			down_SELECT_c0_0(dest_Sprt01_Rslt1, src0_0);
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
				addColumnPathMap("par_itm_cd", "par_itm_cd");
				addColumnPathMap("par_itm_sub1", "par_itm_sub1");
				addColumnPathMap("par_itm_sub2", "par_itm_sub2");
				addColumnPathMap("par_itm_sub3", "par_itm_sub3");
				addColumnPathMap("bom_ptn", "bom_ptn");
				addColumnPathMap("wg_cd", "wg_cd");
				addColumnPathMap("chd_itm_cd", "chd_itm_cd");
				addColumnPathMap("chd_itm_sub1", "chd_itm_sub1");
				addColumnPathMap("chd_itm_sub2", "chd_itm_sub2");
				addColumnPathMap("chd_itm_sub3", "chd_itm_sub3");
				addColumnPathMap("chd_itm_nm", "chd_itm_nm");
				addColumnPathMap("chd_itm_typ", "chd_itm_typ");
				addColumnPathMap("chd_itm_typ_d_cd", "chd_itm_typ_d_cd");
				addColumnPathMap("chd_itm_typ_d_nm", "chd_itm_typ_d_nm");
				addColumnPathMap("prio", "prio");
				addColumnPathMap("st_dt", "st_dt");
				addColumnPathMap("end_dt", "end_dt");
			}
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListコピー時の各Rowコピーの際に実行されるメソッド。<p>
		 *
		 * @param r_dest コピー先のRow
		 * @param r_src コピー元のRow
		 */
		protected void down_SELECT_c0_0(mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R r_dest, MAW_BOM_EX_R r_src) {
		}

		/**
		 * 連携処理SELECT_c0の下りブロック0のListをコピーする。<p>
		 *
		 * コピー元のListの各Rowからコピー先のRowを生成しコピー先のListに追加する。
		 *
		 * @param dest コピー先のList
		 * @param src コピー元のList
		 */
		protected void down_SELECT_c0_0(MCList<mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R> dest, MCList<MAW_BOM_EX_R> src) {
			MCRowMapper _rm = createMap_down_SELECT_c0_0();
			for(MAW_BOM_EX_R r_src : src){
				mcframe.serverMABS.MABSL0210.Sprt01_Rslt1R r_dest = dest.createRow();
				_rm.copy(r_dest, r_src);
				down_SELECT_c0_0(r_dest, r_src);
				dest.add(r_dest);
			}
		}
	}

	//FMCB LOGIC_CONTROLLER END
}