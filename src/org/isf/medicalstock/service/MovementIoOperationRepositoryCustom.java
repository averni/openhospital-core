package org.isf.medicalstock.service;


import java.util.GregorianCalendar;
import java.util.List;

import org.isf.medicalstock.service.MedicalStockIoOperations.MovementOrder;


public interface MovementIoOperationRepositoryCustom {

	List<Integer> findtMovementWhereDatesAndId(String wardId, GregorianCalendar dateFrom, GregorianCalendar dateTo);

	List<Integer> findtMovementWhereData(Integer medicalCode, String medicalType, String wardId, String movType,
			GregorianCalendar movFrom, GregorianCalendar movTo, GregorianCalendar lotPrepFrom,
			GregorianCalendar lotPrepTo, GregorianCalendar lotDueFrom, GregorianCalendar lotDueTo);

	List<Integer> findtMovementForPrint(String medicalDescription, String medicalTypeCode, String wardId,
			String movType, GregorianCalendar movFrom, GregorianCalendar movTo, String lotCode, MovementOrder order);
	
}
