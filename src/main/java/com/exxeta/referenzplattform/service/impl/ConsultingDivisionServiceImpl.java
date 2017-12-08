package com.exxeta.referenzplattform.service.impl;

import com.exxeta.referenzplattform.service.ConsultingDivisionService;
import com.exxeta.referenzplattform.domain.ConsultingDivision;
import com.exxeta.referenzplattform.repository.ConsultingDivisionRepository;
import com.exxeta.referenzplattform.service.dto.ConsultingDivisionDTO;
import com.exxeta.referenzplattform.service.mapper.ConsultingDivisionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Service Implementation for managing ConsultingDivision.
 */
@Service
@Transactional
public class ConsultingDivisionServiceImpl implements ConsultingDivisionService{

    private final Logger log = LoggerFactory.getLogger(ConsultingDivisionServiceImpl.class);

    private final ConsultingDivisionRepository consultingDivisionRepository;

    private final ConsultingDivisionMapper consultingDivisionMapper;

    public ConsultingDivisionServiceImpl(ConsultingDivisionRepository consultingDivisionRepository, ConsultingDivisionMapper consultingDivisionMapper) {
        this.consultingDivisionRepository = consultingDivisionRepository;
        this.consultingDivisionMapper = consultingDivisionMapper;
    }

    /**
     * Save a consultingDivision.
     *
     * @param consultingDivisionDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public ConsultingDivisionDTO save(ConsultingDivisionDTO consultingDivisionDTO) {
        log.debug("Request to save ConsultingDivision : {}", consultingDivisionDTO);
        ConsultingDivision consultingDivision = consultingDivisionMapper.toEntity(consultingDivisionDTO);
        consultingDivision = consultingDivisionRepository.save(consultingDivision);
        return consultingDivisionMapper.toDto(consultingDivision);
    }

    /**
     * Get all the consultingDivisions.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    @Override
    @Transactional(readOnly = true)
    public Page<ConsultingDivisionDTO> findAll(Pageable pageable) {
        log.debug("Request to get all ConsultingDivisions");
        return consultingDivisionRepository.findAll(pageable)
            .map(consultingDivisionMapper::toDto);
    }

    /**
     * Get one consultingDivision by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    @Transactional(readOnly = true)
    public ConsultingDivisionDTO findOne(Long id) {
        log.debug("Request to get ConsultingDivision : {}", id);
        ConsultingDivision consultingDivision = consultingDivisionRepository.findOne(id);
        return consultingDivisionMapper.toDto(consultingDivision);
    }

    /**
     * Delete the consultingDivision by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete ConsultingDivision : {}", id);
        consultingDivisionRepository.delete(id);
    }
}
